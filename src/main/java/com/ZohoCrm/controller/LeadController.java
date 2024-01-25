package com.ZohoCrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ZohoCrm.entities.Contact;
import com.ZohoCrm.entities.Lead;
import com.ZohoCrm.services.ContactService;
import com.ZohoCrm.services.LeadService;

@Controller
public class LeadController {
	@Autowired
	private LeadService leadService;
	@Autowired
	private ContactService contactService;
	@GetMapping("/viewCreateLeadPage")
public String viewCreateLeadPage() {
	return "Create_new_lead";
}
	@PostMapping("/save")
	public String saveLead(@ModelAttribute("lead")Lead lead,Model model) {
		leadService.saveLead(lead);
		model.addAttribute("lead", lead);
		return "lead_info";
	}
	@PostMapping("/convert")
	public String convertLead(@RequestParam("id") long id) {
		Lead lead=leadService.findLeadById(id);
		Contact contact=new Contact();
		contact.setFirstName(lead.getFirstName());
		contact.setLastName(lead.getLastName());
		contact.setEmail(lead.getEmail());
		contact.setMobile(lead.getMobile());
		contact.setSource(lead.getSource());
		contactService.saveLead(contact);;
		leadService.deleteById(id);
		
		return "";
	}
	@GetMapping("/listAll")
	public String getAllList(Model model) {
		List<Lead> leads = leadService.getAllLead();
		model.addAttribute("leads",leads);
		return"list_leads";
	}
	@RequestMapping("/leadInfo")
	public String LeadInfo(@RequestParam("id")long id,Model model) {
		Lead lead = leadService.findLeadById(id);
		model.addAttribute("lead",lead);
		return "lead_info";
		
	}
	
	

}