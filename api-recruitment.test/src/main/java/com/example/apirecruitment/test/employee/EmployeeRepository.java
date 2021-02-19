package com.example.apirecruitment.test.employee;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository
        extends CrudRepository<Employee, Long> {
}
