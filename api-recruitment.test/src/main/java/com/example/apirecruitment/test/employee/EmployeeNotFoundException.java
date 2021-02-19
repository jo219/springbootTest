package com.example.apirecruitment.test.employee;

public class EmployeeNotFoundException extends RuntimeException{

    public EmployeeNotFoundException(Long id) {
        super("Could not find employee " + id);
    }
}
