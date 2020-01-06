package com.bufferReaderExceptions;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainBufferWriter {
    private static Map<Integer, Store> myStore = new HashMap<>();
    private static  Store temp = new Store();
    public static void main(String[] args) {
        temp = new Store(11, "AvenueStateStore");
        myStore.put(01, temp);

        temp = new Store(22, "UnionSquareStore");
        myStore.put(02, temp);

        temp = new Store(33, "NewstandStore");
        myStore.put(03, temp);


        temp = new Store(44, "FremountStore");
        myStore.put(04, temp);

        temp = new Store(55, "MontegoryStore");
        myStore.put(05, temp);

        temp = new Store(66, "NorthgateStore");
        myStore.put(06, temp);

        temp = new Store(77, "HillsdaleMallStore");
        myStore.put(07, temp);

        temp = new Store(88, "SouthlandMallStore");
        myStore.put(8, temp);

        temp = new Store(99, "BroadwayPlazaStore");
        myStore.put(9, temp);

        temp = new Store(101, "SunValleyShoppingCenterStore");
        myStore.put(10, temp);

        temp = new Store(111, "SerramonteCenterStore");
        myStore.put(11, temp);

        BufferedWriter locFile=null;
        try{
            locFile = new BufferedWriter(new FileWriter("myStoreList.txt"));
            System.out.println("Data has been written to text file");
            for(Map.Entry<Integer, Store> details: myStore.entrySet()){
                locFile.write(details.getValue().getstoreID() + " , " + details.getValue().getDescription() + "\n");
            }
            locFile.close();
        }catch (IOException e){
            System.out.println(e.getStackTrace());
        }

    }
}
