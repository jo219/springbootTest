package com.example.apirecruitment.test.employee;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Schema(description = "A class for every single employee database record")
@Entity
public class Employee {
    private @Id @GeneratedValue Long id;
    private String full_name;
    private String address;
    private LocalDate dob;
    private int role_id;
    private String role_name;
    private int salary;

    public Employee() {
    }

    public Employee(Long id,
                    String full_name,
                    String address,
                    LocalDate dob,
                    int role_id,
                    String role_name,
                    int salary) {
        this.id = id;
        this.full_name = full_name;
        this.address = address;
        this.dob = dob;
        this.role_id = role_id;
        this.role_name = role_name;
        this.salary = salary;
    }

    // constructors for employee update with POST request
    public Employee(String full_name) {
        this.full_name = full_name;
    }

    public Employee(LocalDate dob) {
        this.dob = dob;
    }

    public Employee(int salary) {
        this.salary = salary;
    }

    // constructor for insert new employee with PUT request
    public Employee(String full_name,
                    String address,
                    LocalDate dob,
                    int role_id,
                    int salary) {
        this.full_name = full_name;
        this.address = address;
        this.dob = dob;
        this.role_id = role_id;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", full_name='" + full_name + '\'' +
                ", address='" + address + '\'' +
                ", dob=" + dob +
                ", role_id=" + role_id +
                ", role_name='" + role_name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
