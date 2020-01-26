package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;


public class BorrowBook {
    public BorrowBook(String text) throws IOException {
        //Im getting the pathing i need to use the programs
        Path path = Paths.get("src/com/company/Users/"+text);
        // not all programs like Path, so I change it to File to use in more direct ways
        File file = new File(path.toString());

        //checking if there is a directory in their name already and if not it makes a new one
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
            String str = input.nextLine();
            call = Integer.parseInt(str);
        } catch (Exception e) {
        }

        switch (call){
            case 1:
                BorrowableList borrowableList = new BorrowableList();
                break;
            case 2:
                System.out.println("Enter the name of the book you wish to borrow(Enter full name of the book, with upper and lowercase letters in the right places).");
                //name of the book
                String textfile = input.nextLine();

                //adds this so it will become a text file
                textfile = textfile+".txt";

                //just needed a different name then before
                Path pathA= Paths.get("src/com/company/Books/AvailableBooks/"+textfile);
                File fileA = new File(pathA.toString());

                Path pathB = Paths.get("src/com/company/Books/AvailableBooks");
                File fileB= new File(pathB.toString());

                //it would not use the same pathing I used the first time, but it works as part of it
                Path pathC = Paths.get("src/com/company/Users/"+text+"/"+textfile);
                File fileC = new File(pathC.toString());

                //checks what you have put in against the name of every file in the directory named Available books to see if it kan find a match with the name of the book you put in
                File[] listOfFiles = fileB.listFiles();
                for (int i = 0; i < listOfFiles.length; i++) {
                    if (listOfFiles[i].isFile()) {
                        String name = listOfFiles[i].getName();
                        if (textfile.equals(name)) {
                            //removes the book from the directory AvailableBooks and make another one with the same name in the directory under the users name
                            fileA.delete();
                            fileC.createNewFile();
                        } else {
                        }
                    }
                }
                break;
            default:
                System.out.println("Incorrect Choice!");
        }
    }
}
