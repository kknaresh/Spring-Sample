package com.spring.simple.mail;

public interface MailSender {

public abstract	void send(String to, String subject, String body);
	

}