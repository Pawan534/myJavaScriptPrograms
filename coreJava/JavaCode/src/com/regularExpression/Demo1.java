package com.regularExpression;

public class Demo1 {
    public static void main(String[] args) {
        String test = "I am a String. Yes, I am.";
        String myTest = test.replaceAll("I", "You");
        System.out.println(myTest);

        //For Boundary values we use cap symbol

        String testB =  "abcDeeeF12Ghhiiiijkl99zF";
        System.out.println(testB.replaceAll(".", "Y"));
        System.out.println(testB.replaceAll("^abcDee", "Y"));
        System.out.println(test.replaceAll(".", "Y"));
        System.out.println("abcDeeeF12GhhiiiabcDeeijkl99z".replaceAll("^abcDee", "Y"));

        System.out.println(testB.matches("^abcDeee"));
        System.out.println(testB.replaceAll("l99z$", "The end"));

        System.out.println(testB.replaceAll("[aei]", "X"));
        System.out.println("abcDeeeF12Ghhiiiijkl99zF".replaceAll("[aei][Fj]", "X"));
        System.out.println("abcDeeeF12Ghhiiiijkl99zF".replaceAll("[a-f3-9]", "X"));
        System.out.println("abcDeeeF12Ghhiiiijkl99zF".replaceAll("(?i)[a-f3-9]", "X"));

        String hasWhiteSpaces = "I have blanks and\ta tab, and also newLine\n";
        System.out.println(hasWhiteSpaces.replaceAll("\\s", ""));
        System.out.println(hasWhiteSpaces.replaceAll("\\t", ""));
        System.out.println("-->" + hasWhiteSpaces.replaceAll("\\S", ""));


        System.out.println(testB.replaceAll("ef?", "X"));



    }
}
