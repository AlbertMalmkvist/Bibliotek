package com.company;

import java.io.File;

public class BorrowableList {
    public BorrowableList() {
        File file = new File("c://Users//Lennart//IdeaProjects//Library//src//com//company//Books//AvailableBooks");
        String[] fileList = file.list();
        for (String name : fileList) {
            System.out.println(name);
        }
    }
}