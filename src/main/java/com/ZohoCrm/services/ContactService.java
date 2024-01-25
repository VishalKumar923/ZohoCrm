package com.ZohoCrm.services;

import java.util.List;

import com.ZohoCrm.entities.Contact;

public interface ContactService {
public void saveLead(Contact contact);

public List<Contact> getAllContacts();

public Contact findById(long id);
}
