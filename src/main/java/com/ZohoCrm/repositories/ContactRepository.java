package com.ZohoCrm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ZohoCrm.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
