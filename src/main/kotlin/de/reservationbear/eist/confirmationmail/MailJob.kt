package de.reservationbear.eist.confirmationmail

import de.reservationbear.eist.db.entity.Reservation
import de.reservationbear.eist.service.ReservationService
import org.slf4j.LoggerFactory
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Service
import java.sql.Timestamp
import java.time.Instant
import java.util.concurrent.TimeUnit

@Service
class MailJob(val reservationService: ReservationService, val confirmationMailPattern: ConfirmationMailPattern) {

    companion object {
        private val LOGGER = LoggerFactory
            .getLogger(MailService::class.java)
    }

    //All 15 minutes
    @Scheduled(fixedRate = 60, timeUnit = TimeUnit.MINUTES)
    fun crawlDataBaseForSendingConfirmationMail() {
        LOGGER.info("Database is crawled to send confirmation mails")
        val reservation: List<Reservation>? =
            reservationService.getReservationsForConfirmation(
                Timestamp(Timestamp.from(Instant.now()).time + 60 * 24 * 1000)
            )
        if (reservation != null) {
            for (i in 0..reservation.size) {
                val res = reservation[i]
                try {
                    confirmationMailPattern.sendMail(res.userEmail, res.userName, "1234")
                    res.sendConfirmation = true
                }catch (e: IllegalStateException) {
                    res.sendConfirmation = false
                }
                reservationService.saveReservation(res)
            }
        }
    }
}