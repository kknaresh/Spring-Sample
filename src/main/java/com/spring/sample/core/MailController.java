package com.spring.sample.core;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.sample.mail.MailSender;
import com.spring.sample.mail.MockMailSender;

@RestController
public class MailController {
	
	private MailSender mailSender;
	@Autowired
   public MailController(@Qualifier("smtpMailSender") MailSender mailSender) {
		this.mailSender = mailSender;
	}
	
	@RequestMapping("/mail")	
	public String sendMail()
	{
		mailSender.send("abc@example.com","Some Subject","the Content");
		
		return "mail Sent";
	}

}
