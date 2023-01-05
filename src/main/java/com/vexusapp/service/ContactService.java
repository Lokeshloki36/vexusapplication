package com.vexusapp.service;

import java.util.List;

import com.vexusapp.entities.Contact;

public interface ContactService {
	public void saveContact(Contact contact);

	public List<Contact> getAllContacts();

	public Contact getContactById(long id);
}
