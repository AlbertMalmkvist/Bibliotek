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

        text = text+".txt";

        Path path = Paths.get("src/com/company/Books/AllBooks"+text);
        File file = new File(path.toString());
        Path patha = Paths.get("src/com/company/Books/AvailableBooks"+text);
        File filea= new File(path.toString());
        if(Files.exists(Paths.get(text))){
        } else{
            file.createNewFile();
            filea.createNewFile();

            String author = inputFromUser.nextLine();

            byte[] authorByte = author.getBytes();
            Files.write(path, authorByte);


            String synopsis = inputFromUser.nextLine();

            byte[] synopsisByte = author.getBytes();
            Files.write(path, synopsisByte);

        }
    }

    }
