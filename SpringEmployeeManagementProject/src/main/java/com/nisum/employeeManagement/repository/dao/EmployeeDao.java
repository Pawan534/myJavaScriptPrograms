package com.nisum.employeeManagement.repository.dao;

import com.nisum.employeeManagement.domain.Employee;

import java.util.List;

public interface EmployeeDao {
    int create(Employee employee);
    void update(Employee employee);
    void delete(Employee employee);;
    Employee read(int id);
    List<Employee> read();
}
