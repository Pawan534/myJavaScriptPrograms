package com.lambdaAndStreams.lambdaExpression.SuppliersEg;

import java.io.Serializable;

public class Employee implements Serializable {

    private String name;
    private String address;
    private transient int SSN;
    private int number;


    public Employee(){

    }
    public Employee(String name, String address, int number, int SSN){
        this.name = name;
        this.address = address;
        this.SSN =SSN;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getSSN() {
        return SSN;
    }

    public int getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void mailCheck(){
        System.out.println(name + " " + address);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", SSN=" + SSN +
                ", number=" + number +
                '}';
    }
}
