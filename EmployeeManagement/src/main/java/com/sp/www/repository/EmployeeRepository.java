package com.sp.www.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sp.www.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>
{
	
}

