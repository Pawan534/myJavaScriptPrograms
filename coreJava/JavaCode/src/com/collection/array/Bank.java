package com.collection.array;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double amt) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.newCustomer(customerName, amt);
        }
        return false;
    }


    public boolean addCustTransaction(String branchName, String customerName, double amt) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomerTransactions(customerName, amt);
        }
        return false;
    }

    public Branch findBranch(String branchName) {
        for (int i = 0; i < this.branches.size(); i++) {
            Branch branch = this.branches.get(i);
            if (branch.getBranchName().equals(branchName)) {
                return branch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean showTransactions){
        Branch branch = findBranch(branchName);
        if(branch!=null){
            System.out.println("Customer details of branch " + branchName);
            ArrayList<Customer> customers = branch.getCustomers();
            for(int i=0; i<customers.size();i++){
                Customer branchCustomer = customers.get(i);
                System.out.println("Customer: " + branchCustomer.getCustomerName() + " --> " + i);
                if (showTransactions){
                    System.out.println("Transactions");
                    ArrayList<Double> totalTransactions = branchCustomer.getCustomerTransactions();
                    for(int j=0; i<totalTransactions.size();j++){
                        System.out.println((j+1) + " --> " + totalTransactions.get(j));
                    }
                }

            }
            return true;
        }else
        {
            return false;
        }
    }


}
