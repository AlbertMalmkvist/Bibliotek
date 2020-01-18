package com.company;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Biblotek {

    private Scanner input = new Scanner(System.in);
    private boolean gameStillRunning;
    public Biblotek(){

        try {

            do {

                System.out.println("Welcome to Sea Wars! Please select mode using key 1, 2 or 3. Press <ENTER>");
                System.out.println("1. Player VS Player (PvP)");
                System.out.println("2. Player VS Computer (PvE)");
                System.out.println("3. Quit");
                int userChoice = input.nextInt();


                Scanner inputFromUser = new Scanner(System.in);

                switch (userChoice) {
                    case 1:
                        System.out.println("You have chosen 'Player VS Player' (PvP)" + "\n");

                        //Welcoming players and let them enter their name
                        System.out.println("Player 1, please type in your name");
                        String playerOneName = inputFromUser.nextLine();
                        System.out.println("Welcome," + " " + "!" + "\n");

                        System.out.println("Player 2, please type in your name");
                        String playerTwoName = inputFromUser.nextLine();
                        System.out.println("Welcome," + " " + "!" + "\n");

                        break;

                    case 2:
                        System.out.println("You have chosen 'Player VS Computer' (PvE)" + "\n \n" + "Please enter your name:");

                        String humanName = inputFromUser.nextLine();
                        System.out.println("Welcome," + " " + "!");

                        System.out.println("You'll be playing against the" + " "  + "\n");

                        break;


                    case 3:
                        System.out.println("You will now Quit Sea Wars");
                        System.exit(0); // Shuts down program
                    default:
                        throw new IllegalStateException("Unexpected value: " + userChoice);
                }

            } while (gameStillRunning = true);
        } catch (InputMismatchException e) {
            e.getMessage();
            System.out.println("Invalid choice. Please select 1, 2 or 3.");
            //BattleShipProgram bA = new BattleShipProgram();
        }
    }
}
