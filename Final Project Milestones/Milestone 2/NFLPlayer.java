// Seth Thompson
// CST105
// 11/18/2018
/* This project is my own and all work on it is my own.*/

public class NFLPlayer {

	//initializing all variables
	String firstName = "Not Set";
	String lastName = "Not Set";
	String weight = "Not Set";
	String height = "Not Set";
	String position = "Not Set";
	String passingYards2017 = "Not Set";
	String rushingYards2017 = "Not Set";
	String passingTouchdowns2017 = "Not Set";
	String rushingTouchdowns2017 = "Not Set";
	String fumbles2017 = "Not Set";
	String tackles2017 = "Not Set";
	String assistedTackles2017 = "Not Set";
	String sacks2017 = "Not Set";
	String interceptions2017 = "Not Set";
	String forcedFumbles2017 = "Not Set";
	
	//constructor that takes no argument
	public NFLPlayer() {
	}
	
	//constructor that takes an argument for every property
	public NFLPlayer(String newFirstName, String newLastName, String newWeight, String newHeight, String newPosition, String newPassingYards2017, String newRushingYards2017, String newPassingTouchdowns2017, String newRushingTouchdowns2017, String newFumbles2017, String newTackles2017, String newAssistedTackles2017, String newSacks2017, String newInterceptions2017, String newForcedFumbles2017){
		firstName = newFirstName;
		lastName = newLastName;
		weight = newWeight;
		height = newHeight;
		position = newPosition;
		passingYards2017 = newPassingYards2017;
		rushingYards2017 = newRushingYards2017;
		passingTouchdowns2017 = newPassingTouchdowns2017;
		rushingTouchdowns2017 = newRushingTouchdowns2017;
		fumbles2017 = newFumbles2017;
		tackles2017 = newTackles2017;
		assistedTackles2017 = newAssistedTackles2017;
		sacks2017 = newSacks2017;
		interceptions2017 = newInterceptions2017;
		forcedFumbles2017 = newForcedFumbles2017;
	}
	
	//all setters and getters for NFLPlayer
	public void setFirstName(String newFirstName) {
		firstName = newFirstName;
	}
	
	public void setLastName(String newLastName) {
		lastName = newLastName;
	}
	
	public String getFullName() {
		String fullName = firstName + " " + lastName;
		return fullName;
	}
	
	public void setWeight(String newWeight) {
		weight = newWeight;
	}
	
	public void setHeight(String newHeight) {
		height = newHeight;
	}
	
	public void setPosition(String newPosition) {
		position = newPosition;
	}
	
	public void setPassingYards2017(String newPassingYards2017) {
		passingYards2017 = newPassingYards2017;
	}
	
	public void setRushingYards2017(String newRushingYards2017) {
		rushingYards2017 = newRushingYards2017;
	}
	
	public String getTotalYards2017() {
		int integerPassingYards2017 = Integer.parseInt(passingYards2017);
		int integerRushingYards2017 = Integer.parseInt(rushingYards2017);
		int integerTotalYards = integerPassingYards2017 + integerRushingYards2017;
		String totalYards = Integer.toString(integerTotalYards);
		return totalYards;
	}
	
	public void setPassingTouchdowns2017(String newPassingTouchdowns2017) {
		passingTouchdowns2017 = newPassingTouchdowns2017;
	}
	
	public void setRushingTouchdowns2017(String newRushingTouchdowns2017) {
		rushingTouchdowns2017 = newRushingTouchdowns2017;
	}
	
	public String getTotalTouchdowns2017() {
		int integerPassingTouchdowns2017 = Integer.parseInt(passingTouchdowns2017);
		int integerRushingTouchdowns2017 = Integer.parseInt(rushingTouchdowns2017);
		int integerTotalTouchdowns = integerPassingTouchdowns2017 + integerRushingTouchdowns2017;
		String totalTouchdowns = Integer.toString(integerTotalTouchdowns);
		return totalTouchdowns;
	}
	
	public void setFumbles2017(String newFumbles2017) {
		fumbles2017 = newFumbles2017;
	}
	
	public void setTackles2017(String newTackles2017) {
		tackles2017 = newTackles2017;
	}
	
	public void setAssistedTackles2017(String newAssistedTackles2017) {
		assistedTackles2017 = newAssistedTackles2017;
	}
	
	public String getTotalTackles2017() {
		int integerTackles2017 = Integer.parseInt(tackles2017);
		int integerAssistedTackles2017 = Integer.parseInt(assistedTackles2017);
		int integerTotalTackles = integerTackles2017 + integerAssistedTackles2017;
		String totalTackles = Integer.toString(integerTotalTackles);
		return totalTackles;
	}
	
	public void setSacks2017(String newSacks2017) {
		sacks2017 = newSacks2017;
	}
	
	public void setInterceptions2017(String newInterceptions2017) {
		interceptions2017 = newInterceptions2017;
	}
	
	public void setForcedFumbles2017(String newForcedFumbles2017) {
		forcedFumbles2017 = newForcedFumbles2017;
	}

}
