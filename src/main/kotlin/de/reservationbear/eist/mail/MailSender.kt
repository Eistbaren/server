//Source: https://www.youtube.com/watch?v=QwQuro7ekvc
package de.reservationbear.eist.mail

import de.reservationbear.eist.db.entity.Reservation

/**
 * Interface for the Mail-Sender - if we want to switch the Sender implementation it can be done over the interface
 */
interface MailSender {
    /**
     * method to sending mails
     *
     * @param to        Address for Mail
     * @param email     E-Mail text
     * @param subject   title of mail
     */
    fun send(to: String?, email: String?, subject: String?, reservation: Reservation?)
}
