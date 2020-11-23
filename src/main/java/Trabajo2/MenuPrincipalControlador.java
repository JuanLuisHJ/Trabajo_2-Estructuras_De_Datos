package Trabajo2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class MenuPrincipalControlador {
    @FXML
    private void Volver (ActionEvent event) throws IOException {
        App.setRoot("InicioSesion");
    }

    @FXML
    private void Administracion (ActionEvent event) throws IOException {
        App.setRoot("MenuAdministracion");
    }

    @FXML
    private void Busqueda (ActionEvent event) throws IOException {
        App.setRoot("MenuBusqueda");
    }
}
