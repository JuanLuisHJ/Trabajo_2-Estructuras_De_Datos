package Trabajo2;

import Trabajo2.Clases.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;
import java.util.LinkedList;

public class CrearControlador {

    public String clase = null;
    @FXML
    public Label TextoAtributo1;
    @FXML
    public Label TextoAtributo2;
    @FXML
    public Label TextoAtributo3;
    @FXML
    public TextField EntradaAtributo1;
    @FXML
    public ChoiceBox<String> ListaAtributo2;
    @FXML
    public ChoiceBox<Integer> ListaAtributo3;
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
        ListaAtributo2.getItems().clear();
        ListaAtributo3.getItems().clear();
        clase = "TipoPrueba";
        SeleccionClase.setText("Tipo de Prueba");
        TextoAtributo1.setText("Nombre");
        TextoAtributo2.setText("Norma utilizada");
        TextoAtributo3.setText("Nit del laboratorio");
        TextoAtributo1.setVisible(true);
        TextoAtributo2.setVisible(true);
        TextoAtributo3.setVisible(true);
        int n = 0;
        for(String ref:Norma.TablaNorma.keySet()){
            ListaAtributo2.getItems().add(n,ref);
            n+=1;
        }
        n = 0;
        for(int nit:Laboratorio.TablaLaboratorio.keySet()){
            ListaAtributo3.getItems().add(n,nit);
            n+=1;
        }
        EntradaAtributo1.setVisible(true);
        ListaAtributo2.setVisible(true);
        ListaAtributo3.setVisible(true);
    }
    @FXML
    public void SeleccionPrueba (ActionEvent event){
        ListaAtributo2.getItems().clear();
        ListaAtributo3.getItems().clear();
        clase = "Prueba";
        SeleccionClase.setText("Prueba");
        TextoAtributo1.setText("Nombre");
        TextoAtributo2.setText("Clase utilizada");
        TextoAtributo3.setText("Tipo de prueba");
        TextoAtributo1.setVisible(true);
        TextoAtributo2.setVisible(true);
        TextoAtributo3.setVisible(true);
        int n = 0;
        for (String nom: Clase.TablaClase.keySet()) {
            ListaAtributo2.getItems().add(n,nom);
        }
        n = 0;
        for(int id:TipoPrueba.TablaTipoPrueba.keySet()){
            ListaAtributo3.getItems().add(n,id);
            n+=1;
        }
        EntradaAtributo1.setVisible(true);
        ListaAtributo2.setVisible(true);
        ListaAtributo3.setVisible(true);
    }
    @FXML
    public void SleccionInforme (ActionEvent event){
        clase="Informe";

    }
    @FXML
    private void CrearClase(ActionEvent event){
        if(clase == null){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sistema de gestion de pruebas electricas");
            alert.setHeaderText("Creacion");
            alert.setContentText("Por favor seleccione un elemento");
            alert.showAndWait();
        }
        else if (clase.equals("TipoPrueba")){
            CrearTipoPrueba();
        }
        else if (clase.equals("Prueba")) {
            CrearPrueba();
        }
        else {
            CrearInforme();
        }
    }
    public void CrearTipoPrueba(){
        String nnombre = EntradaAtributo1.getText();
        String nref = ListaAtributo2.getValue();
        int nnit = -1;
        if (nnombre.equals("")){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sistema de gestion de pruebas electricas");
            alert.setHeaderText("Creacion");
            alert.setContentText("Por favor ingrese el normbre del tipo de prueba");
            alert.showAndWait();
            EntradaAtributo1.setText("");
            return;
        }
        if (nref == null){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sistema de gestion de pruebas electricas");
            alert.setHeaderText("Creacion");
            alert.setContentText("Por favor seleccione la norma utilizada");
            alert.showAndWait();
            return;
        }try {
            nnit = ListaAtributo3.getValue();
        }catch (Exception o){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sistema de gestion de pruebas electricas");
            alert.setHeaderText("Creacion");
            alert.setContentText("Por favor seleccione el nit del laboratorio correspondiente");
            alert.showAndWait();
            return;
        }
        int nID = App.IDTipoPrueba;
        App.IDTipoPrueba+=1;
        TipoPrueba NuevoTipoPrueba = new TipoPrueba(nID,nnombre,nref,nnit);
        TipoPrueba.TablaTipoPrueba.put(nID,NuevoTipoPrueba);
        App.sistemaPruebasElectricas.addVertex(TipoPrueba.TablaTipoPrueba.get(nID));
        App.sistemaPruebasElectricas.addEdge(Laboratorio.TablaLaboratorio.get(nnit),TipoPrueba.TablaTipoPrueba.get(nID));
        App.sistemaPruebasElectricas.addEdge(Norma.TablaNorma.get(nref),TipoPrueba.TablaTipoPrueba.get(nID));
        if (!TipoPrueba.ArbolTipoPruebaNombre.containsKey(nnombre.toLowerCase())){
            TipoPrueba.ArbolTipoPruebaNombre.put(nnombre.toLowerCase(),new LinkedList<>());
        }
        TipoPrueba.ArbolTipoPruebaNombre.get(nnombre.toLowerCase()).add(TipoPrueba.TablaTipoPrueba.get(nID));
        if (!TipoPrueba.ArbolTipoPruebaRef.containsKey(nref.toLowerCase())){
            TipoPrueba.ArbolTipoPruebaRef.put(nref.toLowerCase(),new LinkedList<>());
        }
        TipoPrueba.ArbolTipoPruebaRef.get(nref.toLowerCase()).add(TipoPrueba.TablaTipoPrueba.get(nID));
        if (!TipoPrueba.ArbolTipoPruebaNit.containsKey(nnit)){
            TipoPrueba.ArbolTipoPruebaNit.put(nnit,new LinkedList<>());
        }
        TipoPrueba.ArbolTipoPruebaNit.get(nnit).add(TipoPrueba.TablaTipoPrueba.get(nID));
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Sistema de gestion de pruebas electricas");
        alert.setHeaderText("Creacion");
        alert.setContentText("El tipo de prueba se a creado satisfactoriamente\n"+NuevoTipoPrueba.toString());
        alert.showAndWait();
        EntradaAtributo1.setText("");
        EntradaAtributo1.setVisible(false);
        ListaAtributo2.setVisible(false);
        ListaAtributo3.setVisible(false);
        TextoAtributo1.setVisible(false);
        TextoAtributo2.setVisible(false);
        TextoAtributo3.setVisible(false);
        clase = null;
        SeleccionClase.setText("Elemento que desea crear");
    }

    public void CrearPrueba() {
        String nnombre = EntradaAtributo1.getText();
        String nclase = ListaAtributo2.getValue();
        int idtipoprueba = -1;
        if (nnombre.equals("")){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sistema de gestion de pruebas electricas");
            alert.setHeaderText("Creacion");
            alert.setContentText("Por favor ingrese el nombre de la prueba");
            alert.showAndWait();
            EntradaAtributo1.setText("");
            return;
        }
        if (nclase == null){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sistema de gestion de pruebas electricas");
            alert.setHeaderText("Creacion");
            alert.setContentText("Por favor seleccione la clase utilizada");
            alert.showAndWait();
            return;
        }try {
            idtipoprueba = ListaAtributo3.getValue();
        }catch (Exception o){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sistema de gestion de pruebas electricas");
            alert.setHeaderText("Creacion");
            alert.setContentText("Por favor seleccione el id del tipo de prueba correspondiente");
            alert.showAndWait();
            return;
        }
        int nID = App.IDPrueba;
        App.IDPrueba+=1;
        Prueba NuevaPrueba = new Prueba(nID,nnombre,idtipoprueba,nclase);
        Prueba.TablaPrueba.put(nID,NuevaPrueba);
        App.sistemaPruebasElectricas.addVertex(Prueba.TablaPrueba.get(nID));
        App.sistemaPruebasElectricas.addEdge(TipoPrueba.TablaTipoPrueba.get(idtipoprueba),Prueba.TablaPrueba.get(nID));
        App.sistemaPruebasElectricas.addEdge(Clase.TablaClase.get(nclase),Prueba.TablaPrueba.get(nID));
        if (!Prueba.ArbolPruebaNombre.containsKey(nnombre.toLowerCase())){
            Prueba.ArbolPruebaNombre.put(nnombre.toLowerCase(),new LinkedList<>());
        }
        Prueba.ArbolPruebaNombre.get(nnombre.toLowerCase()).add(Prueba.TablaPrueba.get(nID));
        if (!Prueba.ArbolPruebaClase.containsKey(nclase.toLowerCase())){
            Prueba.ArbolPruebaClase.put(nclase.toLowerCase(),new LinkedList<>());
        }
        Prueba.ArbolPruebaClase.get(nclase.toLowerCase()).add(Prueba.TablaPrueba.get(nID));
        if (!Prueba.ArbolPruebaTP.containsKey(idtipoprueba)){
            Prueba.ArbolPruebaTP.put(idtipoprueba,new LinkedList<>());
        }
        Prueba.ArbolPruebaTP.get(idtipoprueba).add(Prueba.TablaPrueba.get(nID));
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Sistema de gestion de pruebas electricas");
        alert.setHeaderText("Creacion");
        alert.setContentText("La prueba se ha creado satisfactoriamente\n"+NuevaPrueba.toString());
        alert.showAndWait();
        EntradaAtributo1.setText("");
        EntradaAtributo1.setVisible(false);
        ListaAtributo2.setVisible(false);
        ListaAtributo3.setVisible(false);
        TextoAtributo1.setVisible(false);
        TextoAtributo2.setVisible(false);
        TextoAtributo3.setVisible(false);
        clase = null;
        SeleccionClase.setText("Elemento que desea crear");
    }

    public void CrearInforme() {

    }
}
