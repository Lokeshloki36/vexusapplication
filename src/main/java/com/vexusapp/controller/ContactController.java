package com.vexusapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.vexusapp.entities.Billing;
import com.vexusapp.entities.Contact;
import com.vexusapp.service.BillService;
import com.vexusapp.service.ContactService;

@Controller
public class ContactController {

	@Autowired
	private ContactService contactService;
	
	@Autowired
	private BillService billService;
	
	@RequestMapping("/listContacts")
	public String getAllContacts(Model model){
		List<Contact> contacts = contactService.getAllContacts();
		model.addAttribute("contacts", contacts);
		return "list_contacts";
	}
	@RequestMapping("/createBill")
	public String createBill(@RequestParam("id") long id,Model model) {
		Contact contact = contactService.getContactById(id);
		 model.addAttribute("contact", contact);
		return "generate_bill";
	}
	
	@RequestMapping("/saveBill")
	public String generateBill(Billing billing,Model model) {
		billService.saveBill(billing);
		List<Billing> allBills = billService.getAllBills();
		model.addAttribute("bills", allBills);
		return "list_bills";
	}
	
	@RequestMapping("/listBills")
	public String listBills(Model model) {
		List<Billing> allBills = billService.getAllBills();
		model.addAttribute("bills", allBills);
		return "list_bills";
	}
}
