package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class RemoveBook {
    public RemoveBook() throws IOException {

        Scanner inputFromUser = new Scanner(System.in);

        System.out.println("Input book title(make sure its spelled correctly, with upper and lowercase letters in the right places).");
        String text = inputFromUser.nextLine();

        text = text+".txt";

        Path path = Paths.get("src/com/company/Books/AllBooks/"+text);
        File file = new File(path.toString());


        Path pathA= Paths.get("src/com/company/Books/AvailableBooks/"+text);
        File fileA = new File(pathA.toString());

        Path pathB = Paths.get("src/com/company/Books/AvailableBooks");
        File fileB= new File(pathB.toString());

        File[] listOfFiles = fileB.listFiles();
        for (File filename : listOfFiles) {
            if (filename.isFile()) {
                String name = filename.getName();
                //checks in available books if the book is there, otherwise it doesnt delete the file, as someone is borrowing the book
                if (text.toLowerCase().equals(name.toLowerCase())){
                    file.delete();
                    fileA.delete();
                } else{
                }
            }
        }
    }
    public void Code(){

    }
}