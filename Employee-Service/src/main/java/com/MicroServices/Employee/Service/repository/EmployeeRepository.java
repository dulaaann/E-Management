package com.MicroServices.Employee.Service.repository;

import com.MicroServices.Employee.Service.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long>
{
    
}
