package com.nisum.employeeManagement.repository.Rowmapper;

import com.nisum.employeeManagement.domain.Department;
import com.nisum.employeeManagement.domain.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductRowMapper implements RowMapper<Product> {

    @Override
    public Product mapRow(ResultSet resultSet, int i) throws SQLException {
        Product prod = new Product();
        prod.setProductId(resultSet.getInt(1));
        prod.setName(resultSet.getString(2));
        prod.setDescription(resultSet.getString(3));
        prod.setPrice(resultSet.getDouble(4));
        return prod;
    }
}
