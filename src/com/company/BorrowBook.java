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
            file.createNewFile();
        }
        Scanner input = new Scanner(System.in);

        int call = 999;
        try {
            String str = input.next();
            call = Integer.parseInt(str);
        } catch (Exception e) {
        }

        System.out.println("Do you wish to see the books that are not borrowed or do you wish to borrow a book right away?");
        System.out.println("Do you wish to see the books that are not borrowed or do you wish to borrow a book right away?");
        System.out.println("Do you wish to see the books that are not borrowed or do you wish to borrow a book right away?");
        switch (call){
            case 1:
                
                break;
            case 2:
                break;
            default:
                System.out.println("Incorrect Choice!");
        }
    }


    //FileUtility fileUtility = new FileUtility();
}
