package com.javaExceptionsEg;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileDirEg {
    public static void main(String[] args) {
        try{

            Path  dirToCreate = FileSystems.getDefault().getPath("dir", "DIR1.txt");
            System.out.println(dirToCreate);
            Files.createFile(dirToCreate);
        } catch (IOException e){
            e.printStackTrace();
        }

    }


}
