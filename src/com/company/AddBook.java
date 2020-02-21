package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class AddBook {
    public AddBook() throws IOException {
        Code();
    }

    public void Code() throws IOException {
        Scanner inputFromUser = new Scanner(System.in);

        System.out.println("Please enter book title(make sure to spell it correctly, with upper and lowercase letters in the right places).");

        String text = inputFromUser.nextLine();

        text = text+".txt";

        Path path = Paths.get("src/com/company/Books/AllBooks/"+text);
        File file = new File(path.toString());
        Path patha = Paths.get("src/com/company/Books/AvailableBooks/"+text);
        File filea= new File(patha.toString());

        //checks so the book doesnt already exist
        if(Files.exists(Paths.get(text))){
        } else {
            //creates two new files in the AllBooks directory and the Available Books directory
            file.createNewFile();
            filea.createNewFile();

            System.out.println("Enter authors name:");
            String author = inputFromUser.nextLine();

            System.out.println("Enter synopsis:");
            String synopsis = inputFromUser.nextLine();

            //adds the input from author on the first row and the input from synopsis on the second row.
            Files.write(path, (author + System.lineSeparator()).getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            Files.write(path, synopsis.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);


        }
    }
}
