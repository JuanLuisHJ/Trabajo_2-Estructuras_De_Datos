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
    public void SeleccionInforme (ActionEvent event){
        clase= "Informe";
        SeleccionClase.setText("Informe");
        TextoUk.setText("Número de Informe");
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
        else{
            EliminarInforme();
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

    public void EliminarInforme(){
        if (Informe.InformesPorNumero.isEmpty()){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sistema de gestion de pruebas electricas");
            alert.setHeaderText("Eliminar");
            alert.setContentText("No hay informes registrados en el sistema todavía");
            alert.showAndWait();
            return;
        }
        String numeroInformeString = EntradaUK.getText();
        int numeroInforme;
        try{
            numeroInforme = Integer.parseInt(numeroInformeString);
        }
        catch(Exception e){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sistema de gestion de pruebas electricas");
            alert.setHeaderText("Número Informe");
            alert.setContentText("Por favor ingrese un valor numérico mayor o igual que cero");
            alert.showAndWait();
            return;
        }
        if(numeroInforme<0){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sistema de gestion de pruebas electricas");
            alert.setHeaderText("Número Informe");
            alert.setContentText("Por favor ingrese un número de informe mayor o igual que cero");
            alert.showAndWait();
            return;
        }
        if(!Informe.InformesPorNumero.containsKey(numeroInforme)){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sistema de gestion de pruebas electricas");
            alert.setHeaderText("Número Informe");
            alert.setContentText("El número de informe proporcionado no se encuentra en la base de datos");
            alert.showAndWait();
            EntradaUK.setText("");
            return;
        }
        for(Prueba prueba : Prueba.TablaPrueba.values()){
            if(prueba.NumInforme==numeroInforme){
                App.sistemaPruebasElectricas.removeEdge(Informe.InformesPorNumero.get(numeroInforme),prueba);
                prueba.NumInforme=-1;
                break;
            }
        }
        Informe informe = Informe.InformesPorNumero.get(numeroInforme);
        String comentario = informe.Comentario.toLowerCase();
        double temperatura =informe.Temperatura;
        Informe.InformesPorComentario.get(comentario).remove(numeroInforme);
        if(Informe.InformesPorComentario.get(comentario).isEmpty()){
            Informe.InformesPorComentario.remove(comentario);
        }
        Informe.InformesPorTemperatura.get(temperatura).remove(numeroInforme);
        if(Informe.InformesPorTemperatura.isEmpty()){
            Informe.InformesPorTemperatura.remove(temperatura);
        }
        App.sistemaPruebasElectricas.removeVertex(Informe.InformesPorNumero.get(numeroInforme));
        Informe informemuerto = Informe.InformesPorNumero.remove(numeroInforme);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Sistema de gestión de pruebas eléctricas");
        alert.setHeaderText("Eliminar");
        alert.setContentText("El informe se eliminó satisfactoriamente\n"+informemuerto);
        alert.showAndWait();
        clase = null;
        EntradaUK.setText("");
        SeleccionClase.setText("Elemento que desea eliminar");
    }
}
