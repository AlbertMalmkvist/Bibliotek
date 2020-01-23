package com.company;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AddBook {
    FileUtility fileUtility = new FileUtility();

    PrintWriter writer;

    {
        try {
            writer = new PrintWriter("the-file-name.txt", "UTF-8");


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
