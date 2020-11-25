package Trabajo2;

import Trabajo2.Clases.Laboratorio;
import Trabajo2.Clases.Norma;
import Trabajo2.Clases.TipoPrueba;
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
}
