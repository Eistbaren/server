//Source: https://www.youtube.com/watch?v=QwQuro7ekvc
package de.reservationbear.eist.mail

import de.reservationbear.eist.db.entity.Reservation
import de.reservationbear.eist.db.type.RestaurantType
import org.springframework.stereotype.Service
import java.net.URL

/**
 * Pattern for sending a registration mail
 */
@Service
class CancellationMailPattern(val mailSender: MailSender) {

    /**
     * Send a cancellation mail to the user
     *
     * @param mailAddress           The mail address of the user
     * @param name                  The name of the user
     * @param cancellationReason    The reason for the cancellation
     * @param reservation           The reservation to be cancelled
     *
     */
    fun sendMail(mailAddress: String, name: String, cancellationReason: String, reservation: Reservation) {
        mailSender.send(
            mailAddress,
            buildEmail(name.split(" ")[0], cancellationReason),
            "❌ Reservation cancellation (${reservation.id})",
            reservation.id
        )
    }

    /**
     * Mail text that will be sent (HTML Mail)
     *
     * @param name                  name of the recipient
     * @param cancellationReason    reason why the reservation was canceled
     * @return
     */
    private fun buildEmail(name: String, cancellationReason: String): String {
        return """
<div style="width: 100%; background-color: #81a1c1;">
	<h1 style="color: white; text-align: center; font-size: 40px; padding-top: 7px; font-family: Helvetica,Arial,sans-serif; margin: 0 0 0 0; margin-block-end: 0;">
		Reservation cancellation
	</h1>
</div>
<div style="width: 90%; height: 20px; background-color: #2e3440; margin: auto auto;">
</div>
<div style="height: 40px;"></div>
<div style="width: 90%; margin: auto auto;">
	<p style="margin: 0 0 20px 0; font-size: 19px; line-height: 25px; color: #2e3440c;">
		Hi $name,
	</p>
	<p style="margin: 0 0 20px 0; font-size: 19px; line-height: 25px; color: #2e3440;">
		your reservation has been cancelled. Reason:         
    </p>
	<blockquote style="margin: 0 0 20px 0; border-left: 10px solid #2e3440; padding: 15px 0 0.1px 15px; font-size: 19px; line-height: 25px;">
		<p style="margin: 0 0 20px 0; font-size: 19px; line-height: 25px; color: #2e3440c;">
			<p style="color: #88c0d0;">
				$cancellationReason
			</p>
		</p>
	</blockquote>
    <p style="margin: 0 0 20px 0; font-size: 19px; line-height: 25px; color: #2e3440;">
	We hope to see you on our site again! 
    </p>
	<p style="font-size: 19px; color: #2e3440;">
		Have a nice day
	</p>
	<p style="font-size: 19px; color: #2e3440;">
		Your Eistbären team 🐻‍❄️
	</p>
</div>
"""
    }
}
