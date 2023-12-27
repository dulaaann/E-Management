package com.MicroServices.Employee.Service.controller;

import com.MicroServices.Employee.Service.dto.EmployeeDto;
import com.MicroServices.Employee.Service.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/employees")
public class EmployeeController
{
    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<EmployeeDto> saveEmployee(@RequestBody EmployeeDto employeeDto)
    {
        EmployeeDto savedEmployee = employeeService.saveEmployee(employeeDto);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }

//    @GetMapping("{id}")
//    public ResponseEntity<ApiResponseDto> getEmployee(@PathVariable Long id)
//    {
//        ApiResponseDto apiResponseDto = employeeService.getEmployeeById(id);
//        return new ResponseEntity<>(apiResponseDto,HttpStatus.OK);
//    }
}
