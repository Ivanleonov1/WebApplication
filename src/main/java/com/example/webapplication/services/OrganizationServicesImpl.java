package com.example.webapplication.services;

import com.example.webapplication.exceptions.NotFoundException;
import com.example.webapplication.models.Organization;
import com.example.webapplication.repositories.OrganizationRepository;
import com.example.webapplication.services.impl.OrganizationServices;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizationServicesImpl implements OrganizationServices {

    private final OrganizationRepository organizationRepository;

    public OrganizationServicesImpl(OrganizationRepository organizationRepository) {
        this.organizationRepository = organizationRepository;
    }

    @Override
    public List<Organization> getAllOrganization() {
        return organizationRepository.findAll();
    }

    @Override
    public List<Organization> searchOrganizations(String search) {
        return organizationRepository.findBySearchString(search);
    }

    @Override
    public Organization getOrganizationById(Long id) {
        return organizationRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Organization not found" + id));
    }
}
