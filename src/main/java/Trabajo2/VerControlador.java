package Trabajo2;

import Trabajo2.Clases.Laboratorio;
import Trabajo2.Clases.Norma;
import Trabajo2.Clases.TipoPrueba;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;

public class VerControlador {
    public String clase = null;
    @FXML
    public SplitMenuButton SeleccionClase;
    @FXML
    public MenuItem SeleccionTipoPrueba;
    @FXML
    public ListView salida;

    @FXML
    private void Volver (ActionEvent event) throws IOException {
        App.setRoot("MenuAdministracion");
    }

    @FXML
    public void SeleccionTipoPrueba (ActionEvent event){
        clase = "TipoPrueba";
        SeleccionClase.setText("Tipo de Prueba");
    }

    @FXML
    public void VerClase(ActionEvent event){
        if(clase == null){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sistema de gestion de pruebas electricas");
            alert.setHeaderText("Ver");
            alert.setContentText("Por favor seleccione un elemento");
            alert.showAndWait();
        }
        else if (clase.equals("TipoPrueba")){
            VerTipoPrueba();
        }
    }

    public void VerTipoPrueba(){
        salida.getItems().clear();
        if (TipoPrueba.TablaTipoPrueba.isEmpty()){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sistema de gestion de pruebas electricas");
            alert.setHeaderText("Ver");
            alert.setContentText("No hay tipos de prueba en el sistema");
            alert.showAndWait();
            return;
        }

        for(TipoPrueba tipopruebas:TipoPrueba.TablaTipoPrueba.values()){
            salida.getItems().add(tipopruebas);
        }
    }
}
