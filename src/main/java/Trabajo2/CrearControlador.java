package Trabajo2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class CrearControlador {
    @FXML
    private void Volver (ActionEvent event) throws IOException {
        App.setRoot("MenuAdministracion");
    }
}
