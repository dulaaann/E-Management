package com.MicroServices.Employee.Service.service;

import com.MicroServices.Employee.Service.dto.ApiResponseDto;
import com.MicroServices.Employee.Service.dto.EmployeeDto;

public interface EmployeeService
{
    EmployeeDto saveEmployee(EmployeeDto employeeDto);
    ApiResponseDto getEmployeeById(Long id);
}
