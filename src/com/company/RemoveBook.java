package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class RemoveBook {
    public RemoveBook() throws IOException {

        Scanner inputFromUser = new Scanner(System.in);

        String text = inputFromUser.nextLine();

        Path path = Paths.get("src/com/company/Books/AllBooks"+text);
        File file = new File(path.toString());


        Path pathA= Paths.get("src/com/company/Books/AvailableBooks"+text);
        File fileA = new File(pathA.toString());

        Path pathB = Paths.get("src/com/company/Books/AvailableBooks");

        File fileB= new File(pathB.toString());
        String[] fileList = fileB.list();

        int a = 0;
        if(Files.exists(Paths.get(text))){
            a=0;
        for (String name : fileList) {
            if(name == text){
                fileA.delete();
                file.delete();
                a++;
                } else{
                }
            }} else{
            }
        if (a == 0){
            System.out.println("This book is currently being borrowed");
        }
        }
        //FileUtility fileUtility = new FileUtility();
    }