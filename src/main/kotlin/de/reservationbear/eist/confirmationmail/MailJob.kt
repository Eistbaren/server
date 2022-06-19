package de.reservationbear.eist.confirmationmail

import de.reservationbear.eist.db.entity.Reservation
import de.reservationbear.eist.service.ReservationService
import org.slf4j.LoggerFactory
import org.springframework.context.annotation.Configuration
import org.springframework.scheduling.annotation.EnableScheduling
import org.springframework.scheduling.annotation.Scheduled
import java.sql.Timestamp
import java.time.Instant
import java.util.concurrent.TimeUnit

@Configuration
@EnableScheduling
class MailJob(val reservationService: ReservationService, val confirmationMailPattern: ConfirmationMailPattern) {

    companion object {
        private val LOGGER = LoggerFactory
            .getLogger(MailService::class.java)
    }

    //All 15 minutes
    @Scheduled(fixedRate = 10, timeUnit = TimeUnit.SECONDS)
    fun crawlDataBaseForSendingConfirmationMail() {
        val reservation: List<Reservation>? =
            reservationService.getReservationsForConfirmation(
                Timestamp(Timestamp.from(Instant.now()).time + 60 * 24 * 1000)
            )
        LOGGER.info("Database is crawled to send confirmation mails: ${reservation?.size?: 0} reservation/s where found")
        if (reservation != null) {
            for (element in reservation) {
                try {
                    confirmationMailPattern.sendMail(element.userEmail, element.userName, "1234")
                    element.sendConfirmation = true
                }catch (e: IllegalStateException) {
                    element.sendConfirmation = false
                }
                reservationService.saveReservation(element)
            }
        }
    }
}