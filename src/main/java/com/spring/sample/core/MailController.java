package com.spring.sample.core;

import javax.annotation.Resource;
import javax.mail.MessagingException;

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
   public MailController(MailSender mailSender) {
		this.mailSender = mailSender;
	}
	
	@RequestMapping("/mail")	
	public String sendMail() throws MessagingException
	{
		mailSender.send("naresh.k@cngl.ie","Some Subject","the Content");
		
		return "mail Sent";
	}

}
