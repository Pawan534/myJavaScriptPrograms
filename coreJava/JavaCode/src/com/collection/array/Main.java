package com.collection.array;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("0012 121 1134");
    public static void main(String[] args) {
        boolean quite = false;
        startPhone();
        printActions();

        while (!quite){
            System.out.println("\nEnter the actions");
            int actions = sc.nextInt();

            switch (actions){
                case 0:
                    System.out.println("Shutting down...");
                    quite = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;

                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;

                case 6:
                    printActions();
                    break;
            }
        }

    }
    private static void startPhone(){
        System.out.println("Phone has been started........");
    }
    private static void addNewContact(){
        System.out.println("Enter new contact name");
        String name = sc.next();
        System.out.println("Enter new contact number");
        String phoneNumer = sc.next();
        Contact contact = Contact.createContact(name, phoneNumer);
        if (mobilePhone.addContacts(contact)){
            System.out.println("New contact has been added\n");
        }else{
            System.out.println("Cannot add the contact\n");
        }
    }

    private static void removeContact() {
        System.out.println("Enter existing contact name");
        String name = sc.next();
        Contact existingContact = mobilePhone.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found");
            return;
        }
        if(mobilePhone.removeContact(existingContact)){
            System.out.println("Successfully removed contact");
        }else{
            System.out.println("Error deleting contact...");
        }

    }

    private static void queryContact() {
        System.out.println("Enter existing contact name");
        String name = sc.next();
        Contact existingContact = mobilePhone.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found");
            return;
        }

        System.out.println(existingContact.getName() + " " + existingContact.getPhoneNumber());
    }

    private static void updateContact(){
        System.out.println("Enter existing contact name");
        String name = sc.next();
        Contact existingContact = mobilePhone.queryContact(name);
        if(existingContact == null){
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Enter new contact name");
        String newName = sc.next();
        System.out.println("Enter new contact number");
        String newContactNum = sc.next();
        Contact contact = Contact.createContact(newName, newContactNum);
        if(mobilePhone.updateContact(existingContact, contact)){
            System.out.println("Successfully updated the contact");
        } else {
            System.out.println("Error updating records");
        }

    }

    private static void printActions(){
        System.out.println("Available actions: \n press");
        System.out.println("0 - to Shutdown\n" + "1 - to print contacts\n" + "2 - to add new contact\n" +
                "3 - update existing contact\n" + "4 - remove existing contact\n" + "5 - query if an existing contact exist\n"
                + "6 - to print list of available actions.");
    }





}
