package com.worksphere.core.EmplyooRegistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.worksphere.core.EmplyooRegistration.model.Address;

public interface AddressRepository extends JpaRepository<Long,Address>{
    
}
