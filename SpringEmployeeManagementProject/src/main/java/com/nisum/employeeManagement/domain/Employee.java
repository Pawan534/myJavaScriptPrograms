package com.nisum.employeeManagement.domain;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
@Table
public class Employee {

    @Id
    @Column(name="id")
    private int employeeId;
    @Column
    private String firstName;
    @Column
    private String lastName;

    @ManyToOne()
    @JoinColumn(name="departmentId")
    private Department department;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", firstName=" + firstName +
                ", lastName=" + lastName +
                ", department=" + department +
                '}';
    }
}
