package com.ZohoCrm.services;

import java.util.List;

import com.ZohoCrm.entities.Lead;

public interface LeadService {
public void saveLead(Lead lead);

public Lead findLeadById(long id);

public void deleteById(long id);

public List<Lead> getAllLead();
}
