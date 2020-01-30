package com.nisum.employeeManagement.domain;

import javax.persistence.*;

@Entity
@Table
public class Department {
    @Id
    @Column(name = "departmentId")
    private int departmentId;
    @Column(name = "departmentFullName")
    private String departmentName;
    @Column(name = "deptName")
    private String deptShortCut;

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDeptShortCut() {
        return deptShortCut;
    }

    public void setDeptShortCut(String deptShortCut) {
        this.deptShortCut = deptShortCut;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                ", deptShortCut='" + deptShortCut + '\'' +
                '}';
    }
}
