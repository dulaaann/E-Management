package com.MicroServices.Department.Service.service;

import com.MicroServices.Department.Service.dto.DepartmentDto;

public interface DepartmentService
{
    DepartmentDto saveDepartment(DepartmentDto departmentDto);
    DepartmentDto getDepartmentByCode(String code);
}
