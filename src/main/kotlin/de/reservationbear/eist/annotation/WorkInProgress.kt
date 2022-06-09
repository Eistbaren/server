package de.reservationbear.eist.annotation

/**
 * Marks all Methods that are WorkInProgress/Mocks
 * Will be implemented in the future
 */
@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION)
@MustBeDocumented
annotation class WorkInProgress(
    val message: String
)
