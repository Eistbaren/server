package de.reservationbear.eist

import org.springframework.stereotype.Component
import java.io.IOException
import java.io.InputStream
import javax.servlet.*
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

/**
 * Filtert jeden Request nach unserer Konfiguration
 * Aufgebaut von: https://stackoverflow.com/questions/68178610/serve-static-folder-with-spring-boot-and-react-router
 */
@Component
class StaticContentFilter : Filter {
    private val fileExtensions: List<String> = listOf(
        "html",
        "js",
        "json",
        "csv",
        "css",
        "png",
        "svg",
        "eot",
        "ttf",
        "woff",
        "appcache",
        "jpg",
        "jpeg",
        "gif",
        "ico"
    )

    /**
     * Nimmt den ursprüngliche Anfrage und schickt diese durch unsere Filter
     * @param request Die ursprüngliche Anfrage an den Server
     * @param response Die Antwort des Servers
     * @param filterChain Die standardmäßigen Filter von Spring Boot
     */
    @Throws(IOException::class, ServletException::class)
    override fun doFilter(request: ServletRequest?, response: ServletResponse?, filterChain: FilterChain?) {
        (request as HttpServletRequest?)?.let { servletRequest ->
            (response as HttpServletResponse?)?.let { servletResponse ->
                if (filterChain != null) {
                    doFilterReservationbear(
                        servletRequest,
                        servletResponse, filterChain
                    )
                }
            }
        }
    }

    /**
     * Filtert die Serveranfrage
     * @param request Die ursprüngliche Anfrage an den Server
     * @param response Die Antwort des Servers
     * @param filterChain Die standardmäßigen Filter von Spring Boot
     */
    @Throws(IOException::class, ServletException::class)
    private fun doFilterReservationbear(
        request: HttpServletRequest,
        response: HttpServletResponse,
        filterChain: FilterChain
    ) {
        val path: String = request.servletPath
        val isApi = path.startsWith("/api")
        val isResourceFile = !isApi && fileExtensions.stream().anyMatch { s: CharSequence? -> path.contains(s!!) }
        if (isApi) {
            filterChain.doFilter(request, response)
        } else if (isResourceFile) {
            resourceToResponse("static/dist/$path", response)
        }
        // Handle '/'-case
        else {
            resourceToResponse("static/dist/index.html", response)
        }
    }

    /**
     * Holt eine statische Ressource
     * @param resourcePath Der Pfad zur gesuchten Ressource
     * @param response Die Serverantwort
     */
    @Throws(IOException::class)
    private fun resourceToResponse(resourcePath: String, response: HttpServletResponse) {
        val inputStream: InputStream? = Thread.currentThread()
            .contextClassLoader
            .getResourceAsStream(resourcePath)
        if (inputStream == null) {
            response.sendError(503, "Die Datei $resourcePath konnte nicht gefunden werden")
            return
        }
        inputStream.transferTo(response.outputStream)
    }
}