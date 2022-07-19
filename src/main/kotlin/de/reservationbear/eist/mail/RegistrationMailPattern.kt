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
class RegistrationMailPattern(val mailSender: MailSender) {

    /**
     * Method that calls the mailSender.send method to send the mail.
     * Mail sends the Reservation Confirmation
     *
     * @param mailAddress       Address for Mail
     * @param name              name of the recipient
     * @param url           url for the dashboard
     * @param reservation       reservation
     */
    fun sendMail(mailAddress: String, name: String, url: URL, reservation: Reservation) {
        val link: String = if (url.port == -1) {
            "${url.host}/reservation-details/${reservation.id}"
        } else {
            "${url.host + ":" + url.port}/reservation-details/${reservation.id}"
        }

        val type: RestaurantType =
            reservation.restaurantTables?.stream()?.findFirst()?.get()?.restaurant?.type ?: RestaurantType.GERMAN
        val icon = type.getEmojis()
        mailSender.send(
            mailAddress,
            buildEmail(name.split(" ")[0], link),
            "$icon Confirmation of your reservation (${reservation.id})",
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
		Reservation confirmation
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
		Thank you for booking through our service. Below you will find a link to your dashboard:
	</p>
	<blockquote style="margin: 0 0 20px 0; border-left: 10px solid #2e3440; padding: 15px 0 0.1px 15px; font-size: 19px; line-height: 25px;">
		<p style="margin: 0 0 20px 0; font-size: 19px; line-height: 25px; color: #2e3440c;">
			<a style="color: #88c0d0;" href="$link">
				Click here to view your reservation details
			</a>
		</p>
	</blockquote>
    <p style="margin: 0 0 20px 0; font-size: 19px; line-height: 25px; color: #2e3440;">
	You will receive another email with a confirmation link 24 hours before your appointment. Please note, that you have to confirm your reservation within 12 hours after that email.
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
