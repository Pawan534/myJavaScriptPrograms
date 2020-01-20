package com.example.springCore.coreSpring.domain;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//Its a POJO class
public class Employee {
    private int employeeID;
    private String employeeName;

    public Employee(int employeeID, String employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    @PostConstruct
    public void sayHi(){
        System.out.println("Init method created using annotations");
    }

    @PreDestroy
    public void sayByee(){
        System.out.println("Destroy method created using annotations");
    }
}
