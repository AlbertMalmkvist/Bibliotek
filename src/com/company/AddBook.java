package com.company;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class AddBook {
    public AddBook() throws IOException {
        Scanner inputFromUser = new Scanner(System.in);

        String text = inputFromUser.nextLine();

        File file = new File("c://Users//Lennart//IdeaProjects//Library//src//com//company//Books//AllBooks//"+text);
        File filea = new File("c://Users//Lennart//IdeaProjects//Library//src//com//company//Books//AvailableBooks//"+text);
        if(Files.exists(Paths.get(text))){
        } else{
            file.createNewFile();
            filea.createNewFile();

            String author = inputFromUser.nextLine();
            BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
            writer.append(' ');
            writer.append(author);
            writer.append("new row?");

            writer.close();
            BufferedWriter awriter = new BufferedWriter(new FileWriter(filea, true));
            awriter.append(' ');
            awriter.append(author);
            awriter.append("new row?");

            awriter.close();

        }
    }

    }
