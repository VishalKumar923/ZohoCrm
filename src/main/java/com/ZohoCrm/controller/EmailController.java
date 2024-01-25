package com.ZohoCrm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ZohoCrm.dto.Email;
import com.ZohoCrm.util.EmailService;

@Controller
public class EmailController {
	@Autowired
	private EmailService emailService;
	
	@PostMapping("/sendEmail")
public String getEmailId(@RequestParam("email")String email,Model model) {
	model.addAttribute("email",email);
	return "compose_email";
}
	@PostMapping("/triggerEmail")
	public String triggerEmail(Email email,Model model) {
		emailService.sendSimpleMail(email.getEmail(), email.getSubject(), email.getContent());
		model.addAttribute("msg","Email sent");
		return "compose_email";
	}
}
