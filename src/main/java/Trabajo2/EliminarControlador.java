package Trabajo2;

import Trabajo2.Clases.*;
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
    public MenuItem SeleccionPrueba;
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
    public void SeleccionPrueba (ActionEvent event){
        clase = "Prueba";
        SeleccionClase.setText("Prueba");
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
        else if (clase.equals("Prueba")) {
            EliminarPrueba();
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
        TipoPrueba.ArbolTipoPruebaNombre.get(TipoPrueba.TablaTipoPrueba.get(id).Nombre.toLowerCase()).remove(TipoPrueba.TablaTipoPrueba.get(id));
        if (TipoPrueba.ArbolTipoPruebaNombre.get(TipoPrueba.TablaTipoPrueba.get(id).Nombre.toLowerCase()).isEmpty()){
            TipoPrueba.ArbolTipoPruebaNombre.remove(TipoPrueba.TablaTipoPrueba.get(id).Nombre.toLowerCase());
        }
        TipoPrueba.ArbolTipoPruebaRef.get(TipoPrueba.TablaTipoPrueba.get(id).RefNorma.toLowerCase()).remove(TipoPrueba.TablaTipoPrueba.get(id));
        if (TipoPrueba.ArbolTipoPruebaRef.get(TipoPrueba.TablaTipoPrueba.get(id).RefNorma.toLowerCase()).isEmpty()){
            TipoPrueba.ArbolTipoPruebaRef.remove(TipoPrueba.TablaTipoPrueba.get(id).RefNorma.toLowerCase());
        }
        TipoPrueba.ArbolTipoPruebaNit.get(TipoPrueba.TablaTipoPrueba.get(id).NitLaboratorio).remove(TipoPrueba.TablaTipoPrueba.get(id));
        if (TipoPrueba.ArbolTipoPruebaNit.get(TipoPrueba.TablaTipoPrueba.get(id).NitLaboratorio).isEmpty()){
            TipoPrueba.ArbolTipoPruebaNit.remove(TipoPrueba.TablaTipoPrueba.get(id).NitLaboratorio);
        }
        TipoPrueba.TablaTipoPrueba.remove(id);

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Sistema de gestion de pruebas electricas");
        alert.setHeaderText("Eliminar");
        alert.setContentText("El tipo de prueba se elimino satisfactoriamente");
        alert.showAndWait();

        TextoUk.setText("UK");
        clase = null;
        EntradaUK.setText("");
        SeleccionClase.setText("Elemento que desea eliminar");
    }

    public void EliminarPrueba(){
        if (Prueba.TablaPrueba.isEmpty()){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sistema de gestion de pruebas electricas");
            alert.setHeaderText("Eliminar");
            alert.setContentText("No hay pruebas en el sistema");
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
        if (!Prueba.TablaPrueba.containsKey(id)){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sistema de gestion de pruebas electricas");
            alert.setHeaderText("Eliminar");
            alert.setContentText("La prueba no se encuentra en el sistema");
            alert.showAndWait();
            EntradaUK.setText("");
            return;
        }
        App.sistemaPruebasElectricas.removeVertex(Prueba.TablaPrueba.get(id));
        Prueba.ArbolPruebaNombre.get(Prueba.TablaPrueba.get(id).Nombre.toLowerCase()).remove(Prueba.TablaPrueba.get(id));
        if (Prueba.ArbolPruebaNombre.get(Prueba.TablaPrueba.get(id).Nombre.toLowerCase()).isEmpty()){
            Prueba.ArbolPruebaNombre.remove(Prueba.TablaPrueba.get(id).Nombre.toLowerCase());
        }
        Prueba.ArbolPruebaClase.get(Prueba.TablaPrueba.get(id).Clase.toLowerCase()).remove(Prueba.TablaPrueba.get(id));
        if (Prueba.ArbolPruebaClase.get(Prueba.TablaPrueba.get(id).Clase.toLowerCase()).isEmpty()){
            Prueba.ArbolPruebaClase.remove(Prueba.TablaPrueba.get(id).Clase.toLowerCase());
        }
        Prueba.ArbolPruebaTP.get(Prueba.TablaPrueba.get(id).TipoPrueba).remove(Prueba.TablaPrueba.get(id));
        if (Prueba.ArbolPruebaTP.get(Prueba.TablaPrueba.get(id).TipoPrueba).isEmpty()){
            Prueba.ArbolPruebaTP.remove(Prueba.TablaPrueba.get(id).TipoPrueba);
        }
        Prueba.TablaPrueba.remove(id);

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Sistema de gestion de pruebas electricas");
        alert.setHeaderText("Eliminar");
        alert.setContentText("La prueba se elimino satisfactoriamente");
        alert.showAndWait();

        TextoUk.setText("UK");
        clase = null;
        EntradaUK.setText("");
        SeleccionClase.setText("Elemento que desea eliminar");
    }
}
