package com.nisum.employeeManagement.repository.Rowmapper;

import com.nisum.employeeManagement.domain.Department;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DepartmentRowMapper implements RowMapper<Department> {
    @Override
    public Department mapRow(ResultSet resultSet, int i) throws SQLException {
        Department dept = new Department();
        dept.setDepartmentId(resultSet.getInt(1));
        dept.setDepartmentName(resultSet.getString(2));
        dept.setDeptShortCut(resultSet.getString(3));
        return dept;
    }
}
