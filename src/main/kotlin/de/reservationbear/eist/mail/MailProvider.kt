//Source: https://www.youtube.com/watch?v=QwQuro7ekvc
package de.reservationbear.eist.mail

import de.reservationbear.eist.service.ReservationService
import lombok.AllArgsConstructor
import org.slf4j.LoggerFactory
import org.springframework.mail.javamail.JavaMailSender
import org.springframework.mail.javamail.MimeMessageHelper
import org.springframework.scheduling.annotation.Async
import org.springframework.stereotype.Service
import java.util.*
import javax.mail.MessagingException

/**
 * Mailprovider for building and sending mails
 */
@Service
@AllArgsConstructor
class MailProvider(val mailSender: JavaMailSender, val reservationService: ReservationService) : MailSender {

    companion object {
        private val LOGGER = LoggerFactory
            .getLogger(MailProvider::class.java)
    }

    /**
     * method to sending mails
     *
     * @param to        Address for Mail
     * @param email     E-Mail text
     * @param subject   title of mail
     */
    @Throws(IllegalStateException::class)
    @Async
    override fun send(to: String?, email: String?, subject: String?, reservationUUID: UUID?) {
        try {
            val mimeMessage = mailSender.createMimeMessage()
            val helper = MimeMessageHelper(mimeMessage, true, "utf-8")
            helper.setText(email!!, true)
            helper.setTo(to!!)
            helper.setSubject(subject ?: "Info")
            helper.setFrom("reservations@reservation-bear.de", "Reservation-Bear.de")
            if (reservationUUID != null) {
                helper.addAttachment("reservation.ics", reservationService.getICSResource(reservationUUID))
            }
            mailSender.send(mimeMessage)
        } catch (e: MessagingException) {
            LOGGER.error("Failed to send email", e)
            throw IllegalStateException("Failed to send email")
        }
    }
}
