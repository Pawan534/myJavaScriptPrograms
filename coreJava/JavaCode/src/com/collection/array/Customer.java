package com.collection.array;

import java.util.ArrayList;

public class Customer {

    private String customerName;
    private ArrayList<Double> customerTransactions;

    public Customer(String customerName, Double intitalAmt) {
        this.customerName = customerName;
        this.customerTransactions = new ArrayList<Double>();
        addTransactions(intitalAmt);
    }

    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<Double> getCustomerTransactions() {
        return customerTransactions;
    }

    public void addTransactions(double amt){
        customerTransactions.add(amt);
    }
}
