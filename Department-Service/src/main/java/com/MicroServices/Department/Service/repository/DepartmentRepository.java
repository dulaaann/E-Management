package com.MicroServices.Department.Service.repository;

import com.MicroServices.Department.Service.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long>
{
    Department findByDepartmentCode(String code);
}
