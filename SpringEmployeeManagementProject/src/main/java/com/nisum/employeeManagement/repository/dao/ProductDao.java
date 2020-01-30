package com.nisum.employeeManagement.repository.dao;

import com.nisum.employeeManagement.domain.Product;

import java.util.List;

public interface ProductDao {
    int create(Product product);
    void update(Product product);
    void delete(Product product);
    Product read(int id);
    List<Product> read();
}
