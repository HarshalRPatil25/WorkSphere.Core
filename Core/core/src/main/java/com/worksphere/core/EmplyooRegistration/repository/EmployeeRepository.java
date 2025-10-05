package com.worksphere.core.EmplyooRegistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.worksphere.core.EmplyooRegistration.model.Employee;

public interface EmployeeRepository extends JpaRepository<Long,Employee>{
    
}
