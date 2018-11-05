// Seth Thompson
// CST105
// 11/4/2018
/* This project is my own and all work on it is my own.*/

import java.util.Scanner;
//Import the Scanner object

import java.io.*;
//Import the Java io object.

public class PigLatin {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("G:\\test.txt"));
		//Creates the Scanner object for this program to pull from the "file test.txt".
		
		String word1 = input.next();
		if (word1.isEmpty()) {
		}
		else {
			if (word1.contains("a")) {
				int aIndex = word1.indexOf('a');
			}
			if (word1.contains("e")) {
				int eIndex = word1.indexOf('e');
			}
			if (word1.contains("i")) {
				int iIndex = word1.indexOf('i');
			}
			if (word1.contains("o")) {
				int oIndex = word1.indexOf('o');
			}
			if (word1.contains("u")) {
				int uIndex = word1.indexOf('u');
			}
			String letter1 = word1.substring(0,1);
			pig1.toUpperCase();
			System.out.printf("%-15s%-15s", word1, pig1);
		};
		
		input.close();
		//Closed the Scanner object
		
	}

}
