package com.ZohoCrm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ZohoCrm.entities.Contact;
import com.ZohoCrm.repositories.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService  {
	@Autowired
	private ContactRepository ContactRepo;

	@Override
	public void saveLead(Contact contact) {
		ContactRepo.save(contact);	
	}

	@Override
	public List<Contact> getAllContacts() {
		List<Contact> contacts = ContactRepo.findAll();
		return contacts;
	}

	@Override
	public Contact findById(long id) {
		Optional<Contact> findById = ContactRepo.findById(id);
		Contact contact = findById.get();
		return contact;
	}
	

	

}
