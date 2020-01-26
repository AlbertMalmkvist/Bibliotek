package com.company;


import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class BookList {
    public BookList() {
        Path path = Paths.get("src/com/company/Books/AvailableBooks");
        File file = new File(path.toString());
        String[] fileList = file.list();
        for (String name : fileList) {
            System.out.println(name);
            printAllLines(name);
        }


        }
        public void printAllLines(String filename) {
            Path path = Paths.get("src/com/company/Books/AvailableBooks" + filename);
            List<String> lines = new ArrayList<>();
            try {
                lines = Files.readAllLines(path);

                System.out.println(lines.get(0)); // author
                // System.out.println(lines.get(3)); // synopsis

            } catch (Exception e){
                e.printStackTrace();
            }


}
}
