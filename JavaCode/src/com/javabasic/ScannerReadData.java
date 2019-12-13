package com.javabasic;

import java.io.File;
import java.util.Scanner;

public class ScannerReadData {
    public static void main(String[] args) throws Exception {

        String fileName, text;
        int noOfLines=0;
        Scanner scanner =  new Scanner(System.in);
        fileName = scanner.nextLine();
        File file = new File(fileName);
        Scanner fileInput = new Scanner(file);
        while(fileInput.hasNext()){
            text = fileInput.nextLine();
            noOfLines++;
            System.out.println(text);
        }

        System.out.println(noOfLines);

    }
}
