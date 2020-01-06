package com.bufferReaderExceptions;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainBufferReader {

    private static Map<Integer, Store> myStore = new HashMap<>();
    private static  Store storeData = Store.getInstance();
    public static void main(String[] args) {
        Scanner sc = null;
        int sno=0;

        try{
            sc = new Scanner(new BufferedReader(new FileReader("storeList.txt")));
            sc.useDelimiter(" , ");
            while (sc.hasNext()){
                int storeNum = sc.nextInt();
                sno++;
                sc.skip(sc.delimiter());
                String storeName = sc.nextLine();
                System.out.println("Store number --> " + storeNum);
                System.out.println("Store description --> " + storeName);

                myStore.put(sno, new Store(storeNum, storeName));
            }
            sc.close();

        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }

        for(Map.Entry<Integer, Store> details: myStore.entrySet()){
            System.out.println("Store Id: " + details.getValue().getstoreID() + " , Store Description: " + details.getValue().getDescription());
        }
    }
}
