package com.app.controller;

import javax.validation.ValidationException;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.mail.EmailConfig;
import com.app.mail.Feedback;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {
	
	private EmailConfig emailConfig;
	
	public FeedbackController(EmailConfig emailConfig) {
		this.emailConfig = emailConfig;
	}
	
	@RequestMapping
	public void sendFeedback(@RequestBody Feedback feedback,
			BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
			throw new ValidationException("Feedback is not valid");
		}
		
		//create mail sender
		JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
		mailSender.setHost(this.emailConfig.getHost());
		mailSender.setPort(this.emailConfig.getPort());
		mailSender.setUsername(this.emailConfig.getUsername());
		mailSender.setPassword(this.emailConfig.getPassword());
		
		//create email instance
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		mailMessage.setFrom(feedback.getEmail());
		mailMessage.setTo("rc@email.com");
		mailMessage.setSubject("Verify Your Account"+ feedback.getName());
		mailMessage.setTo(feedback.getFeedback());
		
		//send mail
		mailSender.send(mailMessage);
		
		
	}
}
