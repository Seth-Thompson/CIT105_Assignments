// Seth Thompson
// CST105
// 11/18/2018
/* This project is my own and all work on it is my own.*/

public class TestNFLPlayer {

	public static void main(String[] args) {
		//constructor that takes no argument
		NFLPlayer nfl_player1 = new NFLPlayer();
		
		//constructor that takes an argument
		NFLPlayer nfl_player2 = new NFLPlayer("Kiko", "Alonso", "239", "6-3", "defensive", "0", "0", "0", "0", "0", "79", "36", "1", "0", "2");
		
		//use of setter
		NFLPlayer nfl_player3 = new NFLPlayer();
		nfl_player3.setFirstName("Matt");
		nfl_player3.setLastName("Ryan");
		nfl_player3.setPassingTouchdowns2017("20");
		nfl_player3.setRushingTouchdowns2017("2");
		
		//demonstration of program and use of getter
		System.out.println("The base first name of nfl_player1 is \"" + nfl_player1.firstName + "\".");
		System.out.println("The base first name of nfl_player2 is \"" + nfl_player2.firstName + "\".");
		System.out.println("The base last name of nfl_player2 is \"" + nfl_player2.lastName + "\".");
		System.out.println("The full name of nfl_player2 is \"" + nfl_player2.getFullName() + "\".");
		System.out.println("The assigned first name of nfl_player3 is \"" + nfl_player3.firstName + "\".");
		System.out.println("The assigned last name of nfl_player3 is \"" + nfl_player3.lastName + "\".");
		System.out.println("The full name of nfl_player3 is \"" + nfl_player3.getFullName() + "\".");
		System.out.println("The base passing touchdowns of nfl_player3 is \"" + nfl_player3.passingTouchdowns2017 + "\".");
		System.out.println("The base rushing touchdowns of nfl_player3 is \"" + nfl_player3.rushingTouchdowns2017 + "\".");
		System.out.println("The total touchdowns of nfl_player3 is \"" + nfl_player3.getTotalTouchdowns2017() + "\".");
		
		/* I could not get the Array to properly be created.
		 * The Array is correctly built to my best knowledge, so I think the issue comes in from pulling from two different classes.
		 * Here is what I would write if I could figure that part out.*/
		// Declare nfl_playerArray
		//NFLPlayer[] nfl_playerArray;
		// Create nfl_playerArray
		//nfl_playerArray = createNFL_PlayerArray();
		// Print nfl_playerArray and total touchdowns of all the players.
		//printNFL_PlayerArraytouchdowns(nfl_playerArray);

	}

}
