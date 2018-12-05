// Seth Thompson
// CST105
// 12/4/2018
/* This project is my own and all work on it is my own.*/

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.text.*;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ColorAndFont extends Application {
	
	// main method to launch the application
	public static void main(String[] args) {
		Application.launch(args);
	}
	
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) throws Exception{
		// Create a HBox
		HBox hBox = new HBox(10);
		hBox.setPadding(new Insets(10, 10, 10, 10));
		hBox.setAlignment(Pos.CENTER);

		// Add the text to the hBox in 5 instances
		for (int i = 0; i < 5; i++) {
			// Crate a the Text and then set the proper font settings
			Text text = new Text("Seth: Colors and Fonts");
			text.setFont(Font.font("Times Roman", FontWeight.BOLD,
			FontPosture.ITALIC, 22));
			text.setRotate(90);

			// Set the color and opacity to a random value with Math.random() for each Text node
			text.setFill(new Color(Math.random(), Math.random(), 
				Math.random(), Math.random()));
			hBox.getChildren().add(text);
		}

		// Create a scene with the hBox properly sized to fit the words inside it and place it in the stage
		Scene scene = new Scene(hBox, 1200, 400);
		// the stage is titled
		primaryStage.setTitle("Color and Font");
		// the scene is then placed within the stage
		primaryStage.setScene(scene);
		// the stage is then displayed
		primaryStage.show();
	}

}
