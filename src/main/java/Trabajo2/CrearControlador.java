package Trabajo2;

import Trabajo2.Clases.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

import static java.util.Arrays.asList;

public class CrearControlador {

    public String clase = null;
    @FXML
    public Label TextoAtributo1;
    @FXML
    public Label TextoAtributo2;
    @FXML
    public Label TextoAtributo3;
    @FXML
    public Label TextoAtributo4;
    @FXML
    public Label TextoAtributo5;
    @FXML
    public Label TextoAtributo6;
    @FXML
    public Label TextoAtributo7;
    @FXML
    public TextField EntradaAtributo1;
    @FXML
    public TextField Humedad;
    @FXML
    public TextField Presion;
    @FXML
    public TextField Temperatura;
    @FXML
    public ChoiceBox<String> ListaAtributo2;
    @FXML
    public ChoiceBox<Integer> ListaAtributo3;
    @FXML
    public ChoiceBox<String> ListaAtributo4;
    @FXML
    public ChoiceBox<String> Comments;
    @FXML
    public ChoiceBox<Prueba>  PruebasSinInfo;
    @FXML
    public SplitMenuButton SeleccionClase;
    @FXML
    public MenuItem SeleccionTipoPrueba;
    @FXML
    public MenuItem SeleccionPrueba;
    @FXML
    public RadioButton Paso;
    @FXML
    public RadioButton NoPaso;
    @FXML
    public ToggleGroup Resultado;

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
        TextoAtributo4.setVisible(false);
        TextoAtributo5.setVisible(false);
        TextoAtributo6.setVisible(false);
        TextoAtributo7.setVisible(false);
        Humedad.setVisible(false);
        Presion.setVisible(false);
        Temperatura.setVisible(false);
        Comments.setVisible(false);
        Paso.setVisible(false);
        NoPaso.setVisible(false);
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
        ListaAtributo4.setVisible(false);
        PruebasSinInfo.setVisible(false);
    }
    @FXML
    public void SeleccionPrueba (ActionEvent event){
        ListaAtributo2.getItems().clear();
        ListaAtributo3.getItems().clear();
        ListaAtributo4.getItems().clear();
        clase = "Prueba";
        SeleccionClase.setText("Prueba");
        TextoAtributo1.setText("Nombre");
        TextoAtributo2.setText("Clase utilizada");
        TextoAtributo3.setText("Tipo de prueba");
        TextoAtributo4.setText("Dispositivo usado");
        TextoAtributo1.setVisible(true);
        TextoAtributo2.setVisible(true);
        TextoAtributo3.setVisible(true);
        TextoAtributo4.setVisible(true);
        TextoAtributo5.setVisible(false);
        TextoAtributo6.setVisible(false);
        TextoAtributo7.setVisible(false);
        Humedad.setVisible(false);
        Presion.setVisible(false);
        Temperatura.setVisible(false);
        Comments.setVisible(false);
        Paso.setVisible(false);
        NoPaso.setVisible(false);
        int n = 0;
        for (String nom: Clase.TablaClase.keySet()) {
            ListaAtributo2.getItems().add(n,nom);
        }
        n = 0;
        for(int id:TipoPrueba.TablaTipoPrueba.keySet()){
            ListaAtributo3.getItems().add(n,id);
            n+=1;
        }
        n = 0;
        for (String dispo: Dispositivo.TablaDispositivo.keySet()) {
            ListaAtributo4.getItems().add(n,dispo);
            n+=1;
        }
        EntradaAtributo1.setVisible(true);
        ListaAtributo2.setVisible(true);
        ListaAtributo3.setVisible(true);
        ListaAtributo4.setVisible(true);
        PruebasSinInfo.setVisible(false);
    }
    @FXML
    public void SeleccionInforme (ActionEvent event){
        clase="Informe";
        SeleccionClase.setText("Informe");
        TextoAtributo1.setText("Número de informe");
        TextoAtributo2.setText("Humedad %");
        TextoAtributo3.setText("Presión");
        TextoAtributo4.setText("Temperatura");
        TextoAtributo5.setText("Comentario");
        TextoAtributo6.setText("Resultado");
        TextoAtributo7.setText("Prueba");
        NoPaso.setSelected(true);
        SeleccionClase.setVisible(true);
        TextoAtributo1.setVisible(true);
        TextoAtributo2.setVisible(true);
        TextoAtributo3.setVisible(true);
        TextoAtributo4.setVisible(true);
        TextoAtributo5.setVisible(true);
        TextoAtributo6.setVisible(true);
        TextoAtributo7.setVisible(true);
        Comments.setItems(FXCollections.observableList(asList(Informe.Comentarios)));
        EntradaAtributo1.setVisible(true);
        Humedad.setVisible(true);
        Presion.setVisible(true);
        Temperatura.setVisible(true);
        Comments.setVisible(true);
        Paso.setVisible(true);
        NoPaso.setVisible(true);
        ArrayList<Prueba> PruebasSinInforme = new ArrayList<>();
        Prueba prueba;
        for(int ID: Prueba.TablaPrueba.keySet()){
            prueba = Prueba.TablaPrueba.get(ID);
            if(prueba.NumInforme==-1){
                PruebasSinInforme.add(prueba);
            }
        }
        if(PruebasSinInforme.isEmpty()){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sistema de gestion de pruebas electricas");
            alert.setHeaderText("Creación");
            alert.setContentText("En este momento todas las pruebas tienen informe\n y no podrá seleccionar ninguna");
            alert.showAndWait();
            return;
        }
        PruebasSinInfo.setItems(FXCollections.observableList(PruebasSinInforme));
        ListaAtributo2.setVisible(false);
        ListaAtributo3.setVisible(false);
        ListaAtributo4.setVisible(false);
        PruebasSinInfo.setVisible(true);

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
        alert.setContentText("El tipo de prueba se ha creado satisfactoriamente\n"+NuevoTipoPrueba.toString());
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
        String ndispo = ListaAtributo4.getValue();
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

        }
        try {
            idtipoprueba = ListaAtributo3.getValue();
        }catch (Exception o){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sistema de gestion de pruebas electricas");
            alert.setHeaderText("Creacion");
            alert.setContentText("Por favor seleccione el id del tipo de prueba correspondiente");
            alert.showAndWait();
            return;
        }
        if (ndispo == null){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sistema de gestion de pruebas electricas");
            alert.setHeaderText("Creacion");
            alert.setContentText("Por favor seleccione la referencia del dispositivo utilizado");
            alert.showAndWait();
            return;
        }
        int nID = App.IDPrueba;
        App.IDPrueba+=1;
        Prueba NuevaPrueba = new Prueba(nID,nnombre,idtipoprueba,nclase,ndispo);
        Prueba.TablaPrueba.put(nID,NuevaPrueba);
        App.sistemaPruebasElectricas.addVertex(Prueba.TablaPrueba.get(nID));
        App.sistemaPruebasElectricas.addEdge(TipoPrueba.TablaTipoPrueba.get(idtipoprueba),Prueba.TablaPrueba.get(nID));
        App.sistemaPruebasElectricas.addEdge(Clase.TablaClase.get(nclase),Prueba.TablaPrueba.get(nID));
        App.sistemaPruebasElectricas.addEdge(Dispositivo.TablaDispositivo.get(ndispo),Prueba.TablaPrueba.get(nID));
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
        if (!Prueba.ArbolPruebaDispo.containsKey(ndispo.toLowerCase())){
            Prueba.ArbolPruebaDispo.put(ndispo.toLowerCase(),new LinkedList<>());
        }
        Prueba.ArbolPruebaDispo.get(ndispo.toLowerCase()).add(Prueba.TablaPrueba.get(nID));
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Sistema de gestion de pruebas electricas");
        alert.setHeaderText("Creacion");
        alert.setContentText("La prueba se ha creado satisfactoriamente\n"+NuevaPrueba.toString());
        alert.showAndWait();
        EntradaAtributo1.setText("");
        EntradaAtributo1.setVisible(false);
        ListaAtributo2.setVisible(false);
        ListaAtributo3.setVisible(false);
        ListaAtributo4.setVisible(false);
        TextoAtributo1.setVisible(false);
        TextoAtributo2.setVisible(false);
        TextoAtributo3.setVisible(false);
        TextoAtributo4.setVisible(false);
        clase = null;
        SeleccionClase.setText("Elemento que desea crear");
    }

    public void CrearInforme() {
        String numeroInformeString = EntradaAtributo1.getText();
        int numeroInforme;
        try{
            numeroInforme = Integer.parseInt(numeroInformeString);
            if(numeroInforme<0){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Sistema de gestion de pruebas electricas");
                alert.setHeaderText("Número Informe");
                alert.setContentText("Por favor ingrese un número de informe mayor o igual que cero");
                alert.showAndWait();
                return;
            }
            if(Informe.InformesPorNumero.containsKey(numeroInforme)){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Sistema de gestion de pruebas electricas");
                alert.setHeaderText("Número Informe");
                alert.setContentText("El número de informe proporcionado ya se encuentra asignado a una prueba");
                alert.showAndWait();
                return;
            }
        }
        catch(Exception e){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sistema de gestion de pruebas electricas");
            alert.setHeaderText("Número Informe");
            alert.setContentText("Por favor ingrese un valor numérico mayor o igual que cero");
            alert.showAndWait();
            return;
        }
        String HumemdadString = Humedad.getText();
        double humedad;
        try{
            humedad = Double.parseDouble(HumemdadString);
            if(humedad<0 || humedad>100){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Sistema de gestion de pruebas electricas");
                alert.setHeaderText("Humedad");
                alert.setContentText("Por favor ingrese un valor de humedad entre 0 y 100");
                alert.showAndWait();
                return;
            }
        }
        catch(Exception e){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sistema de gestion de pruebas electricas");
            alert.setHeaderText("Humedad");
            alert.setContentText("Por favor ingrese un valor numérico de humedad");
            alert.showAndWait();
            return;
        }
        String PresionString = Presion.getText();
        double presion;
        try{
            presion = Double.parseDouble(PresionString);
        }
        catch(Exception e){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sistema de gestion de pruebas electricas");
            alert.setHeaderText("Presión");
            alert.setContentText("Por favor ingrese un valor numérico de presión");
            alert.showAndWait();
            return;
        }
        String TemperaturaString = Temperatura.getText();
        double temperatura;
        try{
            temperatura = Double.parseDouble(TemperaturaString);
        }
        catch(Exception e){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sistema de gestion de pruebas electricas");
            alert.setHeaderText("Temperatura");
            alert.setContentText("Por favor ingrese un valor numérico de temperatura");
            alert.showAndWait();
            return;
        }
        String comentario = Comments.getValue();
        if (comentario==null){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sistema de gestion de pruebas electricas");
            alert.setHeaderText("Comentario");
            alert.setContentText("Por favor seleccione un comentario");
            alert.showAndWait();
            return;
        }
        /*if(numeroInformeString.equals("") || HumemdadString.equals("") || PresionString.equals("") || TemperaturaString.equals("") || comentario==null){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sistema de gestion de pruebas electricas");
            alert.setHeaderText("Creación");
            alert.setContentText("Por favor llene todos los campos");
            alert.showAndWait();
            return;
        }*/
        boolean resultado = Paso.isSelected();
        Prueba PruebaConNuevoInforme = PruebasSinInfo.getValue();
        if(PruebaConNuevoInforme==null){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sistema de gestion de pruebas electricas");
            alert.setHeaderText("Prueba");
            alert.setContentText("Por favor seleccione una prueba para crearle informe");
            alert.showAndWait();
            return;
        }
        Informe nuevoInforme = new Informe(numeroInforme,resultado,comentario,temperatura,humedad,presion);
        Informe.InformesPorNumero.put(nuevoInforme.NumInforme,nuevoInforme);
        if(Informe.InformesPorComentario.containsKey(comentario)){
            HashMap<Integer,Informe> InformesConEsteComentario = Informe.InformesPorComentario.get(comentario);
            InformesConEsteComentario.put(nuevoInforme.NumInforme,nuevoInforme);
            Informe.InformesPorComentario.put(comentario.toLowerCase(),InformesConEsteComentario);
        }
        else{
            HashMap<Integer,Informe> nuevoInformeConEsteComentario = new HashMap<>();
            nuevoInformeConEsteComentario.put(nuevoInforme.NumInforme,nuevoInforme);
            Informe.InformesPorComentario.put(nuevoInforme.Comentario.toLowerCase(),nuevoInformeConEsteComentario);
        }
        if(Informe.InformesPorTemperatura.containsKey(nuevoInforme.Temperatura)){
            HashMap<Integer,Informe> InformesConEstaTemperatura = Informe.InformesPorTemperatura.get(temperatura);
            InformesConEstaTemperatura.put(nuevoInforme.NumInforme,nuevoInforme);
            Informe.InformesPorTemperatura.put(temperatura,InformesConEstaTemperatura);
        }
        else{
            HashMap<Integer,Informe> nuevoInformeConEstaTemperatura = new HashMap<>();
            nuevoInformeConEstaTemperatura.put(nuevoInforme.NumInforme,nuevoInforme);
            Informe.InformesPorTemperatura.put(temperatura,nuevoInformeConEstaTemperatura);
        }
        PruebaConNuevoInforme.NumInforme=numeroInforme;
        App.sistemaPruebasElectricas.addVertex(nuevoInforme);
        App.sistemaPruebasElectricas.addEdge(Informe.InformesPorNumero.get(nuevoInforme.NumInforme),Prueba.TablaPrueba.get(PruebaConNuevoInforme.ID));
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Sistema de gestion de pruebas electricas");
        alert.setHeaderText("Creación");
        alert.setContentText("El informe se ha creado satisfactoriamente\n"+nuevoInforme.toString());
        alert.showAndWait();
        TextoAtributo1.setVisible(false);
        TextoAtributo2.setVisible(false);
        TextoAtributo3.setVisible(false);
        TextoAtributo4.setVisible(false);
        TextoAtributo5.setVisible(false);
        TextoAtributo6.setVisible(false);
        TextoAtributo7.setVisible(false);
        EntradaAtributo1.setVisible(false);
        Humedad.setVisible(false);
        Presion.setVisible(false);
        Temperatura.setVisible(false);
        Comments.setVisible(false);
        Paso.setVisible(false);
        NoPaso.setVisible(false);
        PruebasSinInfo.setVisible(false);
        EntradaAtributo1.setText("");
        Humedad.setText("");
        Presion.setText("");
        Temperatura.setText("");
        clase = null;
        SeleccionClase.setText("Elemento que desea crear");
        PruebasSinInfo.getItems().clear();
    }
}

//1152465710