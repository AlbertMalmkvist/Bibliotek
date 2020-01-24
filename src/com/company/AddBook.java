package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class AddBook {
    public AddBook() throws IOException {
        Scanner inputFromUser = new Scanner(System.in);

        String text = inputFromUser.nextLine();

        File file = new File("c://Users//Lennart//IdeaProjects//Library//src//com//company//Books//AllBokks//"+text);
        File filea = new File("c://Users//Lennart//IdeaProjects//Library//src//com//company//Books//AllBokks//"+text);
        if(Files.exists(Paths.get(text))){
        } else{
            file.createNewFile();
            filea.createNewFile();
        }
    }

    }
