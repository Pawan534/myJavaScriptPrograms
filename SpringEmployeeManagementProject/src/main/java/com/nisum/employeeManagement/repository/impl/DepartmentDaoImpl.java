package com.nisum.employeeManagement.repository.impl;

import com.nisum.employeeManagement.domain.Department;
import com.nisum.employeeManagement.repository.dao.DepartmentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
public class DepartmentDaoImpl implements DepartmentDao {
    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    @Transactional
    public int create(Department department) {
        Integer result = (Integer)hibernateTemplate.save(department);
        return result;
    }

    @Override
    @Transactional
    public void update(Department department) {
        hibernateTemplate.update(department);
    }

    @Override
    @Transactional
    public void delete(Department department) {
        hibernateTemplate.delete(department);
    }

    @Override
    public Department read(int id) {
        Department department=hibernateTemplate.get(Department.class, id);
        return department;
    }

    @Override
    public List<Department> read() {
        return hibernateTemplate.loadAll(Department.class);
    }
}
