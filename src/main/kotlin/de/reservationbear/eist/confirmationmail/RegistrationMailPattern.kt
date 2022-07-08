//Source: https://www.youtube.com/watch?v=QwQuro7ekvc
package de.reservationbear.eist.confirmationmail

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
     * Method that calls the mailSender.send method to send the mail
     *
     * @param mailAddress       Address for Mail
     * @param name              name of the recipient
     * @param reservation       reservation
     */
    fun sendMail(mailAddress: String, name: String, url: URL, reservation: Reservation) {
        //No such endpoint - do we want to approve mail addresses?
        val link: String = if (url.port == -1) {
            "${url.host}/reservation-details/${reservation.id}"
        } else {
            "${url.host + ":" + url.port}/reservation-details/${reservation.id}"
        }

        //List of Emojis for Title
        //val icons = arrayOf("🍚", "🥗", "🍕", "🍔", "🍝", "🍰", "🧇", "🌮", "🥙", "🍣", "🥗", "🍺", "🍹", "🍷")

        val type: RestaurantType =
            reservation.restaurantTables?.stream()?.findFirst()?.get()?.restaurant?.type ?: RestaurantType.GERMAN
        val icon = type.getEmojis()
        mailSender.send(
            mailAddress,
            buildEmail(name.split(" ")[0], link),
            "$icon Confirmation of your reservation (${reservation.id})",
            null
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
	<h1 style="color: white; text-align: center; font-size: 40px; padding-top: 7px; font-family: Helvetica,Arial,sans-serif; margin-top: 0; margin-block-end: 0;">
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
				Click here to see your dashboard
			</a>
		</p>
	</blockquote>
    <p style="margin: 0 0 20px 0; font-size: 19px; line-height: 25px; color: #2e3440;">
	24 hours before your reservation date you will receive another email where you have to confirm your reservation one last time (this can be done up to 12 hours before).
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
