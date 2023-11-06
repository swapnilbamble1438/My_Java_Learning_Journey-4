package com.Email_Sending;


import java.io.File;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Preparing to send message" );
        
        String message="Hello, Dear this is message for security check.";
        String subject = "Email Sending App : Confirmation";        
        String to = "swapnilbamble4@gmail.com";        
        String from = "swapnilbamble77786@gmail.com";
        
        sendEmail(message,subject,to,from);
        
      //  sendEmailwithAttachment(message,subject,to,from);
          
    }
   
	// this method is responsible to send email with text type only
	private static void sendEmail(String message, String subject, String to, String from) {

		//variable for gmail host
		String host="smtp.gmail.com";
		
		//get the system properties
		Properties properties = System.getProperties();
		
		System.out.println("properties: " + properties);
		
		// setting important information to properties object
		
		//host set 
		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.port","465");
		properties.put("mail.smtp.ssl.enable", "true");
		properties.put("mail.smtp.auth", "true");
		
		// Step 1: to get the session object...
	Session session = Session.getInstance(properties,new Authenticator() {

			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				
				return new PasswordAuthentication("swapnilbamble77786@gmail.com","Your 16 digit App password for gmail");
			}
					
		});
	
		session.setDebug(true);
	
		// Step 2: compose the message [text,multimedia]
		
		MimeMessage m = new MimeMessage(session);
		
		try {
		// from email
		m.setFrom(from);
		
		// adding recipient to message
		m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
		
		//adding subject to message
		m.setSubject(subject);
		
		// adding text to message
		m.setText(message);
		
		// send
		
		// Step 3: send the message usin Transport class
		Transport.send(m);
		
		System.out.println("Email send successfully.....");
		
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	// this method is responsible to send email with attachment
	 private static void sendEmailwithAttachment(String message, String subject, String to, String from) {
			

			//variable for gmail host
			String host="smtp.gmail.com";
			
			//get the system properties
			Properties properties = System.getProperties();
			
			System.out.println("properties: " + properties);
			
			// setting important information to properties object
			
			//host set 
			properties.put("mail.smtp.host", host);
			properties.put("mail.smtp.port","465");
			properties.put("mail.smtp.ssl.enable", "true");
			properties.put("mail.smtp.auth", "true");
			
			// Step 1: to get the session object...
		Session session = Session.getInstance(properties,new Authenticator() {

				@Override
				protected PasswordAuthentication getPasswordAuthentication() {
					
					return new PasswordAuthentication("swapnilbamble77786@gmail.com","Your 16 digit App password for Gmail");
				}
						
			});
		
			session.setDebug(true);
		
			// Step 2: compose the message [text,multimedia]
			
			MimeMessage m = new MimeMessage(session);
			
			try {
			// from email
			m.setFrom(from);
			
			// adding recipient to message
			m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			
			//adding subject to message
			m.setSubject(subject);
			
			// adding attachment to message
			//file path
			String path = "C:\\fullstackjava\\Project\\contact.png";
			
			MimeMultipart mimeMultipart = new MimeMultipart(); // it contains both file and text
			
			MimeBodyPart textMime = new MimeBodyPart();
			MimeBodyPart fileMime = new MimeBodyPart();
			
			try {
				
				textMime.setText(message);
				
				File file = new File(path);
				fileMime.attachFile(file);
				
				mimeMultipart.addBodyPart(textMime);
				mimeMultipart.addBodyPart(fileMime);
				
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			m.setContent(mimeMultipart);
			
			
			// send
			
			// Step 3: send the message usin Transport class
			Transport.send(m);
			
			System.out.println("Email send successfully.....");
			
			
			}catch (Exception e) {
				e.printStackTrace();
			}
			
		 
		}
	
	
	
}
