package com.worksphere.core.EmplyooRegistration.model;


import java.time.LocalDate;

import com.worksphere.core.CustomAnnotation.AgeValidation.MinAge;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "employees")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Basic Details
    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @MinAge(21)
    private LocalDate dateOfBirth;

    // Contact Info
    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, unique = true, length = 15)
    private String phoneNumber;

  
    
}
