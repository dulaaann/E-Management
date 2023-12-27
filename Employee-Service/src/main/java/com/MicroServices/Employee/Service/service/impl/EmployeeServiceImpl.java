package com.MicroServices.Employee.Service.service.impl;

import com.MicroServices.Employee.Service.dto.EmployeeDto;
import com.MicroServices.Employee.Service.entity.Employee;
import com.MicroServices.Employee.Service.repository.EmployeeRepository;
import com.MicroServices.Employee.Service.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService
{
    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
        Employee employee = new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail()

        );

        Employee savedEmployee = employeeRepository.save(employee);

        EmployeeDto savedEmployeeDto = new EmployeeDto(
                savedEmployee.getId(),
                savedEmployee.getFirstName(),
                savedEmployee.getLastName(),
                savedEmployee.getEmail()
//                savedEmployee.getDepartmentCode()
        );
        return savedEmployeeDto;
    }
}
