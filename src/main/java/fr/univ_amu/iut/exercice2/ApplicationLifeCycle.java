package fr.univ_amu.iut.exercice2;

import javafx.application.Application;
import javafx.stage.Stage;

public class ApplicationLifeCycle extends Application {

    public ApplicationLifeCycle() {
        System.out.println("constructeur ApplicationLifeCycle()");
    }

    public static void main(String[] args) {
        System.out.println("main() : avant launch");
        launch(args);
        System.out.println("main() : après launch");
    }

    @Override
    public void init() {
        System.out.println("init()");
    }

    @Override
    public void stop() {
        System.out.println("stop()");
    }

    @Override
    public void start(Stage primaryStage) {
        System.out.println("start() : avant show stage");
        System.out.println("start() : après show stage");
    }
}
