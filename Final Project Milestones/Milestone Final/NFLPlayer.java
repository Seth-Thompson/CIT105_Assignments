// Seth Thompson
// CST105
// 11/25/2018
/* This project is my own and all work on it is my own.*/

public abstract class NFLPlayer {

	//initializing all variables
	private String firstName = "Not Set";
	private String lastName = "Not Set";
	private String height = "Not Set";
	private String weight = "Not Set";
	
	//constructor that takes no argument
	protected NFLPlayer() {
		super();
	}
	
	//constructor that takes an argument for every property
	protected NFLPlayer(String firstName, String lastName, String height, String weight){
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.height = height;
		this.weight = weight;
	}
	
	// test Driver Method
	/** no longer works because NFLPlayers is now abstract	 **/
//	public void testDriverMethod() {
//		NFLPlayer nfl_playerTest = new NFLPlayer();
//		nfl_playerTest.setFirstName("Seth");
//		nfl_playerTest.setLastName("Thompson");
//		nfl_playerTest.setWeight("6-2");
//		nfl_playerTest.setHeight("210");
//		System.out.println(nfl_playerTest.getFullName());
//		NFLPlayer nfl_playerTest2 = new NFLPlayer("Seth", "Thompson", "6-2", "210");
//		System.out.println(nfl_playerTest2.getFullName());
//	}
	
	//all setters and getters for NFLPlayer
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getFullName() {
		String fullName = firstName + " " + lastName;
		return fullName;
	}
	
	public String getHiehgt() {
		return height;
	}
	
	public void setHeight(String height) {
		this.height = height;
	}
	
	public String getWeight() {
		return weight;
	}
	
	public void setWeight(String weight) {
		this.weight = weight;
	}

}
