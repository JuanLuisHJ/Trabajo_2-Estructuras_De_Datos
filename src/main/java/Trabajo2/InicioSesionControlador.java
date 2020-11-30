package Trabajo2;

import Trabajo2.Clases.Usuario;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class InicioSesionControlador {
    @FXML
    public TextField TextUsuario;
    @FXML
    public PasswordField TextContraseña;

    @FXML
    public Label ErrorUsuario;

    @FXML
    public Label ErrorContraseña;

    public Button Salir;
    @FXML
    private void AccionSalir() throws IOException {
        Stage stage = (Stage) Salir.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void IngresoUsuario() throws IOException {
        cleanWarnings();
        boolean vacio = false;
        if (TextUsuario.getText() == ""){
            ErrorUsuario.setText("Ingrese el documento o el correo electronico");
            vacio = true;
        }
        if (TextContraseña.getText() == ""){
            ErrorContraseña.setText("Ingrese la contraseña");
            vacio = true;
        }
        if (vacio){
            return;
        }

        try {
            int documento = Integer.parseInt(TextUsuario.getText().trim());
            if (!Usuario.TablaUsuarioCedula.containsKey(documento)) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Sistema de gestión de pruebas eléctricas");
                alert.setHeaderText("Iniciar sesión");
                alert.setContentText("No se encuentra el ususario en el sistema");
                alert.showAndWait();
            } else {
                String contraseña = TextContraseña.getText();
                if (Usuario.TablaUsuarioCedula.get(documento).Contraseña.equals(contraseña)) {
                    App.setRoot("MenuPrincipal");
                } else {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Sistema de gestión de pruebas eléctricas");
                    alert.setHeaderText("Iniciar sesión");
                    alert.setContentText("Contraseña incorrecta");
                    alert.showAndWait();
                    TextContraseña.setText("");
                    return;
                }
            }
        } catch (Exception exc) {
            String correo = TextUsuario.getText().trim();
            String contraseña = TextContraseña.getText();
            if (!Usuario.TablaUsuarioCorreo.containsKey(correo)) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Sistema de gestión de pruebas eléctricas");
                alert.setHeaderText("Iniciar sesión");
                alert.setContentText("No se encuentra el ususario en el sistema");
                alert.showAndWait();
            } else {
                if (Usuario.TablaUsuarioCorreo.get(correo).Contraseña.equals(contraseña)) {
                    App.setRoot("MenuPrincipal");
                } else {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Sistema de gestión de pruebas eléctricas");
                    alert.setHeaderText("Iniciar sesión");
                    alert.setContentText("Contraseña incorrecta");
                    alert.showAndWait();
                    TextContraseña.setText("");
                    return;
                }
            }
        }
        clean();
    }
    private void clean(){
        TextUsuario.setText("");
        TextContraseña.setText("");
        cleanWarnings();
    }

    @FXML
    private void cleanWarnings(){
        ErrorUsuario.setText("");
        ErrorContraseña.setText("");
    }
}
