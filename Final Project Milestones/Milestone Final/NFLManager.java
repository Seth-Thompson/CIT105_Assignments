// Seth Thompson
// CST105
// 11/18/2018
/* This project is my own and all work on it is my own.*/

import java.util.ArrayList;

public class NFLManager {

	// initialize position
	private String position;
	// create an array of NFLPlayer objects
	ArrayList <NFLPlayer>nfl_playerArray = new ArrayList<>(6);
	
	public NFLManager() {
		super();
	}
	
	public NFLManager(String position) {
		super();
		this.position = position;
	}
	
	/** new createPlayer() method**/
	public ArrayList<NFLPlayer> createPlayer() {
		nfl_playerArray.add(new OffensiveNFLPlayer("Matt", "Ryan", "6-4", "217", "4095", "143", "20", "0", "3"));
		nfl_playerArray.add(new OffensiveNFLPlayer("Todd", "Gurley", "6-1", "224", "1305", "788", "13", "6", "5"));
		nfl_playerArray.add(new OffensiveNFLPlayer("Aaron", "Rodgers", "6-2", "225", "1675", "126", "16", "0", "1"));
		nfl_playerArray.add(new OffensiveNFLPlayer("Ben", "Roethlisberger", "6-5", "240", "4251", "47", "28", "0", "3"));
		nfl_playerArray.add(new OffensiveNFLPlayer("Julio", "Jones", "6-3", "220", "1444", "15", "3", "0", "0"));
		nfl_playerArray.add(new OffensiveNFLPlayer("Patrick", "Mahomes", "6-3", "230", "284", "10", "0", "0", "0"));
		nfl_playerArray.add(new OffensiveNFLPlayer("Jared", "Goff", "6-4", "222", "3804", "51", "28", "1", "8"));
		nfl_playerArray.add(new OffensiveNFLPlayer("Ezekiel", "Elliott", "6-0", "228", "983", "269", "7", "2", "1"));
		nfl_playerArray.add(new OffensiveNFLPlayer("James", "Conner", "6-1", "233", "144", "0", "0", "0", "0"));
		nfl_playerArray.add(new OffensiveNFLPlayer("Adam", "Thielen", "6-2", "200", "1276", "11", "4", "0", "2"));
		nfl_playerArray.add(new OffensiveNFLPlayer("Mike", "Evans", "6-5", "231", "1001", "0", "4", "0", "1"));
		nfl_playerArray.add(new OffensiveNFLPlayer("Michael", "Thomas", "6-3", "212", "1245", "0", "5", "0", "0"));
		nfl_playerArray.add(new OffensiveNFLPlayer("Tyreek", "Hill", "5-10", "185", "1183", "59", "7", "0", "2"));
		nfl_playerArray.add(new OffensiveNFLPlayer("Dalvin", "Cook", "5-10", "210", "354", "90", "2", "0", "1"));
		nfl_playerArray.add(new OffensiveNFLPlayer("Le'Veon", "Bell", "6-1", "225", "1291", "655", "7", "2", "4"));
		nfl_playerArray.add(new DefensiveNFLPlayer("Kiko", "Alonso", "6-3", "239", "79", "36", "1", "0", "2"));
		nfl_playerArray.add(new DefensiveNFLPlayer("Aaron", "Donald", "6-1", "280", "32", "9", "11", "0", "5"));
		nfl_playerArray.add(new DefensiveNFLPlayer("Xavien", "Howard", "6-1", "192", "42", "6", "1", "4", "0"));
		nfl_playerArray.add(new DefensiveNFLPlayer("Damontae", "Karee", "5-11", "174", "14", "9", "0", "0", "2"));
		nfl_playerArray.add(new DefensiveNFLPlayer("Chandler", "Jones", "6-5", "265", "52", "7", "17", "0", "2"));
		nfl_playerArray.add(new DefensiveNFLPlayer("Blake", "Martinez", "6-2", "237", "96", "48", "1", "1", "1"));
		nfl_playerArray.add(new DefensiveNFLPlayer("Mason", "Foster", "6-1", "250", "22", "9", "1", "1", "0"));
		nfl_playerArray.add(new DefensiveNFLPlayer("Von", "Miller", "6-3", "250", "51", "6", "10", "0", "2"));
		nfl_playerArray.add(new DefensiveNFLPlayer("Myles", "Garrett", "6-4", "272", "19", "12", "7", "0", "1"));
		nfl_playerArray.add(new DefensiveNFLPlayer("Kyle", "Fuller", "5-11", "190", "61", "8", "0", "2", "0"));
		nfl_playerArray.add(new DefensiveNFLPlayer("Danielle", "Hunter", "6-5", "252", "27", "18", "7", "0", "1"));
		nfl_playerArray.add(new DefensiveNFLPlayer("Damontae", "Kazee", "5-11", "174", "14", "9", "0", "0", "2"));
		nfl_playerArray.add(new DefensiveNFLPlayer("Eddie", "Jackson", "6-0", "202", "55", "18", "0", "2", "1"));
		nfl_playerArray.add(new DefensiveNFLPlayer("Calais", "Campbell", "6-8", "300", "47", "20", "14", "0", "3"));
		nfl_playerArray.add(new DefensiveNFLPlayer("Demarcus", "Lawrence", "6-3", "265", "35", "23", "14", "0", "4"));
		return nfl_playerArray;
	}
	
	/** commented out the original createPlayer() method which was to pull players from a file.**/
	//public void createPlayer() {
	//	for (int i = 0; i <= 6; i++) {
	//		if (position == "offensive") {
	//			nfl_playerArray.add(new OffensiveNFLPlayer());
	//		}
	//		else if (position == "defensive") {
	//			nfl_playerArray.add(new DefensiveNFLPlayer());
	//		}
	//		else {
	//			System.out.println("No matching player type");
	//		}
	//	}
	//}
	
	// test Driver Method for Array of either Offensive or Defensive NFLPlayers
	public void testDriverMethod() {
		NFLManager nfl_playerTest = new NFLManager();
		NFLManager nfl_playerTest2 = new NFLManager("offensive");
		System.out.println(nfl_playerTest.nfl_playerArray.isEmpty());
		nfl_playerTest2.createPlayer();
		System.out.println(nfl_playerTest2.nfl_playerArray.isEmpty());
	}
	
}