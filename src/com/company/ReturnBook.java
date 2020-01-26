package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReturnBook {
    public ReturnBook(String text) throws IOException {
        Path path = Paths.get("src/com/company/Users/"+text);
        File file = new File(path.toString());

        if(Files.exists(Paths.get("src/com/company/Users/"+text))){

            Scanner input = new Scanner(System.in);

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
                    String[] fileList = file.list();
                    for (String name : fileList) {
                        System.out.println(name.replace(".txt", "")); // bookname
                    }

                    break;
                case 2:
                    System.out.println("Enter the name of the book you wish to return(Enter full name of the book, with upper and lowercase letters in the right places).");
                    String textfile = input.nextLine();

                    textfile = textfile+".txt";

                    Path pathC = Paths.get(file+"/"+textfile);
                    File fileC = new File(pathC.toString());

                    Path pathA= Paths.get("src/com/company/Books/AvailableBooks/"+textfile);
                    File fileA = new File(pathA.toString());

                    Path pathB = Paths.get("src/com/company/Books/AvailableBooks");
                    File fileB= new File(pathB.toString());

                    File[] listOfFiles = file.listFiles();
                    for (int i = 0; i < listOfFiles.length; i++) {
                        if (listOfFiles[i].isFile()) {
                            String name = listOfFiles[i].getName();
                            if (textfile.equals(name)) {
                                fileC.delete();
                                fileA.createNewFile();
                            } else {
                            }
                        }
                    }
                    break;
                default:
                    System.out.println("Incorrect Choice!");
        }
        }else{
            System.out.println("You have not borrowed any books before.\n");
}
    }
}
