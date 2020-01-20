package com.javaExceptionsEg;


import java.io.*;

public class FileSerializationExceptionEg {

    public static void main(String[] args) {

        Employee e = new Employee();
        e.setName("Ryan");
        e.setAddress("548 market st");
        e.setNumber(101);
        e.setSSN(11223377);
    try{
        FileOutputStream fileOut = new FileOutputStream("serial.txt");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(e);
        out.close();
        fileOut.close();
    }catch(IOException io){
        System.out.println(io.getMessage());
    }

    }

}
