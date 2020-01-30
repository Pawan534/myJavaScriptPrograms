package com.nisum.employeeManagement.repository.impl;

import com.nisum.employeeManagement.domain.Employee;
import com.nisum.employeeManagement.repository.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
public class EmployeeDaoImpl implements EmployeeDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    @Transactional
    public int create(Employee employee) {
        Integer result = (Integer)hibernateTemplate.save(employee);
        return result;
    }

    @Override
    @Transactional
    public void update(Employee employee) {
        hibernateTemplate.update(employee);
    }

    @Override
    @Transactional
    public void delete(Employee employee) {
        hibernateTemplate.delete(employee);
    }

    @Override
    public Employee read(int id) {
        Employee employee = hibernateTemplate.get(Employee.class, id);
        return employee;
    }

    @Override
    public List<Employee> read() {
        return hibernateTemplate.loadAll(Employee.class);
    }
}
