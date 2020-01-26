package com.company;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookList {
    public BookList() throws IOException {
        Path path = Paths.get("src/com/company/Books/AllBooks");
        File file = new File(path.toString());


        File[] listOfFiles = file.listFiles();
        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                String name = listOfFiles[i].getName();
                System.out.println("File " + name);
                Path paths = Paths.get("src/com/company/Books/AvailableBooks" + name);
                File textfile = new File(paths.toString());
                String firstLine = Files. lines(paths). findFirst(). get();
                System. out. println("firstLine = " + firstLine);
            }
        }
    }
        /*public void printAllLines(String filename) {

            BufferedReader reader;
            try {
                reader = new BufferedReader(new FileReader(String.valueOf(path)));
                String line = reader.readLine();
                while (line != null) {
                    System.out.println(line);
                    // read next line
                    line = reader.readLine();
                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            /*
            List<String> lines = new ArrayList<>();
            try {
                lines = Files.readAllLines(path);

                System.out.println(lines.get(0)); // author
                // System.out.println(lines.get(3)); // synopsis

            } catch (Exception e){
                e.printStackTrace();

            }*/
    }

