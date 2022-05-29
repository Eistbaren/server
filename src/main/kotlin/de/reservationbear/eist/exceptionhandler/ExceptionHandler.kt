package de.reservationbear.eist.exceptionhandler

import de.reservationbear.eist.exceptions.ApiException
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import javax.servlet.http.HttpServletResponse

/**
 * Exception Handler - Important: Exceptions are captured here and are not thrown in the console
 */
@ControllerAdvice
class DefaultExceptionHandler {

    /**
     * handles ApiExceptions - params gets injected by Spring Boot. When an APIException occurs
     * the method will catch it and returns the errorcode and message in the json-response
     *
     * @param ex ApiException injected by SpringBoot
     * @param response HttpServletResponse from the request that triggered an exception
     */
    @ExceptionHandler(value = [ApiException::class])
    fun onApiException(ex: ApiException, response: HttpServletResponse): Unit =
        response.sendError(ex.code, ex.message)

    /**
     * handles ApiExceptions - params gets injected by Spring Boot. When a NotImplementedError occurs
     * the method will catch it and returns the errorcode and message in the json-response
     *
     * @param ex NotImplementedError injected by SpringBoot
     * @param response HttpServletResponse from the request that triggered an exception
     */
    @ExceptionHandler(value = [NotImplementedError::class])
    fun onNotImplemented(ex: NotImplementedError, response: HttpServletResponse): Unit =
        response.sendError(HttpStatus.NOT_IMPLEMENTED.value())
}
