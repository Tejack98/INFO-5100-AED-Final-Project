/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userinterface;

import healthcare.mailUtil.EmailUtil;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;

/**
 *
 * @author Tejas
 */
public class SendMail {   
    
    public void sendUserRegisterEmail(String toEmail, String username, String userpassword){
        
        final String fromEmail = "choudharithit16e@student.mes.ac.in"; //requires valid gmail id
        final String password = "ndzidbcznbhmsint"; // correct password for gmail id
//		final String toEmail = "tejas.choudhari36@gmail.com"; // can be any email id 

        System.out.println("TLSEmail Start");
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.ssl.protocols", "TLSv1.2");
        props.put("mail.smtp.starttls.enable", "true");

        //create Authenticator object to pass in Session.getInstance argument
        Authenticator auth = new Authenticator() {
            //override the getPasswordAuthentication method
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, password);
            }
        };

        String subject = "Welcome to My Patient Healthcare System";
        Session session = Session.getInstance(props, auth);
        String msg = "Welcome to My Patient Healthcare System" + "Username " + username + " Password " + userpassword;
        
        try {
            EmailUtil.sendEmail(session, toEmail, subject, msg);
        } catch (Exception e) {
            System.out.println("Mail Exception");
        }

    }
    
}
