package com.nisum.employeeManagement.repository.impl;

import com.nisum.employeeManagement.domain.Product;
import com.nisum.employeeManagement.repository.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class ProductDaoImpl implements ProductDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    @Transactional
    public int create(Product product) {
        Integer res = (Integer)hibernateTemplate.save(product);
        return res;
    }

    @Override
    public void update(Product product) {
        hibernateTemplate.update(product);
    }

    @Override
    public void delete(Product product) {
        hibernateTemplate.delete(product);
    }

    @Override
    public Product read(int id) {
        Product product = hibernateTemplate.get(Product.class, id);
        return product;
    }

    @Override
    public List<Product> read() {
        return hibernateTemplate.loadAll(Product.class);
    }
}
