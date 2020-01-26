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
            System.out.println("5. Search for book name or author.");
            System.out.println("6. Quit.");

            int userChoice = 999;
            try {
                String str = input.next();
                userChoice = Integer.parseInt(str);
            } catch (Exception e) {
            }


            Scanner inputFromUser = new Scanner(System.in);

            switch (userChoice) {
                case 1:
                    // I have username1 and username2 since you can only use it once each and i dont need it for the others
                    System.out.println("Please type in your username");
                    String username1 = inputFromUser.nextLine();
                    System.out.println("Welcome," + " " + username1 + "!" + "\n");

                    BorrowBook borrowBook = new BorrowBook(username1);
                    break;
                case 2:
                    System.out.println("Please type in your username");
                    String username2 = inputFromUser.nextLine();
                    System.out.println("Welcome," + " " + username2 + "!" + "\n");
                ReturnBook returnBook = new ReturnBook(username2);

                    break;
                case 3:
                    //password is in Password.java, as a security thing
                    System.out.println("Please enter password:");
                    String passes = inputFromUser.next();
                    Password password = new Password(passes);

                    break;
                case 4:
                    BookList bookList = new BookList();
                    break;
                case 5:
                    SearchBook searchBook = new SearchBook();
                    break;
                case 6:
                    System.out.println("You will now leave.");
                    System.exit(0); // Shuts down program
                    break;
                default:
                    System.out.println("Incorrect Choice!");
            }

        } while (programStillRunning = true);
    }
}
