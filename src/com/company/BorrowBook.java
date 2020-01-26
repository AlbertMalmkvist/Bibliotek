package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;


public class BorrowBook {
    public BorrowBook(String text) throws IOException {
        Path path = Paths.get("src/com/company/Users/"+text);
        File file = new File(path.toString());

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
                String textfile = input.nextLine();

                textfile = textfile+".txt";

                Path pathC = Paths.get("src/com/company/Users/"+text+"/"+textfile);
                File fileC = new File(pathC.toString());

                Path pathA= Paths.get("src/com/company/Books/AvailableBooks/"+textfile);
                File fileA = new File(pathA.toString());

                Path pathB = Paths.get("src/com/company/Books/AvailableBooks");
                File fileB= new File(pathB.toString());

                File[] listOfFiles = fileB.listFiles();
                for (int i = 0; i < listOfFiles.length; i++) {
                    if (listOfFiles[i].isFile()) {
                        String name = listOfFiles[i].getName();
                        if (textfile.equals(name)) {
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


    //FileUtility fileUtility = new FileUtility();
}
