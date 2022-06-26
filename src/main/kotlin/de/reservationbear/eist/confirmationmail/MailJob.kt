package de.reservationbear.eist.confirmationmail

import de.reservationbear.eist.db.entity.Reservation
import de.reservationbear.eist.service.ReservationService
import org.slf4j.LoggerFactory
import org.springframework.context.annotation.Configuration
import org.springframework.scheduling.annotation.EnableScheduling
import org.springframework.scheduling.annotation.Scheduled
import java.sql.Timestamp
import java.time.Instant
import java.util.*
import java.util.concurrent.TimeUnit


/**
 * Mailservice for sending the mails one day before the due date of a reservation
 */
@Configuration
@EnableScheduling
class MailJob(val reservationService: ReservationService, val confirmationMailPattern: ConfirmationMailPattern) {

    companion object {
        private val LOGGER = LoggerFactory
            .getLogger(MailService::class.java)
    }

    /**
     * Crawls all reservations from DB and send mails to the ones, which due date is in one day.
     * Checks every ten minutes
     **/
    @Scheduled(fixedRate = 10, timeUnit = TimeUnit.SECONDS)
    fun crawlDataBaseForSendingConfirmationMail() {
        val time = Timestamp.from(Instant.now()).time + 60 * 60 * 24 * 1000
        val reservation: List<Reservation>? =
            reservationService.getReservationsForConfirmation(
                Timestamp(time)
            )
        LOGGER.info("Database is crawled to send confirmation mails: ${reservation?.size ?: 0} reservation/s where found")
        if (reservation != null) {
            for (element in reservation) {
                try {
                    val confirmationToken: UUID? = UUID.randomUUID()
                    confirmationMailPattern.sendMail(
                        element.userEmail,
                        element.userName,
                        confirmationToken.toString(),
                        element.id
                    )
                    element.confirmationToken = confirmationToken
                    element.sendConfirmation = true
                } catch (e: IllegalStateException) {
                    element.sendConfirmation = false
                }
                reservationService.saveReservation(element)
            }
        }
    }
}
