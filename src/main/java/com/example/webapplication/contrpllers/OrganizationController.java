package com.example.webapplication.contrpllers;

import com.example.webapplication.models.Organization;
import com.example.webapplication.services.impl.OrganizationServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
* Handles HTTP requests related to organization
* */

@RestController
@RequestMapping("/api")
@Profile({"dev", "prod"})
public class OrganizationController {

    private final OrganizationServices organizationServices;

    @Autowired
    public OrganizationController(OrganizationServices organizationServices) {
        this.organizationServices = organizationServices;
    }

    @GetMapping("/organization")
    public List<Organization> getAllOrganizations(@RequestParam(required = false) String search) {
        if (search != null && !search.isEmpty()) {
            return organizationServices.searchOrganizations(search);
        } else {
            return organizationServices.getAllOrganization();
        }
    }

    @GetMapping("/organizations/{id}")
    public Organization getOrganizationById(@PathVariable Long id) {
        return organizationServices.getOrganizationById(id);
    }
}
