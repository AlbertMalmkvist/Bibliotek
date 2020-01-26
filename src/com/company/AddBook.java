package com.company;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class AddBook {
    public AddBook() throws IOException {
        Scanner inputFromUser = new Scanner(System.in);

        String text = inputFromUser.nextLine();

        Path path = Paths.get("src/com/company/Books/AllBooks"+text);
        Path patha = Paths.get("src/com/company/Books/AvailableBooks"+text);
        if(Files.exists(Paths.get(text))){
        } else{
            Files.createFile(patha);
            Files.createFile(path);

            String author = inputFromUser.nextLine();

            byte[] authorByte = author.getBytes();
            Files.write(path, authorByte);


            String synopsis = inputFromUser.nextLine();

            byte[] synopsisByte = author.getBytes();
            Files.write(path, synopsisByte);

        }
    }

    }
