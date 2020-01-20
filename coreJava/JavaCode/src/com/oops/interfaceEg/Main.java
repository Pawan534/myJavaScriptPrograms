package com.oops.interfaceEg;

public class Main {
    public static void main(String[] args) {

        ITelephone iTelephone;
        iTelephone = new DeskPhone(13432);
        iTelephone.powerOn();
        iTelephone.callPhone(13432);
        iTelephone.isRinging();
        iTelephone.answer();
        System.out.println("***********");
        iTelephone = new MobilePhone(3423);
        iTelephone.powerOn();
        iTelephone.callPhone(3423);
        iTelephone.isRinging();
        iTelephone.answer();

        System.out.println("Sammy".compareTo("Pawan"));




    }
}
