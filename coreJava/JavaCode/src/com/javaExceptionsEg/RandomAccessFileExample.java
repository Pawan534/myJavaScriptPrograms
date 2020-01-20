package com.javaExceptionsEg;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileExample {


    static final String FILEPATH = "myFile.txt";

    public static void main(String[] args) {

        try {
            System.out.println(new String(readFromFile(FILEPATH, 100, 18)));
            //System.out.println(new String(readFromFile(FILEPATH, 100)));
            writeToFile(FILEPATH, "I love my country and my people", 31);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private  static void writeToFile(String path, String data, int pos) throws IOException {
        RandomAccessFile file = new RandomAccessFile(path, "rwd");
        file.seek(pos);
        file.write(data.getBytes());
        //file.writeUTF(data);
        file.close();
    }

    private static byte[] readFromFile(String filePath, int position, int size)
            throws IOException {
        RandomAccessFile file = new RandomAccessFile(filePath, "r");
        file.seek(position);
        byte[] bytes = new byte[size];
        file.read(bytes);
        file.close();
        return bytes;
    }

    private static String readFromFile(String filePath, int position)
            throws IOException {
        RandomAccessFile file = new RandomAccessFile(filePath, "rwd");
        file.seek(position);
            String myData = file.readUTF();
        file.close();
        return myData;
    }

}
