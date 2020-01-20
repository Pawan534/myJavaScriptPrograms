package com.oops.interfaceEg;

public class DeskPhone implements ITelephone{

    private int myNumber;
    private boolean isRinging;


    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {

        System.out.println("No action taken, disk phone does not have a power button");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing " + phoneNumber + " on deskphone");
    }

    @Override
    public void answer() {

        if(isRinging){
            System.out.println("Answering the deskphone");
            isRinging=false;
        }

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber){
            isRinging = true;
            System.out.println("Ring ring");
            return true;
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return false;
    }
}
