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

        System.out.println("What is the name of the book or author?");

        String text = inputFromUser.nextLine();

        int i = 0;
        File[] listOfFiles = file.listFiles();

        for (File filename : listOfFiles) {

            if (listOfFiles[i].isFile()) {
                //gets the file name
                String name = listOfFiles[i].getName();
                Path paths = Paths.get("src/com/company/Books/AllBooks/" + name);
                String firstLine = Files. lines(paths). findFirst(). get();
                //removes .txt from the file name
                name = name.replace(".txt","");
                //gets the synopsis
                String str = Files.lines(paths).skip(1).findFirst().get();
                i++;

                if (name.toLowerCase().contains(text.toLowerCase())){
                    printing(name, firstLine, str);
                }

            }
        }
    }
    public void printing(String name, String firstLine, String str){
        //prints the name of the book based on the file name
        System.out.println(name);
        //prints the name of the author
        System.out.println(firstLine);
        //prints the synopsis
        System.out.println(str + ("\n"));
        return;
    }
}
