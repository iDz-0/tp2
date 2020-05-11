package fr.univ_amu.iut.exercice5;

import javafx.application.Application;
import javafx.stage.Stage;

public class MyUndecoratedJavaFXWindow extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("Undecorated Useless JavaFX Window");
        primaryStage.setAlwaysOnTop(true);
        primaryStage.setResizable(false);
        primaryStage.setHeight(400);
        primaryStage.setWidth(800);

    }
}
