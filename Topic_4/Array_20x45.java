// Seth Thompson
// CST105
// 11/4/2018
/* This project is my own and all work on it is my own.*/

import java.util.Scanner;
//Import the Scanner object

import java.io.*;
//Import the Java io object.

public class Array_20x45 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("G:\\test.txt"));
		//Creates the Scanner object for this program to pull from the file "test.txt".
				
		//int numRows = input.nextInt();
		//int numColumns = input.nextInt();
		String s;
		char[][] myMatrix = new char[20][45]; 
		
		for (int row = 0; row < myMatrix.length; row++) {
			
			s = input.next();
			if (s.isEmpty()) {
				s = "@";
			}
			
			for (int column = 0; column < myMatrix[row].length; column++) {
				
				myMatrix[row][column] = s.charAt(column);
				
				System.out.print(myMatrix[column][row] + " ");
			}
		}
	}

}
