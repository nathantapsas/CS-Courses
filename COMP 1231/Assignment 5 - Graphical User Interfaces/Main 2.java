package com.company;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        Text text = new Text("Nathan");
        Slider slider = new Slider(0, 150, 30);
        BorderPane pane = new BorderPane();
        pane.setPadding(new Insets(30, 30, 30, 30));
        pane.setCenter(text);
        pane.setBottom(slider);
        BorderPane.setAlignment(slider, Pos.CENTER);
        BorderPane.setAlignment(text, Pos.CENTER);

        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);
        slider.setMajorTickUnit(10);
        slider.valueProperty().addListener((observableValue, number, t1) -> text.setFont(new Font(slider.getValue())));


        Scene scene = new Scene(pane, 600, 400);
        stage.setTitle("Font Resizer");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
