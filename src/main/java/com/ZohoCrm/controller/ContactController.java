package com.ZohoCrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ZohoCrm.entities.Contact;
import com.ZohoCrm.services.ContactService;

@Controller
public class ContactController {
	@Autowired
	private ContactService contactService;
	
	@GetMapping("/listAllContacts")
	public String getAllList(Model model) {
		List<Contact> contacts = contactService.getAllContacts();
		model.addAttribute("contacts",contacts);
		return"Contacts_leads";
	}
	
	@GetMapping("/contactInfo")
	public String contactInfo(@RequestParam("id")long id,Model model) {
	Contact contact=contactService.findById(id);
	model.addAttribute("contact", contact);
		return"Contact_info";
	}
	
}
