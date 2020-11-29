package Trabajo2;

import Trabajo2.Clases.*;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;

import static java.util.Arrays.asList;

public class VerControlador {
    public String clase = null;
    @FXML
    public SplitMenuButton SeleccionClase;
    @FXML
    public MenuItem SeleccionTipoPrueba;
    @FXML
    public MenuItem SeleccionPrueba;
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
    public void SeleccionPrueba (ActionEvent event){
        clase = "Prueba";
        SeleccionClase.setText("Prueba");
    }
    @FXML
    public void SeleccionInforme (ActionEvent event){
        clase = "Informe";
        SeleccionClase.setText("Informe");
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
        else if (clase.equals("Prueba")) {
            VerPrueba();
        }
        else {
            VerInforme();
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

    public void VerPrueba(){
        salida.getItems().clear();
        if (Prueba.TablaPrueba.isEmpty()){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sistema de gestion de pruebas electricas");
            alert.setHeaderText("Ver");
            alert.setContentText("No hay pruebas en el sistema");
            alert.showAndWait();
            return;
        }

        for(Prueba pruebas:Prueba.TablaPrueba.values()){
            salida.getItems().add(pruebas);
        }
    }
    public void VerInforme(){
        salida.getItems().clear();
        if (Informe.InformesPorNumero.isEmpty()){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sistema de gestion de pruebas electricas");
            alert.setHeaderText("Informes");
            alert.setContentText("Todvía no se han realizado informes");
            alert.showAndWait();
            return;
        }
        else{
            salida.setItems(FXCollections.observableList(asList(Informe.InformesPorNumero.values())));
        }
    }
}
