package Trabajo2;

import Trabajo2.Clases.TipoPrueba;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;

public class EliminarControlador {
    public String clase = null;
    @FXML
    public Label TextoUk;
    @FXML
    public TextField EntradaUK;
    @FXML
    public SplitMenuButton SeleccionClase;
    @FXML
    public MenuItem SeleccionTipoPrueba;
    @FXML
    private void Volver (ActionEvent event) throws IOException {
        App.setRoot("MenuAdministracion");
    }

    @FXML
    public void SeleccionTipoPrueba (ActionEvent event){
        clase = "TipoPrueba";
        SeleccionClase.setText("Tipo de Prueba");
        TextoUk.setText("ID");
    }

    @FXML
    public void EliminarClase(ActionEvent event){
        if(clase == null){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sistema de gestion de pruebas electricas");
            alert.setHeaderText("Eliminar");
            alert.setContentText("Por favor seleccione un elemento");
            alert.showAndWait();
        }
        else if (clase.equals("TipoPrueba")){
            EliminarTipoPrueba();
        }
    }

    public void EliminarTipoPrueba(){
        if (TipoPrueba.TablaTipoPrueba.isEmpty()){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sistema de gestion de pruebas electricas");
            alert.setHeaderText("Eliminar");
            alert.setContentText("No hay tipos de prueba en el sistema");
            alert.showAndWait();
            return;
        }
        int id = -1;
        try{
            id = Integer.parseInt(EntradaUK.getText().trim());
        }catch (Exception o){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sistema de gestion de pruebas electricas");
            alert.setHeaderText("Eliminar");
            alert.setContentText("Los datos ingresados no son validos");
            alert.showAndWait();
            EntradaUK.setText("");
            return;
        }
        if (!TipoPrueba.TablaTipoPrueba.containsKey(id)){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sistema de gestion de pruebas electricas");
            alert.setHeaderText("Eliminar");
            alert.setContentText("El tipo de prueba no se encuentra en el sistema");
            alert.showAndWait();
            EntradaUK.setText("");
            return;
        }
        App.sistemaPruebasElectricas.removeVertex(TipoPrueba.TablaTipoPrueba.get(id));
        TipoPrueba.TablaTipoPrueba.remove(id);

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Sistema de gestion de pruebas electricas");
        alert.setHeaderText("Eliminar");
        alert.setContentText("El tipo de prueba se elimino satisfactoriamente");
        alert.showAndWait();

        TextoUk.setText("UK");
        clase = null;
        EntradaUK.setText("");
        SeleccionClase.setText("Elemento que desea crear");
    }
}
