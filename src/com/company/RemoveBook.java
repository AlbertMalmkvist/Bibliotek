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

        int a = 0;
        File file = new File("c://Users//Lennart//IdeaProjects//Library//src//com//company//Books//AllBooks//"+text);

        File afile = new File("c://Users//Lennart//IdeaProjects//Library//src//com//company//Books//AvailableBooks//"+text);

        File dfile = new File("c://Users//Lennart//IdeaProjects//Library//src//com//company//Books//AvailableBooks");
        String[] fileList = dfile.list();

        if(Files.exists(Paths.get(text))){
        for (String name : fileList) {
            if(name == text){
                afile.delete();
                file.delete();
                a++;
                } else{
                }
            }} else{
            }
        if (a == 0){
            System.out.println("This book is currently being borrowed");
        }
        }
        //FileUtility fileUtility = new FileUtility();
    }