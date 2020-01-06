package com.collection.array;

import java.util.ArrayList;

public class Branch {

    private String branchName;
    private ArrayList<Customer> customers;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customers = new ArrayList<Customer>();
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
    public boolean newCustomer(String customerName, double intialAmt){
        if(findCustomer(customerName)==null){
            this.customers.add(new Customer(customerName, intialAmt));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransactions(String name, double amt){

        Customer existingCustomer = findCustomer(name);
        if (existingCustomer!=null){
            existingCustomer.addTransactions(amt);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName){
        for(int i=0; i<customers.size();i++){
            if(customers.get(i).getCustomerName().equals(customerName)){
                return customers.get(i);
            }
        }
        return null;
    }
}
