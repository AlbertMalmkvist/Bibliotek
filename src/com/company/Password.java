package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Password {
    public Password(String pass) throws IOException {

        if (pass == "Bookworm") {
            System.out.println("Welcome, librarian!\n");


            System.out.println("Please select to add or remove book to library");
            System.out.println("1. Add new book.");
            System.out.println("2. Remove existing book(Can only be done with books that are currently not being borrowed).");
            Scanner input = new Scanner(System.in);

            int call = 999;
            try {
                String str = input.next();
                call = Integer.parseInt(str);
            } catch (Exception e) {
            }
            switch (call){
                case 1:
                    AddBook addBook = new AddBook();
                    break;
                case 2:
                    RemoveBook removeBook = new RemoveBook();
                    break;
                default:
                    System.out.println("Incorrect Choice!");
            }

        } else{
            System.out.println("Incorrect password");

        }
    }
}
