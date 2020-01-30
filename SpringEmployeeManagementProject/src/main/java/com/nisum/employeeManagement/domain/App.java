package com.nisum.employeeManagement.domain;

import com.nisum.employeeManagement.domain.Employee;
import com.nisum.employeeManagement.repository.dao.DepartmentDao;
import com.nisum.employeeManagement.repository.dao.EmployeeDao;
import com.nisum.employeeManagement.repository.impl.DepartmentDaoImpl;
import com.nisum.employeeManagement.repository.dao.ProductDao;
import com.nisum.employeeManagement.repository.impl.ProductDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("file:src/main/java/beans.xml");
        EmployeeDao  employeeDao = (EmployeeDao) ctx.getBean("employeeDaoImpl");
        DepartmentDao departmentDao = (DepartmentDao)ctx.getBean("departmentDaoImpl");
        ProductDao productDao = (ProductDao)ctx.getBean("productDaoImpl");

       //Read single record from DB
        Employee employee = employeeDao.read(1);
        Department department = departmentDao.read(123);
        Product product = productDao.read(1310);
        System.out.println(employee);
        System.out.println(department);
        System.out.println(product);

        //Read all records from DB
        System.out.println(employeeDao.read());
        System.out.println(departmentDao.read());
        System.out.println(productDao.read());

    }
}
