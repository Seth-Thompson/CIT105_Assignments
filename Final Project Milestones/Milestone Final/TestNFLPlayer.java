// Seth Thompson
// CST105
// 11/18/2018
/* This project is my own and all work on it is my own.*/

public class TestNFLPlayer {

	public static void main(String[] args) {
		//constructor that takes no argument
		OffensiveNFLPlayer nfl_player1 = new OffensiveNFLPlayer();
		
		//constructor that takes an argument
		DefensiveNFLPlayer nfl_player2 = new DefensiveNFLPlayer("Kiko", "Alonso", "6-3", "239", "79", "36", "1", "0", "2");
		
		//constructor of an array
		NFLManager nfl_playerArray1 = new NFLManager();
		NFLManager nfl_playerArray2 = new NFLManager("offensive");
		nfl_playerArray2.createPlayer();
		
		//use of setter
		OffensiveNFLPlayer nfl_player3 = new OffensiveNFLPlayer();
		nfl_player3.setFirstName("Matt");
		nfl_player3.setLastName("Ryan");
		
		//demonstration of program and use of getter
		System.out.println("The base first name of nfl_player1 is \"" + nfl_player1.getFirstName() + "\".");
		System.out.println("The base first name of nfl_player2 is \"" + nfl_player2.getFirstName() + "\".");
		System.out.println("The base last name of nfl_player2 is \"" + nfl_player2.getLastName() + "\".");
		System.out.println("The full name of nfl_player2 is \"" + nfl_player2.getFullName() + "\".");
		System.out.println("The position that " + nfl_player2.getFullName() + " plays is " + nfl_player2.getPosition() + ".");
		System.out.println("The assigned first name of nfl_player3 is \"" + nfl_player3.getFirstName() + "\".");
		System.out.println("The assigned last name of nfl_player3 is \"" + nfl_player3.getLastName() + "\".");
		System.out.println("The full name of nfl_player3 is \"" + nfl_player3.getFullName() + "\".");
		System.out.println("(t/f) The nfl_playerArray1 is empty upon it's creation: " + nfl_playerArray1.nfl_playerArray.isEmpty());
		System.out.println("(t/f) When we create a player in nfl_playerArray2 the array is still empty: " + nfl_playerArray2.nfl_playerArray.isEmpty());
		
		
		
	}

}
