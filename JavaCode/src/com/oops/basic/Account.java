package com.oops.basic;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public Account(){
        this("Default number",  "Default Customer name", 0.00, "Default Email address", "Default phone number");
        System.out.println("Empty Construcor");
    }

    public Account(String number, String customerName, double balance,String customerEmailAddress,String customerPhoneNumber){
        this.number = number;
        this.customerName = customerName;
        this.balance = balance;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public Account(String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void deposit(double depositAmt){
        this.balance+=depositAmt;
        System.out.println("Deposit of " + depositAmt + " made. New Balance after deposit is " + this.balance);
    }

    public void withDrawal(double withDrawalAmt){
        if(withDrawalAmt>this.balance){
            System.out.println("Only " + this.balance + " is available. Withdrawal is not processed");
        }else{
            this.balance-=withDrawalAmt;
            System.out.println("Withdrawal of " + withDrawalAmt + " is processed. Remaining Balance after withdraw is " + this.balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }




}
