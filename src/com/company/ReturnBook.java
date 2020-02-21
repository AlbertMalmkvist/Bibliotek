package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReturnBook {

    Scanner input = new Scanner(System.in);

    public ReturnBook(String text) throws IOException {
        Code(text);
    }

    public void Code(String text) throws IOException {
        //Im getting the pathing i need to use the programs
        Path path = Paths.get("src/com/company/Users/"+text);
        // not all programs like Path, so I change it to File to use in more direct ways
        File file = new File(path.toString());

        //checking if there is a directory in their name already, so they can´t return a book if they have never borrowed one
        if(Files.exists(Paths.get("src/com/company/Users/"+text))){

            System.out.println("Do you wish to see the books that you have borrowed or do you wish to return a book right away?");
            System.out.println("1. See list.");
            System.out.println("2. Return right away.");

            int call = 999;
            try {
                String str = input.nextLine();
                call = Integer.parseInt(str);
            } catch (Exception e) {
            }

            switch (call){
                case 1:
                    FirstChoice(file);
                case 2:
                    SecondChoice(text, file);
                    break;
                default:
                    System.out.println("Incorrect Choice!");
            }
        }else{
            System.out.println("You have not borrowed any books before.\n");
        }
    }

    public void FirstChoice(File file){
        //just tells you which books you have borrowed at the moment
        String[] fileList = file.list();
        int i = 1;
        for (String name : fileList) {
            System.out.println(i+(". ")+name.replace(".txt", "")); // bookname
            i++;
        }
    }

    public void SecondChoice(String text, File file) throws IOException {
        System.out.println("Enter the name of the book you wish to return(Enter full name of the book, with upper and lowercase letters in the right places).");
        //name of the book
        String textfile = input.nextLine();

        Path pathB = Paths.get("src/com/company/Books/AvailableBooks");
        File fileB= new File(pathB.toString());

        //checks what you have put in against the name of every file in the directory under the users name to see if it kan find a match with the name of the book you put in
        File[] listOfFiles = file.listFiles();

        int i2 = 0;

        for (File filename : listOfFiles) {
            if (listOfFiles[i2].isFile()) {
                String name = listOfFiles[i2].getName();

                i2++;
                String nummeralIndex = String.valueOf(i2);

                //just needed a different name then before
                Path pathA= Paths.get("src/com/company/Books/AvailableBooks/"+name);
                File fileA = new File(pathA.toString());

                //it would not use the same pathing I used the first time, but it works as part of it
                Path pathC = Paths.get(file+"/"+name);
                File fileC = new File(pathC.toString());

                //adds this so it will become a text file
                name = name.replace(".txt","");
                if (textfile.equals(name)||textfile.equals(nummeralIndex)) {
                    //removes the book from the directory under the users name and make another one with the same name in the directory AvailableBooks
                    fileC.delete();
                    fileA.createNewFile();
                } else {
                }
            }
        }
    }
}
