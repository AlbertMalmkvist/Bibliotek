package com.company;


import java.io.File;

public class BookList {
    public BookList() {
        File file = new File("c://Users//Lennart//IdeaProjects//Library//src//com//company//Users//");
        String[] fileList = file.list();
        for (String name : fileList) {
            System.out.println(name);
        }
    }
}
