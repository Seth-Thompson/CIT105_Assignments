// Seth Thompson
// CST105
// 11/25/2018
/* This project is my own and all work on it is my own.*/

public class DefensiveNFLPlayer extends NFLPlayer {
	private static String position = "defensive";
	private String tackles2017 = "Not Set";
	private String assistedTackles2017 = "Not Set";
	private String sacks2017 = "Not Set";
	private String interceptions2017 = "Not Set";
	private String forcedFumbles2017 = "Not Set";

	public DefensiveNFLPlayer() {
		super();
	}
	
	public DefensiveNFLPlayer(String firstName, String lastName, String height, String weight, String tackles2017, String assistedTackles2017, String sacks2017, String interceptions2017, String forcedFumbles2017) {
		super(firstName, lastName, weight, height);
		this.tackles2017 = tackles2017;
		this.assistedTackles2017 = assistedTackles2017;
		this.sacks2017 = sacks2017;
		this.interceptions2017 = interceptions2017;
		this.forcedFumbles2017 = forcedFumbles2017;
	}
	
	// test Driver Method for Defensive NFLPlayers
	public void testDriverMethod() {
		DefensiveNFLPlayer nfl_playerTest = new DefensiveNFLPlayer();
		nfl_playerTest.setTackles2017("79");
		nfl_playerTest.setAssistedTackles2017("36");
		nfl_playerTest.setSacks2017("1");
		nfl_playerTest.setInterceptions2017("0");
		nfl_playerTest.setForcedFumbles2017("2");
		System.out.println(nfl_playerTest.getPosition());
		System.out.println(nfl_playerTest.getTotalTackles2017());
		DefensiveNFLPlayer nfl_playerTest2 = new DefensiveNFLPlayer("Kiko", "Alonso", "6-3", "239", "79", "36", "1", "0", "2");
		System.out.println(nfl_playerTest2.getPosition());
		System.out.println(nfl_playerTest.getTotalTackles2017());
	}
	
	public String getPosition() {
		return position;
	}
	
	public String getTackles2017() {
		return tackles2017;
	}
	
	public String getAssistedTackles2017() {
		return assistedTackles2017;
	}
	
	public void setTackles2017(String tackles2017) {
		this.tackles2017 = tackles2017;
	}
	
	public void setAssistedTackles2017(String assistedTackles2017) {
		this.assistedTackles2017 = assistedTackles2017;
	}
	
	public String getTotalTackles2017() {
		int integerTackles2017 = Integer.parseInt(tackles2017);
		int integerAssistedTackles2017 = Integer.parseInt(assistedTackles2017);
		int integerTotalTackles = integerTackles2017 + integerAssistedTackles2017;
		String totalTackles = Integer.toString(integerTotalTackles);
		return totalTackles;
	}
	
	public String getSacks2017() {
		return sacks2017;
	}
	
	public void setSacks2017(String sacks2017) {
		this.sacks2017 = sacks2017;
	}
	
	public String getInterceptions2017() {
		return interceptions2017;
	}
	
	public void setInterceptions2017(String interceptions2017) {
		this.interceptions2017 = interceptions2017;
	}
	
	public String getForcedFumbles2017() {
		return forcedFumbles2017;
	}
	
	public void setForcedFumbles2017(String forcedFumbles2017) {
		this.forcedFumbles2017 = forcedFumbles2017;
	}
}
