package com.example.webapplication.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 * Represents an organization entity
 * */
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Organization")
public class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "short_name")
    private String shortName;

    @Column(name = "inn")
    private String inn;

    @Column(name = "orgn")
    private String orgn;

    @Column(name = "postal_address")
    private String postalAddress;

    @Column(name = "legal_address")
    private String legalAddress;

    @OneToOne(cascade = CascadeType.ALL)
    private Director generalDirector;


}
