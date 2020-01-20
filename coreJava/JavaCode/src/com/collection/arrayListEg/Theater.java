package com.collection.arrayListEg;

import java.util.*;

public class Theater {

    private final String theaterName;

    private List<Seat> seatList = new ArrayList<>();

    public Theater(String theaterName, int noOfRows, int seatsPerRow) {
        this.theaterName = theaterName;
        int lastRow = 'A' + (noOfRows-1);
        for(char row= 'A'; row<=lastRow; row++){
            for(int seat=1; seat<=seatsPerRow; seat++){
                double price = 10.0;
                if((row < 'D') && (seat>=4 && seat <=9)){
                    price = 14.0;
                } else if((row > 'F') && (seat<4 || seat >9)){
                    price = 7.0;
                }
                Seat seats = new Seat(row + String.format("%02d", seat), price);
                this.seatList.add(seats);
            }
        }
    }

    static final Comparator<Seat> PRICE_ORDER = new Comparator<Seat>() {
        @Override
        public int compare(Seat o1, Seat o2) {
            if(o1.getPrice() < o2.getPrice()){
                return -1;
            } else if(o1.getPrice() > o2.getPrice()){
                return 1;
            }else {
                return 0;
            }
        }
    };

    public String getTheaterName() {
        return theaterName;
    }


    //instead of for loop, binary search is used
    public boolean reserveSeat(String seatNum){
        Seat requestSeat = new Seat(seatNum, 0);
         int foundSeat = Collections.binarySearch(seatList, requestSeat, null);
         if(foundSeat>=0){
             return seatList.get(foundSeat).reserve();
         } else{
             System.out.println(seatNum + " its not available in the list");
             return false;
         }
//        for(Seat seat: this.seatList){
//            if(seat.getSeatNumber().equals(seatNum)){
//                requestSeat = seat;
//                break;
//            }
//        }
//
//        if(requestSeat==null){
//            System.out.println(seatNum + " its not available in the list");
//            return  false;
//        }
//        return requestSeat.reserve();
    }



    public void getSeats(){
        for(Seat seat: this.seatList){
            System.out.println(seat.getSeatNumber());
        }
    }

    public List<Seat> getSeat(){
        return seatList;
    }



}
