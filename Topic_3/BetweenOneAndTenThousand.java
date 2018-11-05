// Seth Thompson
// CST105
// 11/4/2018
/* This project is my own and all work on it is my own.*/

import java.util.Scanner;
//Import the Scanner object

public class BetweenOneAndTenThousand {

	public static void main(String[] args) {
		int ranNumber = (int)(Math.random() * 10000);
		//Generate a random number between 0 and 10,000
		
		Scanner input = new Scanner(System.in);
		//Creates the Scanner object for this program
		
		int low = 1;
		int high = 10000;
		int count = 0;
		boolean data = false;
		//Set all base values for the loop
		
		do {
		//Use the do-while loop because it checks the conditions at the end.
			System.out.println("Enter a guess between " + low + " and " + high + ":");
			int inputGuess = input.nextInt();
			if (inputGuess > ranNumber && inputGuess < high) {
			//If the guess is too high the user is told and the question is updated.
				high = inputGuess--;
				System.out.println("LOWER");
			}
			if (inputGuess < ranNumber && inputGuess > low) {
			//If the guess is too low the user is told and the question is updated.
				low = inputGuess++;
				System.out.println("HIGHER");
			}
			count++;
			/*The number of guesses are counted.
			 *Since a guess can only be either higher, lower, or correct
			 *and a correct answer is the only guess that would not prompt another attempt
			 *the count needs to come after the higher or lower if statements, but before the correct answer if statement.
			 */
			if (inputGuess == ranNumber) {
			//If the guess correct the user is told and data boolean for the do-while loop is changed to "true" to end the loop.
				System.out.println("You WIN. it took you " + count + " guesses.");
				data = true;
			}
		} while (data == false);
		//The loop is ended with all results having been displayed and counted correctly.
		
		input.close();
		//Closed the Scanner object
	}
}
