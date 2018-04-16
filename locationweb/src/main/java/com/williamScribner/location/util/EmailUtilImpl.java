package com.williamScribner.location.util;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class EmailUtilImpl implements EmailUtil {
	
	@Autowired
	private JavaMailSender sender;

	@Override
	public void sendEmail(String toAddress, String subject, String body) {
		//mime multi purpose internet mail extensions
		MimeMessage message = sender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message);
		
		//helper throws an exception immediately
		try {
			helper.setTo(toAddress);
			helper.setText(body);
			helper.setSubject(subject);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		sender.send(message);
		
		
	}

}
