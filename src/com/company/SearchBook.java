package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class SearchBook {
    public SearchBook() throws IOException {
        Path path = Paths.get("src/com/company/Books/AllBooks");
        File file = new File(path.toString());
        Scanner inputFromUser = new Scanner(System.in);

        System.out.println("What is the name of the book or author(make sure to spell it correctly, with upper and lowercase letters in the right places)?");

        String text = inputFromUser.nextLine();

        File[] listOfFiles = file.listFiles();
        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                //gets the file name
                String name = listOfFiles[i].getName();
                Path paths = Paths.get("src/com/company/Books/AllBooks/" + name);
                String firstLine = Files. lines(paths). findFirst(). get();
                //removes .txt from the file name
                name = name.replace(".txt","");
                if (text.equals(name) || text.equals(firstLine)){
                    //prints the name of the book based on the file name
                    System.out.println(name);
                    //prints the name of the author
                    System.out.println(firstLine);
                    String str = Files.lines(paths).skip(1).findFirst().get();
                    //prints the synopsis
                    System.out.println(str);

                }
            }
        }
    }
}
