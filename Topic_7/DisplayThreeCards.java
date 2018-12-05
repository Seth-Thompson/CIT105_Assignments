// Seth Thompson
// CST105
// 12/4/2018
/* This project is my own and all work on it is my own.*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class DisplayThreeCards extends Application {

	// main method to launch the application
	public static void main(String[] args) {
		Application.launch(args);
	}
	
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) throws FileNotFoundException {
		// an ArrayList of shuffled card numbers is created using the createArray() method
		ArrayList<Integer> arrayOfCards = createArray();
		// a HBox pane is created with basic padding.
		HBox pane = new HBox(50);
		pane.setPadding(new Insets(50, 50, 50, 50));
	
		/* the nodes for each card are added to the pane
		 * this is done with a loop that displays the first three cards in the array which have been randomly shuffled.
		 */
		/** the cards are all pictures saved 1-54 (52 cards and 2 Jokers) on my G: Drive within a folder called Cards
		 * I do not have an image/card directory on my computer, so I made a Cards folder.
		 **/
		for (int i = 0; i < 3; i++) {
			FileInputStream input = new FileInputStream("G:/Cards/" +
					arrayOfCards.get(i) + ".png");
			Image image = new Image(input);
			ImageView imageView = new ImageView(image);
			pane.getChildren().add(imageView);
		}
	
		// a scene is created which has the pane placed inside it
		Scene scene = new Scene(pane);
		// the stage is labeled
		primaryStage.setTitle("Display Three Cards");
		// the scene is then set inside the stage
		primaryStage.setScene(scene);
		// this stage is then displayed which includes the scene, pane, and nodes
		primaryStage.show();
	}
	
	// the getCards() method is used to create an ArrayList of 54 cards
	private ArrayList<Integer> createArray() {
		ArrayList<Integer> arrayOfCards = new ArrayList<>();
		for (int i = 0; i < 54; i++) {
			arrayOfCards.add(i++);
		}
		// once created the cards are then shuffled and the array is returned.
		java.util.Collections.shuffle(arrayOfCards);
		return arrayOfCards;
	}
}