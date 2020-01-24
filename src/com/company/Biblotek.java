package com.company;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Biblotek {
    private Scanner input = new Scanner(System.in);
    private boolean programStillRunning;

    public boolean isProgramStillRunning() {
        return programStillRunning;
    }

    public void Choices() throws IOException {



        do {

            System.out.println("Welcome! Please select option using key 1, 2, 3, 4 or 5. Press <ENTER>");
            System.out.println("1. Borrow book.");
            System.out.println("2. Return book.");
            System.out.println("3. Add or remove book(Librarians only).");
            System.out.println("4. List all books.");
            System.out.println("5. Quit.");

            int userChoice = 999;
            try {
                String str = input.next();
                userChoice = Integer.parseInt(str);
            } catch (Exception e) {
            }


            Scanner inputFromUser = new Scanner(System.in);

            switch (userChoice) {
                case 1:
                    //Welcoming players and let them enter their name
                    System.out.println("Please type in your username");
                    String username1 = inputFromUser.nextLine();
                    System.out.println("Welcome," + " " + username1 + "!" + "\n");
                    String userfile1 = username1;

                    BorrowBook borrowBook = new BorrowBook(userfile1);
                    break;
                case 2:
                    System.out.println("Please type in your username");
                    String username2 = inputFromUser.nextLine();
                    System.out.println("Welcome," + " " + username2 + "!" + "\n");
                    String userfile2 = username2;
                ReturnBook returnBook = new ReturnBook(userfile2);

                    break;
                case 3:
                    System.out.println("Please enter password:");
                    String pass = inputFromUser.nextLine();
                    Password password = new Password(pass);

                    break;
                case 4:
                    BookList bookList = new BookList();
                    break;
                case 5:
                    System.out.println("You will now Quit Sea Wars");
                    System.exit(0); // Shuts down program
                default:
                    System.out.println("Incorrect Choice!");
            }

        } while (programStillRunning = true);
    }
}
