package Trabajo2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class InicioSesionControlador {
    public Button Salir;
    @FXML
    private void AccionSalir() throws IOException {
        Stage stage = (Stage) Salir.getScene().getWindow();
        stage.close();
    }
}
