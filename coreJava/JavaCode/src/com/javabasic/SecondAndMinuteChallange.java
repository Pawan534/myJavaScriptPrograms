package com.javabasic;

public class SecondAndMinuteChallange {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    public static void main(String[] args) {
        String time = getDurationString(100, 34);
        System.out.println(time);
        time = getDurationString(800);
        System.out.println(time);
        System.out.println( getDurationString(-30));
    }

    public static String getDurationString(long minutes, long seconds){
        if(minutes >= 0 && (seconds>=0 && seconds<=59)){
            long remainingMinutes = minutes % 60;
            long hours = minutes/60;
            String hoursStrings = hours + "h";
            String minuteStrings = remainingMinutes + "m";
            String secondsStrings = seconds + "s";
            if (hours < 10){
                hoursStrings = "0"+ hoursStrings;
            } else if (remainingMinutes < 10){
                minuteStrings = 0 + minuteStrings;
            } else if(seconds < 10){
                secondsStrings = "0" + secondsStrings;
            }
            return hoursStrings + " " + minuteStrings + " " + secondsStrings;
        } else{
            return INVALID_VALUE_MESSAGE;
        }
    }

    public static String getDurationString(long seconds){

        if(seconds <=0){
            return INVALID_VALUE_MESSAGE;
        } else{
            long mintues = seconds/60;
            long remaingSeconds = seconds % 60;
            return getDurationString(mintues, remaingSeconds);
        }
    }
}
