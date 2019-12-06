public class MinutesToYearsDaysCalculator {
    // write your code here

    public static void main(String[] args) {
        printYearsAndDays(561600);
    }
    public static void printYearsAndDays(long minutes){

        if(minutes < 0){
            System.out.println("Invalid Value");
        } else {

            long days = minutes/1440;
            long remainingDays = days%365;
            long years = days/365;
            String yearsAndDays = minutes + " min = "+ years + " y and " + remainingDays + " d";
            System.out.println(yearsAndDays);


        }
    }

}