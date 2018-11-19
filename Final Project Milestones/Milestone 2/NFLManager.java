// Seth Thompson
// CST105
// 11/18/2018
/* This project is my own and all work on it is my own.*/

public class NFLManager {

	/* Create an array of NFLPlayer objects */
	public static NFLPlayer[] createNFL_PlayerArray() {
		NFLPlayer[] nfl_playerArray = new NFLPlayer[6];
		
		nfl_playerArray[0] = new NFLPlayer("Matt", "Ryan", "217", "6-4", "offensive", "4095", "143", "20", "0", "3", "0", "0", "0", "0", "0");
		nfl_playerArray[1] = new NFLPlayer("Ben", "Roethlisberger", "240", "6-5", "offensive", "4251", "47", "28", "0", "1", "0", "0", "0", "0", "0");
		nfl_playerArray[2] = new NFLPlayer("Patrick", "Mahomes", "230", "6-3", "offensive", "284", "10", "0", "0", "0", "0", "0", "0", "0", "0");
		nfl_playerArray[3] = new NFLPlayer("Jared", "Goff", "222", "6-4", "offensive", "3804", "51", "28", "1", "3", "0", "0", "0", "0", "0");
		nfl_playerArray[4] = new NFLPlayer("Aaron", "Rodgers", "225", "6-2", "offensive", "1675", "126", "16", "0", "1", "0", "0", "0", "0", "0");
		nfl_playerArray[5] = new NFLPlayer("Drew", "Brees", "209", "6-0", "offenisve", "4334", "12", "23", "2", "0", "0", "0", "0", "0", "0");
		nfl_playerArray[6] = new NFLPlayer("Philip", "Rivers", "228", "6-5", "offensive", "4515", "-2", "28", "0", "1", "0", "0", "0", "0", "0");
		
		// Return NFLPlayer array
		return nfl_playerArray;
	}
	
	/* Print an array of the total touchdowns of every player in the array */
	public static void printNFL_PlayerArrayTouchdowns(NFLPlayer[] nfl_playerArray) {
		System.out.println("Touchdowns per player:");
		for (int i = 0; i < nfl_playerArray.length; i++) {
			System.out.printf("\n" + nfl_playerArray[i].getTotalTouchdowns2017());
		}
		System.out.println("—————————————————————————————————————————");
	
		// Compute and display the result
		System.out.println("\nThe total area of circles is " + touchdownSum(nfl_playerArray));
	}
	
	/* Add total touchdowns of all players in the array */
	public static double touchdownSum(NFLPlayer[] nfl_playerArray) {
		// Initialize sum of touchdowns
		double touchdownSum = 0;
		// Add areas to sum of touchdowns
		for (int i = 0; i < nfl_playerArray.length; i++) {
			String s = nfl_playerArray[i].getTotalTouchdowns2017();
			int integerOfString = Integer.parseInt(s);
			touchdownSum += integerOfString;
		}
		
		return touchdownSum;
	}
}
