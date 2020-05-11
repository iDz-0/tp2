package fr.univ_amu.iut.exercice8;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class HelloBeautifulButton extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("Hello !");

        Button button = new Button("Hello !");
        button.setId("buttonHello");

        ImageView iv = new ImageView("https://raw.githubusercontent.com/IUTInfoAix-M2105/Syllabus/master/assets/logo.png");
        button.setGraphic(iv);

        BorderPane BP = new BorderPane(button);
        //BP.setAlignment(label, Pos.CENTER);
        BP.setPrefSize(250, 250);

        Scene s = new Scene(BP);
        s.getStylesheets().add(getClass().getClassLoader().getResource("DarkTheme.css").toExternalForm());
        primaryStage.setScene(s);

        primaryStage.show();

    }
}
