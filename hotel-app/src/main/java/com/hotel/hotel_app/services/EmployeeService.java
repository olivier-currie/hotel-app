package com.hotel.hotel_app.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hotel.hotel_app.models.Employee;
import com.hotel.hotel_app.repositories.EmployeeRepository;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public void deleteEmployee(Long employeeID) {
        employeeRepository.deleteById(employeeID);
    }
}
