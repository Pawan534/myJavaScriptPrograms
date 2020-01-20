package com.javaExceptionsEg;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FileDeSerializationExceptionEg {

    public static void main(String[] args) {
        Employee e = null;

        try{
            FileInputStream fileIn =  new FileInputStream("serial.txt");
            ObjectInputStream in  = new ObjectInputStream(fileIn);
            e = (Employee) in.readObject();
        } catch (IOException io){
            System.out.println(io.getMessage());
        } catch (ClassNotFoundException cnf){
            System.out.println(cnf.getMessage());
            cnf.printStackTrace();
            return;
        }


        System.out.println("Data after de serilalization");
        System.out.println("Name : " + e.getName()  );
        System.out.println("Address : " + e.getAddress());
        System.out.println("SSN : " + e.getSSN()  );
        System.out.println("Number : " + e.getNumber());


    }


}
