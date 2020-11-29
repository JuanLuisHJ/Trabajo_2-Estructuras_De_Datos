package Trabajo2;

import Trabajo2.Clases.Laboratorio;
import Trabajo2.Clases.Norma;
import Trabajo2.Clases.TipoPrueba;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;

public class EditarControlador {
    public String clase = null;
    public boolean Atributo1 = false;
    public boolean Atributo2 = false;
    public boolean Atributo3 = false;
    public boolean Atributo4 = false;
    public int IDtipoPrueba;
    @FXML
    public Label TextoAtributo1;
    @FXML
    public Label TextoAtributo2;
    @FXML
    public Label TextoAtributo3;
    @FXML
    public Label TextoAtributo4;
    @FXML
    public Label TextoUK;
    @FXML
    public Label textoaviso;
    @FXML
    public TextField EntradaAtributo1;
    @FXML
    public TextField EntradaAtributo2;
    @FXML
    public TextField EntradaUK;
    @FXML
    public ChoiceBox<String> ListaAtributo3;
    @FXML
    public ChoiceBox<Integer> ListaAtributo4;
    @FXML
    public SplitMenuButton SeleccionClase;
    @FXML
    public ListView salida;
    @FXML
    public RadioButton BotAtributo1;
    @FXML
    public RadioButton BotAtributo2;
    @FXML
    public RadioButton BotAtributo3;
    @FXML
    public RadioButton BotAtributo4;
    @FXML
    private void Volver (ActionEvent event) throws IOException {
        App.setRoot("MenuAdministracion");
    }
    @FXML
    private void SeleccionTipoPrueba (ActionEvent event){
        clase = "TipoPrueba";
        SeleccionClase.setText("Tipo de Prueba");
        TextoUK.setText("ID");
        TextoAtributo1.setText("ID");
        TextoAtributo2.setText("Nombre");
        TextoAtributo3.setText("Norma utilizada");
        TextoAtributo4.setText("Nit del laboratorio");
        TextoAtributo1.setVisible(true);
        TextoAtributo2.setVisible(true);
        TextoAtributo3.setVisible(true);
        TextoAtributo4.setVisible(true);
        textoaviso.setVisible(true);
        BotAtributo1.setVisible(true);
        BotAtributo2.setVisible(true);
        BotAtributo3.setVisible(true);
        BotAtributo4.setVisible(true);
    }
    @FXML
    private void botonAtributo1(ActionEvent event){
        if (clase.equals("TipoPrueba")){
            Atributo1 = !Atributo1;
            if (Atributo1){
                EntradaAtributo1.setVisible(true);
            }else{
                EntradaAtributo1.setVisible(false);
            }
        }
    }
    @FXML
    private void botonAtributo2(ActionEvent event){
        if (clase.equals("TipoPrueba")){
            Atributo2 = !Atributo2;
            if (Atributo2){
                EntradaAtributo2.setVisible(true);
            }else{
                EntradaAtributo2.setVisible(false);
            }
        }
    }
    @FXML
    private void botonAtributo3(ActionEvent event){
        if (clase.equals("TipoPrueba")){
            Atributo3 = !Atributo3;
            if (Atributo3){
                ListaAtributo3.getItems().clear();
                int n = 0;
                for(String ref:Norma.TablaNorma.keySet()){
                    ListaAtributo3.getItems().add(n,ref);
                    n+=1;
                }
                ListaAtributo3.setVisible(true);
            }else{
                ListaAtributo3.setVisible(false);
            }
        }
    }
    @FXML
    private void botonAtributo4(ActionEvent event){
        if (clase.equals("TipoPrueba")){
            Atributo4 = !Atributo4;
            if (Atributo4){
                ListaAtributo4.getItems().clear();
                int n = 0;
                for(int nit:Laboratorio.TablaLaboratorio.keySet()){
                    ListaAtributo4.getItems().add(n,nit);
                    n+=1;
                }
                ListaAtributo4.setVisible(true);
                ListaAtributo4.setVisible(true);
            }else{
                ListaAtributo4.setVisible(false);
            }
        }
    }
    @FXML
    private void Verificar(ActionEvent event){
        if(clase == null){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sistema de gestion de pruebas electricas");
            alert.setHeaderText("Edicion");
            alert.setContentText("Por favor seleccione un elemento");
            alert.showAndWait();
        }
        else if (clase.equals("TipoPrueba")){
            VerificarTipoPrueba();
        }
    }
    public void VerificarTipoPrueba(){
        String id = EntradaUK.getText().trim();
        int ID = -1;
        if (id.equals("")){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sistema de gestion de pruebas electricas");
            alert.setHeaderText("Edicion");
            alert.setContentText("Por favor ingrese el ID del tipo de prueba");
            alert.showAndWait();
            EntradaUK.setText("");
            return;
        }
        try {
            ID = Integer.parseInt(id);
        }catch (Exception o){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sistema de gestion de pruebas electricas");
            alert.setHeaderText("Edicion");
            alert.setContentText("El ID para tipo de prueba debe ser un numero mayor 0");
            alert.showAndWait();
            EntradaUK.setText("");
            return;
        }
        if (ID<=0){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sistema de gestion de pruebas electricas");
            alert.setHeaderText("Edicion");
            alert.setContentText("El ID para tipo de prueba debe ser un numero mayor 0");
            alert.showAndWait();
            EntradaUK.setText("");
            return;
        }
        if (!TipoPrueba.TablaTipoPrueba.containsKey(ID)){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sistema de gestion de pruebas electricas");
            alert.setHeaderText("Edicion");
            alert.setContentText("El ID del tipo de prueba no se encuentra en la base de datos");
            alert.showAndWait();
            EntradaUK.setText("");
            return;
        }
        IDtipoPrueba = ID;
        salida.getItems().add(TipoPrueba.TablaTipoPrueba.get(ID));
        EntradaUK.setText("");
    }

