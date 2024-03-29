//Source: https://www.youtube.com/watch?v=QwQuro7ekvc
package de.reservationbear.eist.mail

import de.reservationbear.eist.db.entity.Reservation
import org.springframework.stereotype.Service
import java.net.URL
import java.util.*

/**
 * Pattern for sending a confirmation mail for reservation
 */
@Service
class ConfirmationMailPattern(val mailSender: MailSender) {

    /**
     * Method that calls the mailSender.send method to send the mail
     * It sends the mail to finally confirm the mail
     *
     * @param mailAddress   Address for Mail
     * @param name          name of the recipient
     * @param url           url for the dashboard
     * @param reservation   reservation
     * @param token         token for confirm a reservation
     */
    fun sendMail(mailAddress: String, name: String, url: URL, reservation: Reservation, token: UUID) {
        //Link for confirmation side
        val link: String = if (url.port == -1) {
            "${url.host}/reservation-details/${reservation.id}?confirmationToken=${token}"
        } else {
            "${url.host + ":" + url.port}/reservation-details/${reservation.id}?confirmationToken=${token}"
        }
        mailSender.send(
            mailAddress,
            buildEmail(name.split(" ")[0], link),
            "✅ Confirmation of your reservation (${reservation.id})",
            reservation
        )
    }

    /**
     * Mail text that will be sent (HTML Mail)
     *
     * @param name name of the recipient
     * @param link link for the reservation
     * @return
     */
    private fun buildEmail(name: String, link: String): String {
        return """
<div style="width: 100%; background-color: #81a1c1;">
	<h1 style="color: white; text-align: center; font-size: 40px; padding-top: 7px; font-family: Helvetica,Arial,sans-serif; margin: 0 0 0 0; margin-block-end: 0;">
		Confirm your reservation
	</h1>
</div>
<div style="width: 90%; height: 20px; background-color: #2e3440; margin: auto auto;">
</div>
<div style="height: 40px;"></div>
<div style="width: 90%; margin: auto auto;">
	<p>
	</p>
	<p style="margin: 0 0 20px 0; font-size: 19px; line-height: 25px; color: #2e3440c;">
		Hi $name,
	</p>
	<p style="margin: 0 0 20px 0; font-size: 19px; line-height: 25px; color: #2e3440;">
		thanks for your reservation. Please confirm the reservation at the following link and you can enjoy your meal!
	</p>
	<blockquote style="margin: 0 0 20px 0; border-left: 10px solid #2e3440; padding: 15px 0 0.1px 15px; font-size: 19px; line-height: 25px;">
		<p style="margin: 0 0 20px 0; font-size: 19px; line-height: 25px; color: #2e3440c;">
			<a style="color: #88c0d0;" href="$link">
				 Click here to confirm your reservation
			</a>
		</p>
	</blockquote>
	<p style="margin: 0 0 20px 0; font-size: 19px; line-height: 25px; color: #2e3440;">
		Thank you for your trust in Reservation Bear. If you have any questions or problems, please contact our support team at any time by e-mail or directly by telephone.
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
