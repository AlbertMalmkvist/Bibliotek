package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReturnBook {
    //FileUtility fileUtility = new FileUtility();
    public ReturnBook(String text) throws IOException {
        File file = new File("c://Users//Lennart//IdeaProjects//Library//src//com//company//Users//"+text);
        if(Files.exists(Paths.get(text))){
        } else{
            System.out.println("You have no borrowed books\n");
        }


    //FileUtility fileUtility = new FileUtility();
}}
