package fr.univ_amu.iut.exercice3;

import javafx.application.Application;
import javafx.stage.Stage;

import static java.lang.Thread.currentThread;

public class WhoIsWho extends Application {

    public WhoIsWho() {
        System.out.println("["+currentThread().getName() + "] constructeur WhoIsWho()");
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void init() {
        System.out.println("["+currentThread().getName() + "] init()");
    }

    @Override
    public void stop() {
        System.out.println("["+currentThread().getName() + "] stop()");
    }

    @Override
    public void start(Stage primaryStage) {
        System.out.println("["+currentThread().getName() + "] start()");
        primaryStage.setTitle("WhoIsWho");
        primaryStage.show();
    }
}
