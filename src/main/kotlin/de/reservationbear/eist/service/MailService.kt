package de.reservationbear.eist.service

import de.reservationbear.eist.db.entity.Reservation
import de.reservationbear.eist.mail.CancellationMailPattern
import de.reservationbear.eist.mail.ConfirmationMailPattern
import de.reservationbear.eist.mail.RegistrationMailPattern
import org.springframework.stereotype.Service
import java.net.URL
import java.util.*

/**
 * Mailservice with methods for sending different mails
 */
@Service
class MailService(
    val confirmationMailPattern: ConfirmationMailPattern,
    val registrationMailPattern: RegistrationMailPattern,
    val cancellationMailPattern: CancellationMailPattern
) {


    /**
     * Sends the registration mail - should be called after a successful registration
     *
     * @param userEmail         mail address from the user
     * @param userName          name of the user
     * @param reservation       corresponding reservation
     */
    fun sendRegistrationMail(userEmail: String, userName: String, url: URL, reservation: Reservation) {
        registrationMailPattern.sendMail(
            userEmail,
            userName,
            url,
            reservation
        )
    }

    /**
     * Sends the confirmation mail
     *
     * @param userEmail         mail address from the user
     * @param userName          name of the user
     * @param reservationId     id of the corresponding reservation
     * @param confirmationToken confirmation token for confirming the mail
     */
    fun sendConfirmationMail(
        userEmail: String,
        userName: String,
        url: URL,
        reservationId: UUID,
        confirmationToken: UUID
    ) {
        confirmationMailPattern.sendMail(
            userEmail,
            userName,
            url,
            reservationId,
            confirmationToken,
        )
    }

    /**
     * Sends the cancellation mail
     *
     * @param userEmail             mail address from the user
     * @param userName              name of the user
     * @param cancellationReason    reason for the cancellation
     * @param reservation           corresponding reservation
     */
    fun sendCancellationMail(userEmail: String, userName: String, cancellationReason: String, reservation: Reservation) {
        cancellationMailPattern.sendMail(
            userEmail,
            userName,
            cancellationReason,
            reservation
        )
    }
}
