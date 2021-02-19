package com.example.apirecruitment.test.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/employee/{id}")
    public @ResponseBody Employee updateEmployee(@RequestBody Employee updateEmployeeData, @PathVariable Long id) {
        return employeeService.updateEmployee(updateEmployeeData, id);
    }

    @GetMapping("/employee")
    public @ResponseBody Iterable<Employee> getAllEmployee() {
        return employeeService.getAllEmployee();
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {
        return employeeService.getEmployeeById(id);
    }

    @DeleteMapping("/employee/{id}")
    public void deleteEmployee(@PathVariable Long id){
        employeeService.deleteEmployee(id);
    }

    @PutMapping("/employee")
    public @ResponseBody Employee insertNewEmployee(@RequestBody Employee newEmployee) {
        return employeeService.insertNewEmployee(newEmployee);
    }

}
