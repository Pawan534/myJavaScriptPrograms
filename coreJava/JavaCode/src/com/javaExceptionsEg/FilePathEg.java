package com.javaExceptionsEg;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilePathEg {
    public static void main(String[] args) {
        Path path = FileSystems.getDefault().getPath("myFile.txt");
        printFile(path);
    }

    private static void printFile(Path path){
        BufferedReader br = null;
        try{
            br = Files.newBufferedReader(path);
            String line;
            while ((line = br.readLine())!=null){
                System.out.println(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
