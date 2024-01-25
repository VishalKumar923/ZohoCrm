package com.ZohoCrm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ZohoCrm.entities.Lead;
import com.ZohoCrm.repositories.LeadRepository;

@Service
public class LeadServiceImpl implements LeadService  {
	@Autowired
	private LeadRepository leadRepo;
	

	@Override
	public void saveLead(Lead lead) {
		leadRepo.save(lead);		
	}


	@Override
	public Lead findLeadById(long id) {
		Optional<Lead> findById = leadRepo.findById(id);
		Lead lead = findById.get();
		return lead;
	}


	@Override
	public void deleteById(long id) {
		leadRepo.deleteById(id);		
	}


	@Override
	public List<Lead> getAllLead() {
		List<Lead> lead = leadRepo.findAll();	
		
		return lead;
	}

}
