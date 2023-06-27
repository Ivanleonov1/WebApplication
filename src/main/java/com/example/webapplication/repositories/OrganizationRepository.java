package com.example.webapplication.repositories;

import com.example.webapplication.models.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrganizationRepository extends JpaRepository<Organization, Long> {

    List<Organization> findBySearchString(String search);
}
