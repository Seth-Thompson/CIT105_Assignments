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
	
	public void createPlayer() {
		for (int i = 0; i <= 6; i++) {
			if (position == "offensive") {
				nfl_playerArray.add(new OffensiveNFLPlayer());
			}
			else if (position == "defensive") {
				nfl_playerArray.add(new DefensiveNFLPlayer());
			}
			else {
				System.out.println("No matching player type");
			}
		}
	}
	
	// test Driver Method for Array of either Offensive or Defensive NFLPlayers
	public void testDriverMethod() {
		NFLManager nfl_playerTest = new NFLManager();
		NFLManager nfl_playerTest2 = new NFLManager("offensive");
		System.out.println(nfl_playerTest.nfl_playerArray.isEmpty());
		nfl_playerTest2.createPlayer();
		System.out.println(nfl_playerTest2.nfl_playerArray.isEmpty());
	}
	
}