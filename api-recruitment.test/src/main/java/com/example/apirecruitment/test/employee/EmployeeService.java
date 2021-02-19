package com.example.apirecruitment.test.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee updateEmployee(Employee updateEmployeeData, Long id) {
        return employeeRepository.findById(id)
                .map(employee -> {
                    if(updateEmployeeData.getFull_name() != null) {
                        employee.setFull_name(updateEmployeeData.getFull_name());
                    }
                    if(updateEmployeeData.getSalary() != 0) {
                        employee.setSalary(updateEmployeeData.getSalary());
                    }
                    if(updateEmployeeData.getDob() != null) {
                        employee.setDob(updateEmployeeData.getDob());
                    }
                    return employeeRepository.save(employee);
                })
                .orElseThrow(() -> new EmployeeNotFoundException(id));
    }

    public Iterable<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException(id));
    }

    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }

    public Employee insertNewEmployee(Employee newEmployee) {
        return employeeRepository.save(newEmployee);
    }
}
