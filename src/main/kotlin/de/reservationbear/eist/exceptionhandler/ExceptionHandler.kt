package de.reservationbear.eist.exceptionhandler

import lombok.extern.slf4j.Slf4j
import org.slf4j.LoggerFactory
import org.springframework.http.HttpStatus
import org.springframework.orm.jpa.JpaObjectRetrievalFailureException
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import java.sql.SQLException
import javax.persistence.EntityNotFoundException
import javax.servlet.http.HttpServletResponse

/**
 * Exception Handler - Important: Exceptions are captured here and are not thrown in the console
 */
@ControllerAdvice

class ExceptionHandler {

    //Manually implemented @Slf4j
    companion object {
        private val LOGGER = LoggerFactory
            .getLogger(ExceptionHandler::class.java)
    }

    /**
     * handles JpaObjectRetrievalFailureExceptions (searched objects are not found in the persistent layer) -
     * params gets injected by Spring Boot. When an JpaObjectRetrievalFailureException occurs the method
     * will catch it and returns the errorcode and message in the json-response.
     *
     * @param ex JpaObjectRetrievalFailureException injected by SpringBoot
     * @param response HttpServletResponse from the request that triggered an exception
     */
    @ExceptionHandler(value = [JpaObjectRetrievalFailureException::class])
    fun onApiException(ex: JpaObjectRetrievalFailureException, response: HttpServletResponse): Unit =
        response.sendError(HttpStatus.BAD_REQUEST.value(), ex.message)

    /**
     * handles EntityNotFoundExceptions (searched objects are not found in the persistent layer) -
     * params gets injected by Spring Boot. When an EntityNotFoundExceptions occurs the method
     * will catch it and returns the errorcode and message in the json-response.
     *
     * @param ex EntityNotFoundExceptions injected by SpringBoot
     * @param response HttpServletResponse from the request that triggered an exception
     */
    @ExceptionHandler(value = [EntityNotFoundException::class])
    fun onApiException(ex: EntityNotFoundException, response: HttpServletResponse): Unit =
        response.sendError(HttpStatus.BAD_REQUEST.value(), ex.message)

    /**
     * handles SQLExceptions (DB exceptions - mostly server-sided issues) -
     * params gets injected by Spring Boot. When an SQLException occurs the method
     * will catch it and returns the errorcode and message in the json-response. Also it will print a
     * warning in the console.
     *
     * @param ex SQLException injected by SpringBoot
     * @param response HttpServletResponse from the request that triggered an exception
     */
    @ExceptionHandler(value = [SQLException::class])
    fun onSQLException(ex: SQLException, response: HttpServletResponse) {
        LOGGER.error("Error logging in: {}" + ex.message)
        response.sendError(HttpStatus.INTERNAL_SERVER_ERROR.value(), ex.message)
    }

    /**
     * handles ApiExceptions - params gets injected by Spring Boot. When a NotImplementedError occurs
     * the method will catch it and returns the errorcode and message in the json-response
     *
     * @param ex NotImplementedError injected by SpringBoot
     * @param response HttpServletResponse from the request that triggered an exception
     */
    @ExceptionHandler(value = [NotImplementedError::class])
    fun onNotImplemented(ex: NotImplementedError, response: HttpServletResponse): Unit =
        response.sendError(HttpStatus.NOT_IMPLEMENTED.value(), "This endpoint is not implemented yet")

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

}
