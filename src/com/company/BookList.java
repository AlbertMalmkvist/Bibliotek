package com.company;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BookList {
    public BookList() throws IOException {
        Path path = Paths.get("src/com/company/Books/AllBooks");
        File file = new File(path.toString());


        //Gets every file in the directory AllBooks
        File[] listOfFiles = file.listFiles();
        for (File filename : listOfFiles) {
            if (filename.isFile()) {
                String name = filename.getName();
                //prints the name of the book based on the file name, without the .txt from the file
                System.out.println(name.replace(".txt",""));
                Path paths = Paths.get("src/com/company/Books/AllBooks/" + name);
                File textfile = new File(paths.toString());
                //gets the name of the author
                String firstLine = Files. lines(paths). findFirst(). get();
                //prints the name of the author
                System. out. println(firstLine+("\n"));
            }
        }
    }
    }

