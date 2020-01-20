package com.collection.array;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;
    private ArrayList<Contact> myData;


    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public void getContactDetails(Contact contact){

        for(int i=0; i<myData.size();i++){
            if(myData.get(i).getName().equals(contact.getName())){
                System.out.println("Customer existed");
            }
        }
    }

    public boolean addContacts(Contact contact){

        if(findContact(contact.getName())>=0){
            System.out.println("Contact is already added to mobile phone");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){

        int pos = findContact(oldContact);
        if(pos<0) {
            System.out.println(oldContact.getName() + " is not found");
            return false;
        }
        this.myContacts.set(pos, newContact);
        return true;

    }

    public boolean removeContact(Contact contact){

        int pos = findContact(contact);
        if(pos<0) {
            System.out.println(contact.getName() + " is not found");
            return false;
        }
        this.myContacts.remove(pos);
        return true;

    }

    public int findContact(Contact contact){
        return this.myContacts.indexOf(contact);
    }

    public int findContact(String contactName){
        for(int i=0; i<myContacts.size(); i++){
            if(myContacts.get(i).getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contact contact){
        if(findContact(contact)>=0){
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String name){
        int pos = findContact(name);
        if(pos>=0){
            return this.myContacts.get(pos);
        }
        return null;
    }

    public void printContacts(){
        if(myContacts.size() <= 0){
            System.out.println("No records to display");
        }
        for(int i=0; i<myContacts.size();i++){
            System.out.println(this.myContacts.get(i).getName() + " " + this.myContacts.get(i).getPhoneNumber());
        }
    }
}
