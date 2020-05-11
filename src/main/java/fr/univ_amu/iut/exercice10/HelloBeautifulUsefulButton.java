package fr.univ_amu.iut.exercice10;

import fr.univ_amu.iut.exercice9.EcouteurSimple;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class HelloBeautifulUsefulButton extends Application {
    private int nbAction = 0;

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("Hello !");

        Button button = new Button("Hello !");
        button.setId("buttonHello");

        EventHandler<ActionEvent> ecouteur = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                nbAction += 1;

                System.out.println("Bouton actionné "+ nbAction +" fois");
            }
        };

        button.setOnAction(ecouteur);



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
