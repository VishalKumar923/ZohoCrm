package com.ZohoCrm.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
@Component
public class EmailServiceImpl implements EmailService{
	@Autowired
	private JavaMailSender javaMailSender;

	@Override
	public void sendSimpleMail(String to, String sub, String emailBody) {
		SimpleMailMessage simpleMailMessage=new SimpleMailMessage();
		simpleMailMessage.setTo(to);
		simpleMailMessage.setSubject(sub);
		simpleMailMessage.setText(emailBody);
		javaMailSender.send(simpleMailMessage);
	}

}
