package fr.univ_amu.iut.exercice12;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Palette extends Application {

    private int nbGreen = 0;
    private int nbRed = 0;
    private int nbBlue = 0;

    private Label label;

    private Button greenButton;
    private Button redButton;
    private Button blueButton;

    private BorderPane root;
    private HBox topBox;
    private Pane centerPane;
    private HBox bottomBox;

    @Override
    public void start(Stage primaryStage) throws Exception {

        root = new BorderPane();

        centerPane = new Pane();
        topBox = new HBox();
        bottomBox = new HBox();

        label = new Label();

        greenButton = new Button("Vert");
        redButton = new Button("Rouge");
        blueButton = new Button("Bleu");

        centerPane.setPrefSize(400, 200);

        topBox.setAlignment(Pos.CENTER);
        bottomBox.setAlignment(Pos.CENTER);



        EventHandler<ActionEvent> redListener = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                nbRed++;
                centerPane.setStyle("-fx-background-color: red");
                label.setText("Rouge chois "+ nbRed +" fois");
            }
        };


        EventHandler<ActionEvent> greenListener = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                nbGreen++;
                centerPane.setStyle("-fx-background-color: green");
                label.setText("Vert chois "+ nbGreen +" fois");
            }
        };


        EventHandler<ActionEvent> blueListener = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                nbBlue++;
                centerPane.setStyle("-fx-background-color: blue");
                label.setText("Bleu chois "+ nbBlue +" fois");
            }
        };



        redButton.setOnAction(redListener);
        greenButton.setOnAction(greenListener);
        blueButton.setOnAction(blueListener);

        bottomBox.getChildren().add(label);

        topBox.getChildren().add(greenButton);
        topBox.getChildren().add(redButton);
        topBox.getChildren().add(blueButton);

        root.setTop(topBox);
        root.setCenter(centerPane);
        root.setBottom(bottomBox);

        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
