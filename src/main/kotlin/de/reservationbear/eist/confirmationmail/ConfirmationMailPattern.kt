//Source: https://www.youtube.com/watch?v=QwQuro7ekvc
package de.reservationbear.eist.confirmationmail

import org.springframework.stereotype.Service
import java.util.*

/**
 * Pattern for sending a confirmation mail for reservation
 */
@Service
class ConfirmationMailPattern(val mailSender: MailSender) {

    /**
     * Method that calls the mailSender.send method to send the mail
     *
     * @param mailAddress   Address for Mail
     * @param name          name of the recipient
     * @param token         token for confirm a reservation
     */
    fun sendMail(mailAddress: String, name: String, token: String, uuid: UUID?) {
        //Link for confirmation side
        val link = "http://localhost:8080/$token"
        mailSender.send(
            mailAddress,
            buildEmail(name.split(" ")[0], link),
            "Confirmation of your reservation",
            uuid
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
                      <span style="font-family:Helvetica,Arial,sans-serif;font-weight:700;color:#ffffff;text-decoration:none;vertical-align:top;display:inline-block">Confirm your reservation</span>
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
            <p style="Margin:0 0 20px 0;font-size:19px;line-height:25px;color:#2e3440c">Hi $name,</p><p style="Margin:0 0 20px 0;font-size:19px;line-height:25px;color:#2e3440">in one day it will be time! Now you just have to confirm the reservation one last time at the following link and you can enjoy your meal tomorrow!</p><blockquote style="Margin:0 0 20px 0;border-left:10px solid #2e3440;padding:15px 0 0.1px 15px;font-size:19px;line-height:25px"><p style="Margin:0 0 20px 0;font-size:19px;line-height:25px;color:#2e3440c"> <a href="$link" style="color: #88c0d0">Click here for confirmation</a> </p></blockquote>
Thank you for your trust in Reservation Bear. If you have any questions or problems, please contact our support team at any time by e-mail or directly by telephone.
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
