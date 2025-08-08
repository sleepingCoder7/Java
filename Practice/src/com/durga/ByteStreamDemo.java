package com.durga;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//Java Program Illustrate ByteStream Class to
//Copy Contents of One File to Another File

public class ByteStreamDemo {

	public static void main(String[] args) throws IOException {

		// Initially assigning null ot objects for
		// reading and writing to file
		FileInputStream sourceStream = null;
		FileOutputStream targetStream = null;

		// Try block to check for exceptions
		try {

			// Passing the files via local directory
			sourceStream = new FileInputStream("C:\\Users\\Windows\\Documents\\demo.rtf");
			targetStream = new FileOutputStream("C:\\Users\\Windows\\Documents\\democopy.rtf");

			// Reading source file and writing content to
			// target file byte by byte
			int temp;

			// If there is content inside file
			// than read
			while ((temp = sourceStream.read()) != -1) {
				System.out.print((byte) temp);
				targetStream.write((byte) temp);
			}
			// Display message for successful execution of
			// program
			System.out.print("\nProgram successfully executed");
		}

		// finally block that executes for sure
		// where we are closing file connections
		// to avoid memory leakage
		finally {

			if (sourceStream != null)
				sourceStream.close();

			if (targetStream != null)
				targetStream.close();
		}
	}
}