    @FXML
    private void Editar(ActionEvent event){
        if(IDtipoPrueba<0){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sistema de gestion de pruebas electricas");
            alert.setHeaderText("Edicion");
            alert.setContentText("Por favor verifique si el elemento se encuentra en el sistema");
            alert.showAndWait();
        }
        else if (clase.equals("TipoPrueba")){
            EditarTipoPrueba();
        }
    }
    public void EditarTipoPrueba(){
        if (!Atributo1&&!Atributo2&&!Atributo3&&!Atributo4){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sistema de gestion de pruebas electricas");
            alert.setHeaderText("Edicion");
            alert.setContentText("Por favor seleccione el/los atributos que desea editar");
            alert.showAndWait();
        }
        if (Atributo1){
            String nid = EntradaAtributo1.getText().trim();
            int nID = -1;
            if (nid.equals("")){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Sistema de gestion de pruebas electricas");
                alert.setHeaderText("Editar");
                alert.setContentText("Por favor ingrese el ID del tipo de prueba");
                alert.showAndWait();
                EntradaAtributo1.setText("");
                return;
            }
            try {
                nID = Integer.parseInt(nid);
            }catch (Exception o){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Sistema de gestion de pruebas electricas");
                alert.setHeaderText("Editar");
                alert.setContentText("El ID para tipo de prueba debe ser un numero mayor 0");
                alert.showAndWait();
                EntradaAtributo1.setText("");
                return;
            }
            if (nID<=0){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Sistema de gestion de pruebas electricas");
                alert.setHeaderText("Editar");
                alert.setContentText("El ID para tipo de prueba debe ser un numero mayor 0");
                alert.showAndWait();
                EntradaAtributo1.setText("");
                return;
            }
            if (TipoPrueba.TablaTipoPrueba.containsKey(nID)){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Sistema de gestion de pruebas electricas");
                alert.setHeaderText("Editar");
                alert.setContentText("El ID del tipo de prueba ya se encuentra en la base de datos");
                alert.showAndWait();
                EntradaAtributo1.setText("");
                return;
            }
            TipoPrueba.TablaTipoPrueba.get(IDtipoPrueba).ID = nID;
            
        }
        if(Atributo2){

        }
        if(Atributo3){

        }
        if (Atributo4){

        }
    }
}
