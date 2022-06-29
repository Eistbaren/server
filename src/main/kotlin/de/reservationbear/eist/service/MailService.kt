package de.reservationbear.eist.service

import de.reservationbear.eist.confirmationmail.ConfirmationMailPattern
import de.reservationbear.eist.confirmationmail.RegistrationMailPattern
import org.springframework.stereotype.Service
import java.util.*

/**
 * Mailservice with methods for sending different mails
 */
@Service
class MailService(val confirmationMailPattern: ConfirmationMailPattern, val registrationMailPattern: RegistrationMailPattern) {


    /**
     * Sends the registration mail - should be called after a successful registration
     *
     * @param userEmail         mail address from the user
     * @param userName          name of the user
     * @param reservationId     id of the corresponding reservation
     */
    fun sendRegistrationMail(userEmail: String, userName: String, reservationId: UUID, ){
        registrationMailPattern.sendMail(
            userEmail,
            userName,
            reservationId
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
    fun sendConfirmationMail(userEmail: String, userName: String, reservationId: UUID, confirmationToken: UUID){
        confirmationMailPattern.sendMail(
            userEmail,
            userName,
            reservationId,
            confirmationToken,
        )
    }
}