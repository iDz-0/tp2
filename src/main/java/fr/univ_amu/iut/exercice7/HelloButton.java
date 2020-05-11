package fr.univ_amu.iut.exercice7;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class HelloButton extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("Hello !");

        Button button = new Button("Hello !");
        button.setId("buttonHello");

        BorderPane BP = new BorderPane(button);
        //BP.setAlignment(label, Pos.CENTER);
        BP.setPrefSize(250, 100);

        Scene s = new Scene(BP);
        primaryStage.setScene(s);

        primaryStage.show();
    }
}
