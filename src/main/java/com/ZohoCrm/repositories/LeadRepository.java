package com.ZohoCrm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ZohoCrm.entities.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
