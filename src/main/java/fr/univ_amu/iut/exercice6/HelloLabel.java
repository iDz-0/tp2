package fr.univ_amu.iut.exercice6;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloLabel extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello !");
        //primaryStage.setHeight(100);
        //primaryStage.setWidth(250);

        Label label = new Label("Hello !");
        label.setId("labelHello");

        BorderPane BP = new BorderPane(label);
        //BP.setAlignment(label, Pos.CENTER);
        BP.setPrefSize(250, 100);

        Scene s = new Scene(BP);
        primaryStage.setScene(s);

        primaryStage.show();


    }
}
