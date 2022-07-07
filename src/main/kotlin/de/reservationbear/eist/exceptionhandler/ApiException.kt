package de.reservationbear.eist.exceptionhandler

/**
 * APIException created by Swagger. Can be thrown, if anything in the controller went wrong.
 * Is caught by the Exception Handler.
 */
class ApiException(msg: String, val code: Int) : Exception(msg)
