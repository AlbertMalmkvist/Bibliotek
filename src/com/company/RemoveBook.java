package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class RemoveBook {
    public RemoveBook() throws IOException {

        Scanner inputFromUser = new Scanner(System.in);

        String text = inputFromUser.nextLine();

        File file = new File("c://Users//Lennart//IdeaProjects//Library//src//com//company//Books//AllBooks//"+text);
        if(Files.exists(Paths.get(text))){
            file.delete();
            if(Files.exists(Paths.get(text))){
                System.out.println("This book is currently being borrowed");
            } else{
            }
        } else{
        }
        //FileUtility fileUtility = new FileUtility();
    }
    }
