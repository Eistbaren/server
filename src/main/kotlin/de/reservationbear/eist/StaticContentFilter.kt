package de.reservationbear.eist

import org.springframework.stereotype.Component
import java.io.IOException
import java.io.InputStream
import javax.servlet.*
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

// Source: https://stackoverflow.com/questions/68178610/serve-static-folder-with-spring-boot-and-react-router
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

    @Throws(IOException::class, ServletException::class)
    override fun doFilter(request: ServletRequest?, response: ServletResponse?, chain: FilterChain?) {
        (request as HttpServletRequest?)?.let {
            (response as HttpServletResponse?)?.let { it1 ->
                if (chain != null) {
                    doFilterPrivate(
                        it,
                        it1, chain
                    )
                }
            }
        }
    }

    @Throws(IOException::class, ServletException::class)
    private fun doFilterPrivate(request: HttpServletRequest, response: HttpServletResponse, chain: FilterChain) {
        val path: String = request.servletPath
        val isApi = path.startsWith("/api")
        val isResourceFile = !isApi && fileExtensions.stream().anyMatch { s: CharSequence? -> path.contains(s!!) }
        if (isApi) {
            chain.doFilter(request, response)
        } else if (isResourceFile) {
            resourceToResponse("static/dist/$path", response)
        } else {
            resourceToResponse("static/dist/index.html", response)
        }
    }

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