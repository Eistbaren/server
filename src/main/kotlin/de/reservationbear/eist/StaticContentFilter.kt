package de.reservationbear.eist

import org.springframework.stereotype.Component
import java.io.IOException
import java.io.InputStream
import javax.servlet.*
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

/**
 * Filter every Request by our own configuration
 * Build on: https://stackoverflow.com/questions/68178610/serve-static-folder-with-spring-boot-and-react-router
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
     * Takes the server request and returns a suitable response
     * @param request the initial server request
     * @param response the response to the client
     * @param filterChain the default filter chain of spring boot
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
     * Applies our own filter configuration
     * @param request the initial server request
     * @param response the response to the client
     * @param filterChain the default filter chain of spring boot
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
            if (path == "/api" || path == "/api/") {
                resourceToResponse("api/index.html", response)
            } else if (path == "/api/swagger.yaml") {
                resourceToResponse("api/swagger.yaml", response)
            } else {
                filterChain.doFilter(request, response)
            }
        } else if (isResourceFile) {
            resourceToResponse("static/dist/$path", response)
        }
        // Handle '/'-case
        else {
            resourceToResponse("static/dist/index.html", response)
        }
    }

    /**
     * Response with a static ressource. This bypasses the default static ressource handler
     * @param resourcePath the path to the requested ressource
     * @param response the file / error response of the server
     */
    @Throws(IOException::class)
    private fun resourceToResponse(resourcePath: String, response: HttpServletResponse) {
        val inputStream: InputStream? = Thread.currentThread()
            .contextClassLoader
            .getResourceAsStream(resourcePath)
        if (inputStream == null) {
            response.sendError(503, "The file $resourcePath could not be found.")
            return
        }
        inputStream.transferTo(response.outputStream)
    }
}
