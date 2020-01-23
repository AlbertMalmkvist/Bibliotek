package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.io.FileWriter;
import java.io.PrintWriter;


public class BorrowBook {
    public BorrowBook(String text) throws IOException {
        File file = new File("c://temp//Users//"+text);
        if(Files.exists(Paths.get(text))){
        } else{
            file.createNewFile();
        }
    }


    //FileUtility fileUtility = new FileUtility();
}
