package com.durga;

import java.io.FileReader;
import java.io.IOException;

//Java Program illustrate Reading
//a File in Human Readable
//Format Using FileReader Class

public class CharacterStreamDemo {
	
	// Main driver method
    public static void main(String[] args) throws IOException {

        // Initially assigning null as we have not read
        // anything
        FileReader sourceStream = null;

        // Try block to check for exceptions
        try {

            // Reading from file
            sourceStream = new FileReader(
                "C:\\Users\\Windows\\Documents\\demo.rtf");

            // Reading sourcefile and writing content to
            // target file character by character.

            int temp;

            // If there is content inside file
            // than read
            while ((temp = sourceStream.read()) != -1)
                System.out.print((char)temp);

            // Display message for successful execution of
            // program
            System.out.print(
                "Program successfully executed");
        } catch (Exception e) {
	        e.printStackTrace();
        }
        // finally block that executes for sure
        // where we are closing file connections
        // to avoid memory leakage
        finally {

            // Closing stream as no longer in use
            if (sourceStream != null)
                sourceStream.close();
        }
    }

}
