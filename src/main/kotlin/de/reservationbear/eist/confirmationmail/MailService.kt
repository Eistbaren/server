//Source: https://www.youtube.com/watch?v=QwQuro7ekvc
package de.reservationbear.eist.confirmationmail

import lombok.AllArgsConstructor
import org.slf4j.LoggerFactory
import org.springframework.mail.javamail.JavaMailSender
import org.springframework.mail.javamail.MimeMessageHelper
import org.springframework.scheduling.annotation.Async
import org.springframework.stereotype.Service
import javax.mail.MessagingException
import kotlin.jvm.Throws

@Service
@AllArgsConstructor
class MailService(val mailSender: JavaMailSender) : MailSender {

    companion object {
        private val LOGGER = LoggerFactory
            .getLogger(MailService::class.java)
    }

    @Throws(IllegalStateException::class)
    @Async
    override fun send(to: String?, email: String?, subject: String?) {
        try {
            val mimeMessage = mailSender.createMimeMessage()
            val helper = MimeMessageHelper(mimeMessage, "utf-8")
            helper.setText(email!!, true)
            helper.setTo(to!!)
            helper.setSubject(subject ?: "Info")
            helper.setFrom("reservation@reservation-bear.de")
            mailSender.send(mimeMessage)
        } catch (e: MessagingException) {
            LOGGER.error("Failed to send email", e)
            throw IllegalStateException("Failed to send email")
        }
    }
}