// Seth Thompson
// CST105
// 11/24/2018
/* This project is my own and all work on it is my own.*/

public class PalindramaticPrime {

	public static void main(String[] args) {
	// a program to test and display the primes that are also palindromes between 0 and 100,000.
		for(int i=2; i < 100001; i++) {
		/* since a prime cannot be 0 or 1 the loop starts at 2
		 * the loop then ends after checking 100,000.
		 */
			if (isPalindramaticPrime(i) == true) {
			// if the integer is a prime and a palindrome then the number is displayed to the console
				System.out.println(i);
			}
		}
	}
	
	public static boolean isPalindramaticPrime(int x) {
		if (isPrime(x) == true && isPalindrome(x) == true) {
		// if an integer is both a prime and a palindrome then it is returned as true.
		// since primes are more exclusive than palindromes these are checked first.
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean isPalindrome(int x) {
		int x2 = reverse(x);
		// a second integer is created that is the reverse of the first integer.
		if(x == x2) {
		// if the first integer is the same as the second then the number is a palindrome.
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean isPrime(int x) {
        if (x == 2) {
       	// 2 is always a prime.
       		return true;
       	}
       	for(int i = x - 1; i > 1; i--) {
       	/* runs a loop to check each value by the division of all numbers under it.
       	 * if the numbers are divisible then the remainder will be zero.
       	 * modulus can be used to check this remainder.
       	 * if the modulus is zero then it is not prime as it has divisible numbers.
       	 * if the modulus is never zero then it has to be true.
       	 */
       		if(x % i == 0) {
       			return false;
       		}
       	}
       	return true;
    }
	
	public static int reverse(int x) {
		/* the integer is firstly converted into a string.
		 * This string can then be used to construct a StringBuilder to take advantage of the .reverse() method.
		 * Afterwards the reversed stringbuilder can then be saved to a new string.
		 * This new string is then converted to an integer and returned.
		 */
		String s = Integer.toString(x);
		StringBuilder stringBuilder = new StringBuilder(s);
		stringBuilder.reverse();
		String s2 = stringBuilder.toString();
		return Integer.parseInt(s2);
	}
}
