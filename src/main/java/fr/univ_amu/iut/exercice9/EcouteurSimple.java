package fr.univ_amu.iut.exercice9;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class EcouteurSimple implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent actionEvent) {
        System.out.println("Bouton actionné");
    }
}
