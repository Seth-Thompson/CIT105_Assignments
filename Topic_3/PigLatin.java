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
		//Creates the Scanner object for this program to pull from the file "test.txt".
				
		String word1 = input.next();
		String pig1 = word1;
		//The two words to appear in each column are defined.
		
		if (word1.isEmpty()) {}
		//If the file is empty the program does not run.
		else if (word1.indexOf('a') == 0 || word1.indexOf('A') == 0) {
		//The word is first checked to see if it starts with a vowel.
				pig1 = word1 + "way";						
				//If the word does start with a vowel it is converted as such to pig latin.
		}
		else if (word1.indexOf('e') == 0 || word1.indexOf('E') == 0) {
			pig1 = word1 + "way";
		}
		else if (word1.indexOf('i') == 0 || word1.indexOf('I') == 0) {
			pig1 = word1 + "way";
		}
		else if (word1.indexOf('o') == 0 || word1.indexOf('O') == 0) {
			pig1 = word1 + "way";
		}
		else if (word1.indexOf('u') == 0 || word1.indexOf('U') == 0) {
			pig1 = word1 + "way";
		}
		else {
		//If the word does not start with a vowel it is checked to see if it only starts with one consonant sound.
			if (word1.indexOf('a') == 1 || word1.indexOf('A') == 1) {
			//If the word does start with only one consonant sound it is converted as such to pig latin.
				char startChar = word1.charAt(0);
				String word2 = word1.substring(1,word1.length());
				pig1 = word2.trim() + startChar + "ay";
			}
			else if (word1.indexOf('e') == 1 || word1.indexOf('E') == 1) {
				char startChar = word1.charAt(0);
				String word2 = word1.substring(1,word1.length());
				pig1 = word2.trim() + startChar + "ay";
			}
			else if (word1.indexOf('i') == 1 || word1.indexOf('I') == 1) {
				char startChar = word1.charAt(0);
				String word2 = word1.substring(1,word1.length());
				pig1 = word2.trim() + startChar + "ay";
			}
			else if (word1.indexOf('o') == 1 || word1.indexOf('O') == 1) {
				char startChar = word1.charAt(0);
				String word2 = word1.substring(1,word1.length());
				pig1 = word2.trim() + startChar + "ay";
			}
			else if (word1.indexOf('u') == 1 || word1.indexOf('U') == 1) {
				char startChar = word1.charAt(0);
				String word2 = word1.substring(1,word1.length());
				pig1 = word2.trim() + startChar + "ay";
			}
			else {
			//If neither of those are true then the word is a consonant blend and is converted as such to pig latin
				String consonantBlend = word1.substring(0,2);
				String word2 = word1.substring(2,(word1.length()-1));
				pig1 = word2.trim() + consonantBlend + "ay";
			};
		};
		
		pig1 = pig1.toUpperCase();
		//The pig latin word is converted to all caps.
		System.out.printf("%-15s%-15s", word1, pig1);
		//The output is given in the correct format.
		
		while (input.hasNextLine()) {
		//So long as the file contains words in the line the loop is executed exactly as above.
			word1 = input.next();
			pig1 = word1;
			if (word1.isEmpty()) {
			}
			else if (word1.indexOf('a') == 0 || word1.indexOf('A') == 0) {
					pig1 = word1 + "way";						
			}
			else if (word1.indexOf('e') == 0 || word1.indexOf('E') == 0) {
				pig1 = word1 + "way";
			}
			else if (word1.indexOf('i') == 0 || word1.indexOf('I') == 0) {
				pig1 = word1 + "way";
			}
			else if (word1.indexOf('o') == 0 || word1.indexOf('O') == 0) {
				pig1 = word1 + "way";
			}
			else if (word1.indexOf('u') == 0 || word1.indexOf('U') == 0) {
				pig1 = word1 + "way";
			}
			else {
				if (word1.indexOf('a') == 1 || word1.indexOf('A') == 1) {
					char startChar = word1.charAt(0);
					String word2 = word1.substring(1,word1.length());
					pig1 = word2.trim() + startChar + "ay";
				}
				else if (word1.indexOf('e') == 1 || word1.indexOf('E') == 1) {
					char startChar = word1.charAt(0);
					String word2 = word1.substring(1,word1.length());
					pig1 = word2.trim() + startChar + "ay";
				}
				else if (word1.indexOf('i') == 1 || word1.indexOf('I') == 1) {
					char startChar = word1.charAt(0);
					String word2 = word1.substring(1,word1.length());
					pig1 = word2.trim() + startChar + "ay";
				}
				else if (word1.indexOf('o') == 1 || word1.indexOf('O') == 1) {
					char startChar = word1.charAt(0);
					String word2 = word1.substring(1,word1.length());
					pig1 = word2.trim() + startChar + "ay";
				}
				else if (word1.indexOf('u') == 1 || word1.indexOf('U') == 1) {
					char startChar = word1.charAt(0);
					String word2 = word1.substring(1,word1.length());
					pig1 = word2.trim() + startChar + "ay";
				}
				else {
					String consonantBlend = word1.substring(0,2);
					String word2 = word1.substring(2,(word1.length()-1));
					pig1 = word2.trim() + consonantBlend + "ay";
				};
			};
			
			pig1 = pig1.toUpperCase();
			System.out.print("\n");
			//Since each new word will have to be displayed on a new line each output must be placed on a new line before being displayed.
			System.out.printf("%-15s%-15s", word1, pig1);
		}
	};
		
		//input.close();
		//Attempted to closed the Scanner object, but I'm not sure of the formatting for closing scanner objects reading from files
		
}