package com.oops.basic;

public class Person {
    // write your code here
    private String firstName;
    private String lastName;
    private int age;

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public void setLastName(String lastName){
        this.lastName=lastName;
    }

    public void setAge(int age){
        this.age = (age<0 || age>100) ? 0 : age;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public int getAge(){
        return this.age;
    }

    public boolean isTeen(){
        return (this.age>12 && this.age<20)? true: false;
    }

    public String getFullName(){
        String fullName = (!this.firstName.isEmpty() && !this.lastName.isEmpty()) ? (this.firstName + " " + this.lastName): (this.firstName.isEmpty() ? this.lastName : this.firstName);
        return fullName;
    }



}
