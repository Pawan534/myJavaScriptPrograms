package com.javaExceptionsEg;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class BufferMain {
    public static void main(String[] args) {
        FileOutputStream binFile = null;
        FileChannel binChannel = null;

        try{
            binFile = new FileOutputStream("data.dat");
            binChannel = binFile.getChannel();
            ByteBuffer buffer = ByteBuffer.allocate(100);
            byte[] outputBytes = "Hello World!".getBytes();
            buffer.put(outputBytes);
            buffer.putInt(245);
            buffer.putInt(-98765);
            byte[] outputBytes2 = "Nice to meet you".getBytes();
            buffer.put(outputBytes2);
            buffer.putInt(1000);
            buffer.flip();
            binChannel.write(buffer);
            RandomAccessFile ra = new RandomAccessFile("data.dat", "rwd");
            FileChannel channel = ra.getChannel();
            ByteBuffer readBuffer = ByteBuffer.allocate(100);
            channel.read(readBuffer);
            readBuffer.flip();
            byte[] inputStr = new byte[outputBytes.length];
            readBuffer.put(inputStr);
            System.out.println("Input string = " + new String(inputStr));
            System.out.println("int1 = " + readBuffer.getInt());
            System.out.println("int2 = " + readBuffer.getInt());
            byte[] inputStr2 = new byte[outputBytes2.length];
            readBuffer.put(inputStr2);
            System.out.println("Input string = " + new String(inputStr2));
            System.out.println("int3 = " + readBuffer.getInt());



        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
