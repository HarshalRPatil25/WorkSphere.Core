package com.worksphere.core.EmplyooRegistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.worksphere.core.EmplyooRegistration.model.EmergencyContact;

public interface EmergencyContactRepository extends JpaRepository<Long,EmergencyContact>{
    
}
