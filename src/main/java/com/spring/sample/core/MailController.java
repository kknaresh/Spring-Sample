package com.spring.sample.core;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.simple.mail.MailSender;
import com.spring.simple.mail.MockMailSender;

@RestController
public class MailController {

	// instance of mail sender service
private MailSender mailSender = new MockMailSender();
	
	//Request Handler Method
@RequestMapping("/mail")	

public String sendMail()
{
	mailSender.send("abc@example.com","Some Subject","the content");
	
	return "Mail Sent";
}
	
	

}
