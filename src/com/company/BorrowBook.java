package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;


public class BorrowBook {
    public BorrowBook(String text) throws IOException {
        File file = new File("c://Users//Lennart//IdeaProjects//Library//src//com//company//Users//"+text);
        if(Files.exists(Paths.get(text))){
        } else{
            boolean bool = file.mkdir();
        }
        Scanner input = new Scanner(System.in);

        System.out.println("Do you wish to see the books that are not borrowed or do you wish to borrow a book right away?");
        System.out.println("1. See list.");
        System.out.println("2. Borrow right away.");

        int call = 999;
        try {
            String str = input.next();
            call = Integer.parseInt(str);
        } catch (Exception e) {
        }

        switch (call){
            case 1:
                BorrowableList borrowableList = new BorrowableList();
            case 2:
                break;
            default:
                System.out.println("Incorrect Choice!");
        }
    }


    //FileUtility fileUtility = new FileUtility();
}
