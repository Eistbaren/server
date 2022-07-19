package de.reservationbear.eist.job

import de.reservationbear.eist.db.entity.Reservation
import de.reservationbear.eist.mail.MailProvider
import de.reservationbear.eist.service.MailService
import de.reservationbear.eist.service.ReservationService
import org.slf4j.LoggerFactory
import org.springframework.context.annotation.Configuration
import org.springframework.scheduling.annotation.EnableScheduling
import org.springframework.scheduling.annotation.Scheduled
import java.util.concurrent.TimeUnit


/**
 * Mailservice for deleting reservations that were not confirmed in time.
 */
@Configuration
@EnableScheduling
class DeleteReservationsJob(val reservationService: ReservationService, val mailService: MailService) {

    companion object {
        private val LOGGER = LoggerFactory
            .getLogger(MailProvider::class.java)
    }

    /**
     * Crawls all reservations from DB and removes those that are not confirmed in time.
     * Checks every minute
     **/
    @Scheduled(fixedRate = 1, timeUnit = TimeUnit.MINUTES)
    fun crawlDataBaseForSendingConfirmationMail() {
        val reservation: List<Reservation>? =
            reservationService.getReservationsForDeletion()
        LOGGER.debug("Found ${reservation?.size} reservations for deletion")
        if (reservation != null) {
            for (element in reservation) {
                try {
                    reservationService.deleteReservation(
                        element.id!!,
                        "Reservation has been canceled by ths system because it was not confirmed in time."
                    )
                } catch (e: IllegalStateException) {
                    LOGGER.error("Could not delete reservation with id ${element.id}")
                }
            }
        }
    }
}
