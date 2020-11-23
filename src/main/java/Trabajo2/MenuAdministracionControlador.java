package Trabajo2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class MenuAdministracionControlador {
    @FXML
    private void Volver (ActionEvent event) throws IOException {
        App.setRoot("MenuPrincipal");
    }
    @FXML
    private void Ver (ActionEvent event) throws IOException {
        App.setRoot("Ver");
    }
    @FXML
    private void Crear (ActionEvent event) throws IOException {
        App.setRoot("Crear");
    }
    @FXML
    private void Editar (ActionEvent event) throws IOException {
        App.setRoot("Editar");
    }
    @FXML
    private void Eliminar (ActionEvent event) throws IOException {
        App.setRoot("Eliminar");
    }
}
