// Seth Thompson
// CST105
// 10/28/2018
/* This project is my own and all work on it is my own.*/

import java.util.Scanner;
//Import the Scanner object

public class FahrenheitAndCelsius {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Creates the Scanner object for this program
		
		System.out.print("Enter a Fahrenheit temperature: ");
		double inputFahrenheit = input.nextInt();
		//Gets input from the console for a Fahrenheit temperature.
		
		double Celsius = (inputFahrenheit - 32) * (5.0/9.0);
		//Calculates Fahrenheit to Celsius
		
		System.out.println(inputFahrenheit + "F is equivalent to " + Celsius + "C");
		//Displays the results
		
		System.out.print("Enter a Fahrenheit temperature: ");
		double inputCelsius = input.nextInt();
		//Gets input from the console for a Celsius temperature.
		
		double Fahrenheit = (inputCelsius * (9.0/5.0)) + 32;
		//Calculates Celsius to Fahrenheit
		
		System.out.println(inputCelsius + "C is equivalent to " + Fahrenheit + "F");
		//Displays the results
		
		input.close();
		//Closed the Scanner object.

	}

}
