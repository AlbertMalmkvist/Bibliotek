package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReturnBook {
    //FileUtility fileUtility = new FileUtility();
    public ReturnBook(String text) throws IOException {
        Path patha = Paths.get("src/com/company/Books/Users"+text);
        if(Files.exists(Paths.get(text))){

            Scanner input = new Scanner(System.in);

            System.out.println("Do you wish to see the books that you have borrowed or do you wish to return a book right away?");
            System.out.println("1. See list.");
            System.out.println("2. Return right away.");

            int call = 999;
            try {
                String str = input.next();
                call = Integer.parseInt(str);
            } catch (Exception e) {
            }

            switch (call){
                case 1:

                    break;
                case 2:
                    break;
                default:
                    System.out.println("Incorrect Choice!");
        }
        }else{
            System.out.println("You have not borrowed any books before.\n");


    //FileUtility fileUtility = new FileUtility();
}}}
