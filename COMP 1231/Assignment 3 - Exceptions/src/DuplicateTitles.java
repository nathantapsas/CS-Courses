//*******************************************************************************************************
// DuplicateTitles.java
//
// COMP 1231 Assignment 3: Exceptions (Question 2)
//
//
//
//
//
//
//*******************************************************************************************************
package com.company;
import java.io.*;
import java.util.Set;
import java.util.TreeSet;


public class DuplicateTitles {

    public static void main(String[] args) throws IOException {
        
        // Input and output file paths
        String inFileName = "src/Files/bookTitles.inp";
        String outFileName = "src/Files/duplicateTitles.out";

        // Use a set to store book titles
        Set<String> titles = new TreeSet<>();
        // Use a set to store duplicates
        Set<String> duplicates = new TreeSet<>();

        BufferedReader reader = new BufferedReader(new FileReader(inFileName));
        PrintWriter writer = new PrintWriter(outFileName);

        // Store the current line as a String
        String line;

        while((line = reader.readLine()) != null) {
            // If we have a duplicate, add it to the duplicates Set
            if(!titles.add(line)) duplicates.add(line);
        }
        reader.close();

        // Print the duplicates to the output file
        duplicates.forEach(writer::println);

        writer.close();
    }
}
