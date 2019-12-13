package com.javabasic;

public class MethodOverloadingEg {
    public static void main(String[] args) {

        double centimeters = calcFeetAndInchesToCentimeter(6, 0);
        if(centimeters < 0.0){
            System.out.println("Invalid parameters");
        }

        calcFeetAndInchesToCentimeter(100);

    }

    public static double calcFeetAndInchesToCentimeter(double feet, double inches){

        if(feet > 0 && (inches>=0 && inches <=12)){

            double centimeter = (inches*2.54) + (feet*30.48);
            System.out.println(feet + " feet, " + inches + " inches = " + centimeter + " cm");
            return centimeter;
        } else{
            System.out.println("Invalid parameters of feet or inches");
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeter(double inches){
        if(inches>=0){
            double feet = (int) inches/12;
            double remaingInches  = (int) inches%12;
            System.out.println(inches + " inches is equal to " + feet + " feet and remaining feets are " + remaingInches + " inches");
            return  calcFeetAndInchesToCentimeter(feet, remaingInches);
        } else{
            return -1;
        }
    }


}
