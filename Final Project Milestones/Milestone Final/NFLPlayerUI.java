// Seth Thompson
// CST105
// 12/4/2018
/* This project is my own and all work on it is my own.*/

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.io.FileInputStream;
import javafx.scene.control.cell.PropertyValueFactory;

public class NFLPlayerUI extends Application {
	
	// launches the main application.
	/** while TestNFLPlayer.java also has a main method these two applications should not be running at the same time. **/
	public static void main(String[] args)	{
		Application.launch(args);
	}
	
	NFLPlayer player;
	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox hbox = new HBox(30);
		VBox vbox = new VBox(10);
		VBox vbox2 = new VBox(10);
		HBox hbox2 = new HBox(10);
		StackPane stackpane = new StackPane();
		//***********************************
		Scene scene = new Scene(hbox);
		//***********************************
		ListView listView = new ListView();
		listView.getItems().add("All Players");
		listView.getItems().add("Offensive Players");
		listView.getItems().add("Defensive Players");
		listView.setPrefWidth(100);
		listView.setPrefHeight(75);
		//************************************************
		ChoiceBox choiceBox = new ChoiceBox();
		choiceBox.getItems().add("Search by First Name");
		choiceBox.getItems().add("Search by Last Name");
		choiceBox.getItems().add("Search by Position");
		//***********************************************
		Label label = new Label("Enter Search Value:");
		TextField textField = new TextField();
		//***********************************************
		FileInputStream input = new FileInputStream("G:/NFL Logo.png");
		Image image = new Image(input);
		ImageView imageView = new ImageView(image);
		//*********************************************
		TableView <NFLPlayer>tblAllPlayers = new TableView<>();
		TableColumn colFirstName = new TableColumn("First Name");
		TableColumn colLastName = new TableColumn("Last Name");
		TableColumn colPositionOf = new TableColumn("Position");
		//********************************************
		TableView <NFLPlayer>tblOffensivePlayers = new TableView();
		TableColumn colOffensiveFirstName = new TableColumn("First Name");
		TableColumn colOffensiveLastName = new TableColumn("Last Name");
		TableColumn colOffensivePositionOf = new TableColumn("Position");
		//********************************************
		TableView <NFLPlayer>tblDefensivePlayers = new TableView();
		TableColumn colDefensiveFirstName = new TableColumn("First Name");
		TableColumn colDefensiveLastName = new TableColumn("Last Name");
		TableColumn colDefensivePositionOf = new TableColumn("Position");
		//********************************************
		tblAllPlayers.getColumns().addAll(colFirstName, colLastName, colPositionOf);
		//*******************************************
		tblOffensivePlayers.getColumns().addAll(colOffensiveFirstName, colOffensiveLastName, colOffensivePositionOf);
		//*******************************************
		tblDefensivePlayers.getColumns().addAll(colDefensiveFirstName, colDefensiveLastName, colDefensivePositionOf);
		
		/*********************************************/
		NFLManager managePlayersObject = new NFLManager();
		
		ObservableList<NFLPlayer> playerObj =
		FXCollections.observableArrayList(managePlayersObject.createPlayer());
		
		tblAllPlayers.setItems(playerObj);
		//********************************************************************************
		colFirstName.setCellValueFactory(
			new PropertyValueFactory<NFLPlayer, String>("firstName"));
		colLastName.setCellValueFactory(
			new PropertyValueFactory<NFLPlayer, String>("lastName"));
		colPositionOf.setCellValueFactory(
			new PropertyValueFactory<NFLPlayer, String>("position"));

		/********************************************************/
		colOffensiveFirstName.setCellValueFactory(
			new PropertyValueFactory<NFLPlayer, String>("firstName"));
		colOffensiveLastName.setCellValueFactory(
			new PropertyValueFactory<NFLPlayer, String>("lastName"));
		colOffensivePositionOf.setCellValueFactory(
			new PropertyValueFactory<NFLPlayer, String>("position"));

		colDefensiveFirstName.setCellValueFactory(
			new PropertyValueFactory<NFLPlayer, String>("firstName"));
		colDefensiveLastName.setCellValueFactory(
			new PropertyValueFactory<NFLPlayer, String>("lastName"));
		colDefensivePositionOf.setCellValueFactory(
			new PropertyValueFactory<NFLPlayer, String>("position"));

		/***************************************************/
		Button btnSearch = new Button("Search");
		Button btnOffensiveDraft = new Button("Draft to Offensive Team");
		Button btnDefensiveDraft = new Button("Draft to Defensive Team");
		Button btnRemove = new Button("Remove Selected Player");
		//************************************************
		vbox.getChildren().addAll(listView, choiceBox, label, textField, btnSearch, imageView);
		hbox2.getChildren().addAll(btnOffensiveDraft, btnDefensiveDraft, btnRemove);
		vbox2.getChildren().addAll(stackpane, hbox2);
		stackpane.getChildren().addAll(tblOffensivePlayers, tblDefensivePlayers, tblAllPlayers);
		hbox.getChildren().addAll(vbox, vbox2);
		//************************************************
		primaryStage.setTitle("My NFL Player CST Program");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		//**************************************************
		btnRemove.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
			int index = listView.getSelectionModel().getSelectedIndex();

			if (index == 1) {
				player = tblOffensivePlayers.getSelectionModel().getSelectedItem();
				tblOffensivePlayers.getItems().remove(player);
			}
			else if(index == 2) {
				player = tblDefensivePlayers.getSelectionModel().getSelectedItem();
				tblDefensivePlayers.getItems().remove(player);
			}
			}
		});
		//**************************************************
		btnOffensiveDraft.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				player = tblAllPlayers.getSelectionModel().getSelectedItem();
				tblOffensivePlayers.getItems().add(player);
				tblAllPlayers.getSelectionModel().clearSelection();
			}
		});
		//***********************************************************
		btnDefensiveDraft.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				player = tblAllPlayers.getSelectionModel().getSelectedItem();
				tblDefensivePlayers.getItems().add(player);
				tblAllPlayers.getSelectionModel().clearSelection();
			}
		});
		//***********************************************************
		listView.setOnMouseClicked(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent e) {
				int index = listView.getSelectionModel().getSelectedIndex();
				if (index ==0) {
					tblAllPlayers.setVisible(true);
					tblOffensivePlayers.setVisible(false);
					tblDefensivePlayers.setVisible(false);
				}
				else if (index == 1) {
					tblAllPlayers.setVisible(false);
					tblOffensivePlayers.setVisible(true);
					tblDefensivePlayers.setVisible(false);
				}
				else if (index == 2) {
					tblAllPlayers.setVisible(false);
					tblOffensivePlayers.setVisible(false);
					tblDefensivePlayers.setVisible(true);
				}
			}
		});
			//*******************************************************
	}

}
