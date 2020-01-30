package com.nisum.employeeManagement.repository.Rowmapper;

import com.nisum.employeeManagement.domain.Employee;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class EmployeeRowMapper implements RowMapper<Employee> {

    @Override
    public Employee mapRow(ResultSet resultSet, int i) throws SQLException {
        Employee emp = new Employee();
        emp.setEmployeeId(resultSet.getInt(1));
        emp.setFirstName(resultSet.getString(2));
        emp.setLastName(resultSet.getString(3));
        return emp;
    }
}
