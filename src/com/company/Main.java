package com.company;

import java.io.IOException;

public class Main {
       static String[] names = {
                "Arne",
                "Elsa",
                "Johan",
                "Albert"
        };

    public static void main(String[] args) throws IOException {
	// write your code here


        printName("aLbE");


        Biblotek biblotek = new Biblotek();
        biblotek.Choices();
    }

    static void printName(String searchName) {
        for(String name : names) {
            if(name.toLowerCase().contains(searchName.toLowerCase())) {
                System.out.println("Matching: " + name);
            }
        }
    }
}
