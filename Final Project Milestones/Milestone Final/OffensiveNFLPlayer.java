// Seth Thompson
// CST105
// 11/25/2018
/* This project is my own and all work on it is my own.*/

public class OffensiveNFLPlayer extends NFLPlayer {
	private static String position = "offensive";
	private String passingYards2017 = "Not Set";
	private String rushingYards2017 = "Not Set";
	private String passingTouchdowns2017 = "Not Set";
	private String rushingTouchdowns2017 = "Not Set";
	private String fumbles2017 = "Not Set";
	
	public OffensiveNFLPlayer() {
		super();
	}
	
	public OffensiveNFLPlayer(String firstName, String lastName, String height, String weight, String passingYards2017, String rushingYards2017, String passingTouchdowns2017, String rushingTouchdowns2017, String fumbles2017) {
		super(firstName, lastName, weight, height);
		this.passingYards2017 = passingYards2017;
		this.rushingYards2017 = rushingYards2017;
		this.passingTouchdowns2017 = passingTouchdowns2017;
		this.rushingTouchdowns2017 = rushingTouchdowns2017;
		this.fumbles2017 = fumbles2017;
	}
	
	// test Driver Method for Offensive NFLPlayers
	public void testDriverMethod() {
		OffensiveNFLPlayer nfl_playerTest = new OffensiveNFLPlayer();
		nfl_playerTest.setPassingYards2017("4095");
		nfl_playerTest.setRushingYards2017("143");
		nfl_playerTest.setPassingTouchdowns2017("20");
		nfl_playerTest.setRushingTouchdowns2017("0");
		nfl_playerTest.setFumbles2017("3");
		System.out.println(nfl_playerTest.getPosition());
		System.out.println(nfl_playerTest.getTotalYards2017());
		System.out.println(nfl_playerTest.getTotalTouchdowns2017());
		OffensiveNFLPlayer nfl_playerTest2 = new OffensiveNFLPlayer("Matt", "Ryan", "6-4", "217", "4095", "143", "20", "0", "3");
		System.out.println(nfl_playerTest2.getPosition());
		System.out.println(nfl_playerTest.getTotalYards2017());
		System.out.println(nfl_playerTest.getTotalTouchdowns2017());
	}
	
	public String getPosition() {
		return position;
	}
	
	public String getPassingYards2017() {
		return passingYards2017;
	}
	
	public String getRushingYards2017() {
		return rushingYards2017;
	}
	
	public void setPassingYards2017(String passingYards2017) {
		this.passingYards2017 = passingYards2017;
	}
	
	public void setRushingYards2017(String rushingYards2017) {
		this.rushingYards2017 = rushingYards2017;
	}
	
	public String getTotalYards2017() {
		int integerPassingYards2017 = Integer.parseInt(passingYards2017);
		int integerRushingYards2017 = Integer.parseInt(rushingYards2017);
		int integerTotalYards = integerPassingYards2017 + integerRushingYards2017;
		String totalYards = Integer.toString(integerTotalYards);
		return totalYards;
	}
	
	public String getPassingTouchdowns2017() {
		return passingTouchdowns2017;
	}
	
	public String getRushingTouchdowns2017() {
		return rushingTouchdowns2017;
	}
	
	public void setPassingTouchdowns2017(String passingTouchdowns2017) {
		this.passingTouchdowns2017 = passingTouchdowns2017;
	}
	
	public void setRushingTouchdowns2017(String rushingTouchdowns2017) {
		this.rushingTouchdowns2017 = rushingTouchdowns2017;
	}
	
	public String getTotalTouchdowns2017() {
		int integerPassingTouchdowns2017 = Integer.parseInt(passingTouchdowns2017);
		int integerRushingTouchdowns2017 = Integer.parseInt(rushingTouchdowns2017);
		int integerTotalTouchdowns = integerPassingTouchdowns2017 + integerRushingTouchdowns2017;
		String totalTouchdowns = Integer.toString(integerTotalTouchdowns);
		return totalTouchdowns;
	}
	
	public String getFumbles2017() {
		return fumbles2017;
	}
	
	public void setFumbles2017(String fumbles2017) {
		this.fumbles2017 = fumbles2017;
	}
}
