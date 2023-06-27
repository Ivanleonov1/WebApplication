package com.example.webapplication.services.impl;

import com.example.webapplication.models.Organization;

import java.util.List;

public interface OrganizationServices {

    List<Organization> getAllOrganization();

    List<Organization> searchOrganizations(String search);

    Organization getOrganizationById(Long id);
}
