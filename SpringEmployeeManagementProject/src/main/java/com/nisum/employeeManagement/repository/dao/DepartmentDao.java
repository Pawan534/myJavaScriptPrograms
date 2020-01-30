package com.nisum.employeeManagement.repository.dao;

import com.nisum.employeeManagement.domain.Department;

import java.util.List;

public interface DepartmentDao {
    int create(Department department);
    void update(Department department);
    void delete(Department department);
    Department read(int id);
    List<Department> read();
}
