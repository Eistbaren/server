//Source: https://www.youtube.com/watch?v=QwQuro7ekvc
package de.reservationbear.eist.confirmationmail

interface MailSender {
    fun send(to: String?, email: String?, subject: String?)
}