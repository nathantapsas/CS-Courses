package com.company;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
    final double INITIAL_COST = 10.00;
    Text title, costText;

    // Create all the CheckBox objects to display the ingredients
    CheckBox[] ingredients =
            {
                    new CheckBox("Pepperoni"),
                    new CheckBox("Ham"),
                    new CheckBox("Salami"),
                    new CheckBox("Bacon"),
                    new CheckBox("Sausage"),
                    new CheckBox("Beef"),
                    new CheckBox("Onion"),
                    new CheckBox("Olives"),
                    new CheckBox("Tomatoes"),
                    new CheckBox("Pineapple"),
                    new CheckBox("Peppers"),
                    new CheckBox("Jalapenos")
            };

    public void start(Stage primaryStage) {
        // Create the text objects to display the prompt and cost
        title = new Text("Select the toppings for your pizza");
        title.setFont(new Font(16));
        costText = new Text(String.format("Total Cost: $%.2f", INITIAL_COST));
        costText.setFont(new Font(16));

        // Create a GridPane object to hold the titles and checkboxes
        GridPane pane = new GridPane();
        pane.setHgap(25);
        pane.setVgap(10);
        pane.setAlignment(Pos.CENTER);
        pane.setStyle("-fx-background-color: khaki");

        pane.add(title, 0, 0, 3, 1);
        pane.add(costText, 0, 7, 3, 1);
        GridPane.setHalignment(title, HPos.CENTER);
        GridPane.setHalignment(costText, HPos.CENTER);

        // For each ingredient CheckBox, add it to the GridPane and set its event handler
        int COLUMNS = 3, ROWS = 4;
        for(int i = 0; i < ingredients.length; i++) {
            pane.add(ingredients[i], i % COLUMNS, (i % ROWS) + 2);
            ingredients[i].setOnAction(this::calculateCost);
        }

        // Add the GridPane to a new Scene and add the Scene to the Stage
        primaryStage.setTitle("Pizza Cost Calculator");
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(pane, 350, 300));
        primaryStage.show();
    }

    public void calculateCost(ActionEvent event) {
        double newCost = INITIAL_COST;
        for(CheckBox ingredient : ingredients) {
            if(ingredient.isSelected()) newCost += 0.5;
        }
        costText.setText(String.format("Total Cost: $%.2f", newCost));
    }

    public static void main(String[] args) {
        launch(args);
    }
}
