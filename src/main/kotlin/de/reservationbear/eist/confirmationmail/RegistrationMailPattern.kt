//Source: https://www.youtube.com/watch?v=QwQuro7ekvc
package de.reservationbear.eist.confirmationmail

import org.springframework.stereotype.Service
import java.util.*

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
     * @param reservationId     id from the reservation
     */
    fun sendMail(mailAddress: String, name: String, reservationId: UUID) {
        //No such endpoint - do we want to approve mail addresses?
        val link = "http://localhost:8080/api/reservation/${reservationId}/"
        mailSender.send(
            mailAddress,
            buildEmail(name.split(" ")[0], link),
            "Confirmation of your mail address",
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
            <div style="font-family:Helvetica,Arial,sans-serif;font-size:16px;margin:0;color:#0b0c0c">
<span style="display:none;font-size:1px;color:#fff;max-height:0"></span>
  <table role="presentation" width="100%" style="border-collapse:collapse;min-width:100%;width:100%!important" cellpadding="0" cellspacing="0" border="0">
    <tbody><tr>
      <td width="100%" height="53" bgcolor="#81a1c1">
        <table role="presentation" width="100%" style="border-collapse:collapse;max-width:580px" cellpadding="0" cellspacing="0" border="0" align="center">
          <tbody><tr>
            <td width="70" bgcolor="#81a1c1" valign="middle">
                <table role="presentation" cellpadding="0" cellspacing="0" border="0" style="border-collapse:collapse">
                  <tbody><tr>
                    <td style="padding-left:10px">
                    </td>
                    <td style="font-size:28px;line-height:1.315789474;Margin-top:4px;padding-left:10px">
                      <span style="font-family:Helvetica,Arial,sans-serif;font-weight:700;color:#ffffff;text-decoration:none;vertical-align:top;display:inline-block">Confirm your email</span>
                    </td>
                  </tr>
                </tbody></table>
              </a>
            </td>
          </tr>
        </tbody></table>    
      </td>
    </tr>
  </tbody></table>
  <table role="presentation" class="m_-6186904992287805515content" align="center" cellpadding="0" cellspacing="0" border="0" style="border-collapse:collapse;max-width:580px;width:100%!important" width="100%">
    <tbody><tr>
      <td width="10" height="10" valign="middle"></td>
      <td>
                <table role="presentation" width="100%" cellpadding="0" cellspacing="0" border="0" style="border-collapse:collapse">
                  <tbody><tr>
                    <td bgcolor="#2e3440" width="100%" height="10"></td>
                  </tr>
                </tbody></table>
      </td>
      <td width="10" valign="middle" height="10"></td>
    </tr>
  </tbody></table>
  <table role="presentation" class="m_-6186904992287805515content" align="center" cellpadding="0" cellspacing="0" border="0" style="border-collapse:collapse;max-width:580px;width:100%!important" width="100%">
    <tbody><tr>
      <td height="30"><br></td>
    </tr>
    <tr>
      <td width="10" valign="middle"><br></td>
      <td style="font-family:Helvetica,Arial,sans-serif;font-size:19px;line-height:1.315789474;max-width:560px">
            <p style="Margin:0 0 20px 0;font-size:19px;line-height:25px;color:#2e3440c">Hi $name,</p><p style="Margin:0 0 20px 0;font-size:19px;line-height:25px;color:#2e3440"> Thank you for booking through our service. Below you will find a link to confirm your email address: </p><blockquote style="Margin:0 0 20px 0;border-left:10px solid #2e3440;padding:15px 0 0.1px 15px;font-size:19px;line-height:25px"><p style="Margin:0 0 20px 0;font-size:19px;line-height:25px;color:#2e3440c"> <a href="$link" style="color: #88c0d0">Click here for confirmation</a> </p></blockquote>
Once you have confirmed your email address via this link, you will receive another email one day before your reservation where you have to confirm your reservation one last time.
<p>Have a nice day</p>        
<p>Your Eistbären team</p>   
      </td>
      <td width="10" valign="middle"><br></td>
    </tr>
    <tr>
      <td height="30"><br></td>
    </tr>
  </tbody></table><div class="yj6qo"></div><div class="adL">
</div></div>
"""
    }
}
