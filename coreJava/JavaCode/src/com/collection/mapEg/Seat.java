package com.collection.mapEg;

public class Seat implements Comparable<Seat>{

    private final String seatNumber;
    private boolean reserved;
    private double price;

    @Override
    public int compareTo(Seat o) {
       return this.seatNumber.compareToIgnoreCase(o.getSeatNumber());
    }


    public Seat(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price= price;
        this.reserved = false;
    }


    public boolean reserve(){
        if(!this.reserved){
            this.reserved=true;
            System.out.println("Seat " + seatNumber + " reserved");
            return true;
        } else{
            System.out.println(seatNumber + " is already reserved seat");
            return false;
        }
    }

    public boolean cancel(){
        if(this.reserved){
            this.reserved=false;
            System.out.println("Reservation of seat " + seatNumber + " is cancelled");
            return true;
        } else {
            return false;
        }
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public double getPrice() {
        return price;
    }

    public boolean isReserved() {
        return reserved;
    }
}
