package de.reservationbear.eist.job

import de.reservationbear.eist.mail.MailProvider
import de.reservationbear.eist.db.entity.Reservation
import de.reservationbear.eist.service.MailService
import de.reservationbear.eist.service.ReservationService
import org.slf4j.LoggerFactory
import org.springframework.context.annotation.Configuration
import org.springframework.scheduling.annotation.EnableScheduling
import org.springframework.scheduling.annotation.Scheduled
import java.net.URL
import java.util.*
import java.util.concurrent.TimeUnit


/**
 * Mailservice for sending the mails one day before the due date of a reservation
 */
@Configuration
@EnableScheduling
class ConfirmationMailJob(val reservationService: ReservationService, val mailService: MailService) {

    companion object {
        private val LOGGER = LoggerFactory
            .getLogger(MailProvider::class.java)
    }

    /**
     * Crawls all reservations from DB and send mails to the ones, which due date is in one day.
     * Checks every minute
     **/
    @Scheduled(fixedRate = 1, timeUnit = TimeUnit.MINUTES)
    fun crawlDataBaseForSendingConfirmationMail() {
        val reservation: List<Reservation>? =
            reservationService.getReservationsForConfirmation()
        LOGGER.debug("Database is crawled to send confirmation mails: ${reservation?.size ?: 0} reservation/s where found")
        if (reservation != null) {
            for (element in reservation) {
                try {
                    val confirmationToken: UUID = UUID.randomUUID()
                    mailService.sendConfirmationMail(
                        element.userEmail,
                        element.userName,
                        URL(element.urlFromRequest),
                        element,
                        confirmationToken
                    )
                    element.confirmationToken = confirmationToken
                    element.sendConfirmation = true
                    reservationService.saveReservation(element)
                } catch (e: IllegalStateException) {
                    element.sendConfirmation = false
                }
            }
        }
    }
}
