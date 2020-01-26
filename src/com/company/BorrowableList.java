package com.company;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class BorrowableList {
    public BorrowableList() {
        Path path = Paths.get("src/com/company/Books/AvailableBooks");
        File file = new File(path.toString());
        String[] fileList = file.list();
        //just tells you which books you can borrow at the moment

        for (String name : fileList) {
            System.out.println(name.replace(".txt", "")); // bookname
        }
    }
    }
