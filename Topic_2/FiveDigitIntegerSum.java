// Seth Thompson
// CST105
// 10/28/2018
/* This project is my own and all work on it is my own.*/

import java.util.Scanner;
//Import the Scanner object

public class FiveDigitIntegerSum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Creates the Scanner object for this program
		
		System.out.print("Enter a 5-digit positive integer: ");
		int inputNumber = input.nextInt();
		//Gets input from the console and stores the value for calculations.
		
		int number1 = inputNumber / 10000;
		int number2 = (inputNumber % 10000) / 1000;
		int number3 = (inputNumber % 1000) / 100;
		int number4 = (inputNumber % 100) / 10;
		int number5 = inputNumber % 10;
		int sum = number1 + number2 + number3 + number4 + number5;
		//Calculates the individual numbers that made up the integer using only / and % operations and then sums those numbers.
		
		System.out.println("The sum of the digits is " + number1 + " + " + number2 +" + " + number3 + " + " + number4 + " + " + number5 + " = " + sum);
		//Displays the results.
		
		input.close();
		//Closed the Scanner object

	}

}
