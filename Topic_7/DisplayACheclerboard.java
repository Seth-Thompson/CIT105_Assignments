// Seth Thompson
// CST105
// 12/4/2018
/* This project is my own and all work on it is my own.*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class DisplayACheclerboard extends Application {

	// main method to launch the application
	public static void main(String[] args) {
		Application.launch(args);
	}
	
	@Override // Override the start method in the application class
	public void start(Stage primaryStage) {
		// Create a GridPane
		GridPane pane = new GridPane();

		// count and the sides of the rectangle are set
		int count = 0;
		double s = 100;
		/* a checkerboard is a 8x8 rectangle of smaller rectangles.
		 * there are two loops.
		 * the first loop is the y-axis value moving along the same x-axis till 8 rectangles have been made
		 * this continues downward for 8 rectangles down making an 8x8 rectangle
		 */
		for (int i = 0; i < 8; i++) {
			count++;
			for (int j = 0; j < 8; j++) {
				// each rectangle is set to have sides of 100x100 pixels
				Rectangle r = new Rectangle(s, s, s, s);
				/* this loop checks to see which number of rectangle has been created.
				 * every other rectangle is colored white and all the remaining rectangles default to black
				 * count is initialized at the start and increase across each pane
				 * modulus can be used to accomplish this as every even number has a modulus 2 of 0.
				 */
				if (count % 2 == 0)
					r.setFill(Color.WHITE);
				// each rectangle is added pane by pane with their location shifting with each loop to build the grid
				pane.add(r, j, i);
				count++;
			}
		}

		// A scene is created with the pane added to it
		Scene scene = new Scene (pane);
		// the stage is titled
		primaryStage.setTitle("Display a Checkerboard");
		// the scene is placed into the stage
		primaryStage.setScene(scene);
		// the stage is then displayed
		primaryStage.show();
	}
	
}
