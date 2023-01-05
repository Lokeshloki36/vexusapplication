package com.vexusapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.vexusapp.entities.Contact;
import com.vexusapp.entities.Lead;
import com.vexusapp.service.ContactService;
import com.vexusapp.service.LeadService;

@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadService;
	
	@Autowired
	private ContactService contactService;
	

	
	@RequestMapping(value="/createLead",method=RequestMethod.GET)
	public String viewCreateLeadForm() {
		return "create_lead";
	}
	
	@RequestMapping(value="/saveLead",method=RequestMethod.POST)
	public String saveLead(@ModelAttribute("lead") Lead lead,Model model) {
		leadService.saveOneLead(lead);
		model.addAttribute("lead", lead);
		return "lead_info";
	}
	
	@RequestMapping(value="/convertLead",method=RequestMethod.POST)
	public String convertLead(@RequestParam("id") long id,Model model) {
		Lead lead = leadService.getLeadById(id);
		
		Contact contact = new Contact();
		contact.setFirstName(lead.getFirstName());
		contact.setLastName(lead.getLastName());
		contact.setEmail(lead.getEmail());
		contact.setMobile(lead.getMobile());
		contact.setSource(lead.getSource());
		
		contact.getFirstName();
	
		contactService.saveContact(contact);
		
		
		leadService.deleteLeadById(id);
		
		List<Contact> contacts = contactService.getAllContacts();
		model.addAttribute("contacts", contacts);
		return "list_contacts";
	}
	
	@RequestMapping("/listLeads")
	public String getAllLeads(Model model){
		List<Lead> leads = leadService.getAllLeads();
		model.addAttribute("leads", leads);
		return "list_leads";
	}
	
	@RequestMapping("/leadInfo")
	public String leadInfo(@RequestParam("id") long id,Model model) {
		Lead lead = leadService.getLeadById(id);
		model.addAttribute("lead", lead);
		return "lead_info";
	}
}
