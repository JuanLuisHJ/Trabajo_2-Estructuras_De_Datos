package Trabajo2;

import Trabajo2.Clases.TipoPrueba;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.text.Text;

import java.io.IOException;

public class MenuBusquedaControlador {
    public String clase = null;
    public String atributoTipoPrueba = null;
    @FXML
    public Label TextoAtributo;
    @FXML
    public TextField EntradaAtributo;
    @FXML
    public SplitMenuButton SeleccionClase;
    @FXML
    public SplitMenuButton AtributoTipoPrueba;
    @FXML
    public MenuItem SeleccionTipoPrueba;
    @FXML
    public MenuItem SeleccionID;
    @FXML
    public MenuItem SeleccionNombre;
    @FXML
    public MenuItem SeleccionReferencia;
    @FXML
    public MenuItem SeleccionNIT;
    @FXML
    public ListView salida;
    @FXML
    private void Volver (ActionEvent event) throws IOException {
        App.setRoot("MenuPrincipal");
    }
    @FXML
    private void SeleccionTipoPrueba(ActionEvent event) {
        AtributoTipoPrueba.setVisible(true);
        SeleccionClase.setText("Tipo de prueba");
        clase = "TipoPrueba";
    }
    @FXML
    private void SeleccionAtributoTipoPruebaID(ActionEvent event){
        AtributoTipoPrueba.setText("ID");
        TextoAtributo.setText("ID");
        TextoAtributo.setVisible(true);
        EntradaAtributo.setVisible(true);
        atributoTipoPrueba = "ID";
    }
    @FXML
    private void SeleccionAtributoTipoPruebaNombre(ActionEvent event){
        AtributoTipoPrueba.setText("Nombre");
        TextoAtributo.setText("Nombre");
        TextoAtributo.setVisible(true);
        EntradaAtributo.setVisible(true);
        atributoTipoPrueba = "Nombre";
    }
    @FXML
    private void SeleccionAtributoTipoPruebaRef(ActionEvent event){
        AtributoTipoPrueba.setText("Referencia de norma");
        TextoAtributo.setText("Referencia de norma");
        TextoAtributo.setVisible(true);
        EntradaAtributo.setVisible(true);
        atributoTipoPrueba = "Ref";
    }@FXML
    private void SeleccionAtributoTipoPruebaNit(ActionEvent event){
        AtributoTipoPrueba.setText("Nit del laboratorio");
        TextoAtributo.setText("Nit del laboratorio");
        TextoAtributo.setVisible(true);
        EntradaAtributo.setVisible(true);
        atributoTipoPrueba = "NIT";
    }
    @FXML
    private void Buscar(ActionEvent event){
        if(clase == null){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sistema de gestion de pruebas electricas");
            alert.setHeaderText("Busqueda");
            alert.setContentText("Por favor seleccione un elemento");
            alert.showAndWait();
        }
        if(atributoTipoPrueba == null){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sistema de gestion de pruebas electricas");
            alert.setHeaderText("Busqueda");
            alert.setContentText("Por favor seleccione un atributo");
            alert.showAndWait();
        }
        else if (clase.equals("TipoPrueba")){
            BuscarTipoPrueba();
        }
    }
    public void BuscarTipoPrueba(){
        if (atributoTipoPrueba.equals("ID")){
            String id = EntradaAtributo.getText().trim();
            int ID = -1;
            if (id.equals("")){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Sistema de gestion de pruebas electricas");
                alert.setHeaderText("Busqueda");
                alert.setContentText("Por favor ingrese el ID del tipo de prueba");
                alert.showAndWait();
                EntradaAtributo.setText("");
                return;
            }
            try {
                ID = Integer.parseInt(id);
            }catch (Exception o){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Sistema de gestion de pruebas electricas");
                alert.setHeaderText("Busqueda");
                alert.setContentText("El ID para tipo de prueba debe ser un numero mayor 0");
                alert.showAndWait();
                EntradaAtributo.setText("");
                return;
            }
            if (ID<=0){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Sistema de gestion de pruebas electricas");
                alert.setHeaderText("Busqueda");
                alert.setContentText("El ID para tipo de prueba debe ser un numero mayor 0");
                alert.showAndWait();
                EntradaAtributo.setText("");
                return;
            }
            if (!TipoPrueba.TablaTipoPrueba.containsKey(ID)){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Sistema de gestion de pruebas electricas");
                alert.setHeaderText("Busqueda");
                alert.setContentText("El ID del tipo de prueba no se encuentra en la base de datos");
                alert.showAndWait();
                EntradaAtributo.setText("");
                return;
            }
            salida.getItems().add(TipoPrueba.TablaTipoPrueba.get(ID));
            EntradaAtributo.setText("");
            SeleccionClase.setText("Elemento que desea buscar");
            AtributoTipoPrueba.setText("Seleccione el atributo");
            clase = null;
            atributoTipoPrueba = null;
            TextoAtributo.setVisible(false);
            EntradaAtributo.setVisible(false);
            AtributoTipoPrueba.setVisible(false);

        }else if (atributoTipoPrueba.equals("Nombre")){
            String Nombre = EntradaAtributo.getText().toLowerCase();
            if (Nombre.equals("")){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Sistema de gestion de pruebas electricas");
                alert.setHeaderText("Busqueda");
                alert.setContentText("Por favor ingrese el nombre del tipo de prueba");
                alert.showAndWait();
                EntradaAtributo.setText("");
                return;
            }
            if (!TipoPrueba.ArbolTipoPruebaNombre.containsKey(Nombre)){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Sistema de gestion de pruebas electricas");
                alert.setHeaderText("Busqueda");
                alert.setContentText("El nombre del tipo de prueba no se encuentra en la base de datos");
                alert.showAndWait();
                EntradaAtributo.setText("");
                return;
            }
            for (TipoPrueba tipoprueba:TipoPrueba.ArbolTipoPruebaNombre.get(Nombre)){
                salida.getItems().add(tipoprueba);
            }
            EntradaAtributo.setText("");
            SeleccionClase.setText("Elemento que desea buscar");
            AtributoTipoPrueba.setText("Seleccione el atributo");
            clase = null;
            atributoTipoPrueba = null;
            TextoAtributo.setVisible(false);
            EntradaAtributo.setVisible(false);
            AtributoTipoPrueba.setVisible(false);

        }else if (atributoTipoPrueba.equals("Ref")){
            String Referencia = EntradaAtributo.getText().toLowerCase();
            if (Referencia.equals("")){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Sistema de gestion de pruebas electricas");
                alert.setHeaderText("Busqueda");
                alert.setContentText("Por favor ingrese la referencia de la norma asociada al tipo de prueba");
                alert.showAndWait();
                EntradaAtributo.setText("");
                return;
            }
            if (!TipoPrueba.ArbolTipoPruebaRef.containsKey(Referencia)){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Sistema de gestion de pruebas electricas");
                alert.setHeaderText("Busqueda");
                alert.setContentText("La norma no tiene tipo de prueba asociados");
                alert.showAndWait();
                EntradaAtributo.setText("");
                return;
            }
            for (TipoPrueba tipoprueba:TipoPrueba.ArbolTipoPruebaRef.get(Referencia)){
                salida.getItems().add(tipoprueba);
            }
            EntradaAtributo.setText("");
            SeleccionClase.setText("Elemento que desea buscar");
            AtributoTipoPrueba.setText("Seleccione el atributo");
            clase = null;
            atributoTipoPrueba = null;
            TextoAtributo.setVisible(false);
            EntradaAtributo.setVisible(false);
            AtributoTipoPrueba.setVisible(false);

        }else if(atributoTipoPrueba.equals("NIT")){
            String nit = EntradaAtributo.getText().trim();
            int NIT = -1;
            if (nit.equals("")){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Sistema de gestion de pruebas electricas");
                alert.setHeaderText("Busqueda");
                alert.setContentText("Por favor ingrese el Nit del laboratorio correspondiente al tipo de prueba");
                alert.showAndWait();
                EntradaAtributo.setText("");
                return;
            }
            try {
                NIT = Integer.parseInt(nit);
            }catch (Exception o){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Sistema de gestion de pruebas electricas");
                alert.setHeaderText("Busqueda");
                alert.setContentText("El NIT del laboratorio debe un numero mayor 0");
                alert.showAndWait();
                EntradaAtributo.setText("");
                return;
            }
            if (NIT<=0){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Sistema de gestion de pruebas electricas");
                alert.setHeaderText("Busqueda");
                alert.setContentText("El NIT del laboratorio debe un numero mayor 0");
                alert.showAndWait();
                EntradaAtributo.setText("");
                return;
            }
            if (!TipoPrueba.ArbolTipoPruebaNit.containsKey(NIT)){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Sistema de gestion de pruebas electricas");
                alert.setHeaderText("Busqueda");
                alert.setContentText("El NIT del laboratorio no tiene tipos de prueba asociadas");
                alert.showAndWait();
                EntradaAtributo.setText("");
                return;
            }
            for (TipoPrueba tipoprueba:TipoPrueba.ArbolTipoPruebaNit.get(NIT)){
                salida.getItems().add(tipoprueba);
            }
            EntradaAtributo.setText("");
            SeleccionClase.setText("Elemento que desea buscar");
            AtributoTipoPrueba.setText("Seleccione el atributo");
            clase = null;
            atributoTipoPrueba = null;
            TextoAtributo.setVisible(false);
            EntradaAtributo.setVisible(false);
            AtributoTipoPrueba.setVisible(false);
        }
    }
}
