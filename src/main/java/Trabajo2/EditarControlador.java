package Trabajo2;

import Trabajo2.Clases.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;

public class EditarControlador {
    public String clase = null;
    public boolean Atributo1 = false;
    public boolean Atributo2 = false;
    public boolean Atributo3 = false;
    public boolean Atributo4 = false;
    public boolean Atributo5 = false;
    public boolean Atributo6 = false;
    public int IDtipoPrueba = -1;
    public int IDPrueba = -1;
    public boolean verificandoInforme=false;
    public Integer NumeroInforme;
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
    public Label TextoUK;
    @FXML
    public Label textoaviso;
    @FXML
    public TextField EntradaAtributo1;
    @FXML
    public TextField EntradaAtributo2;
    @FXML
    public TextField EntradaAtributo3;
    @FXML
    public TextField EntradaAtributo4;
    @FXML
    public TextField EntradaUK;
    @FXML
    public ChoiceBox<String> ListaAtributo3;
    @FXML
    public ChoiceBox<Integer> ListaAtributo4;
    @FXML
    public ChoiceBox<String> ListaAtributo5;
    @FXML
    public ChoiceBox<String> ListaAtributo6;
    @FXML
    public ChoiceBox<String> Comment;
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
    public RadioButton BotAtributo5;
    @FXML
    public RadioButton BotAtributo6;
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
    private void SeleccionTipoPrueba (ActionEvent event){
        ApagarBotones();
        Atributo1 = false;
        Atributo2 = false;
        Atributo3 = false;
        Atributo4 = false;
        Atributo5 = false;
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
        TextoAtributo5.setVisible(false);
        TextoAtributo6.setVisible(false);
        textoaviso.setVisible(true);
        BotAtributo1.setVisible(true);
        BotAtributo2.setVisible(true);
        BotAtributo3.setVisible(true);
        BotAtributo4.setVisible(true);
        BotAtributo5.setVisible(false);
        BotAtributo6.setVisible(false);
    }
    @FXML
    private void SeleccionPrueba (ActionEvent event){
        ApagarBotones();
        Atributo1 = false;
        Atributo2 = false;
        Atributo3 = false;
        Atributo4 = false;
        Atributo5 = false;
        clase = "Prueba";
        SeleccionClase.setText("Prueba");
        TextoUK.setText("ID");
        TextoAtributo1.setText("ID");
        TextoAtributo2.setText("Nombre");
        TextoAtributo3.setText("Clase utilizada");
        TextoAtributo4.setText("Tipo de prueba");
        TextoAtributo5.setText("Dispositivo utilizado");
        TextoAtributo1.setVisible(true);
        TextoAtributo2.setVisible(true);
        TextoAtributo3.setVisible(true);
        TextoAtributo4.setVisible(true);
        TextoAtributo5.setVisible(true);
        TextoAtributo6.setVisible(false);
        textoaviso.setVisible(true);
        BotAtributo1.setVisible(true);
        BotAtributo2.setVisible(true);
        BotAtributo3.setVisible(true);
        BotAtributo4.setVisible(true);
        BotAtributo5.setVisible(true);
        BotAtributo6.setVisible(false);
    }
    @FXML
    private void SeleccionInforme (ActionEvent event){
        ApagarBotones();
        clase = "Informe";
        SeleccionClase.setText("Informe");
        TextoUK.setText("Número de Informe");
        TextoAtributo1.setText("Número de Informe");
        TextoAtributo2.setText("Humedad %");
        TextoAtributo3.setText("Presión");
        TextoAtributo4.setText("Temperatura");
        TextoAtributo5.setText("Comentario");
        TextoAtributo6.setText("Resultado");
        textoaviso.setVisible(true);
        TextoAtributo1.setVisible(true);
        TextoAtributo2.setVisible(true);
        TextoAtributo3.setVisible(true);
        TextoAtributo4.setVisible(true);
        TextoAtributo5.setVisible(true);
        TextoAtributo6.setVisible(true);
        BotAtributo1.setVisible(true);
        BotAtributo2.setVisible(true);
        BotAtributo3.setVisible(true);
        BotAtributo4.setVisible(true);
        BotAtributo5.setVisible(true);
        BotAtributo6.setVisible(true);
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
        else if (clase.equals("Prueba")){
            Atributo1 = !Atributo1;
            if (Atributo1){
                EntradaAtributo1.setVisible(true);
            }else{
                EntradaAtributo1.setVisible(false);
            }
        }
        else if (clase.equals("Informe")){
            EntradaAtributo1.setVisible(BotAtributo1.isSelected());
            if(!BotAtributo1.isSelected()){
                EntradaAtributo1.setText("");
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
        else if (clase.equals("Prueba")){
            Atributo2 = !Atributo2;
            if (Atributo2){
                EntradaAtributo2.setVisible(true);
            }else{
                EntradaAtributo2.setVisible(false);
            }
        }
        else if (clase.equals("Informe")){
            EntradaAtributo2.setVisible(BotAtributo2.isSelected());
            if(!BotAtributo2.isSelected()){
                EntradaAtributo2.setText("");
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
        else if (clase.equals("Prueba")){
            Atributo3 = !Atributo3;
            if (Atributo3){
                ListaAtributo3.getItems().clear();
                int n = 0;
                for(String ref:Clase.TablaClase.keySet()){
                    ListaAtributo3.getItems().add(n,ref);
                    n+=1;
                }
                ListaAtributo3.setVisible(true);
            }else{
                ListaAtributo3.setVisible(false);
            }
        }
        else if (clase.equals("Informe")){
            EntradaAtributo3.setVisible(BotAtributo3.isSelected());
            if(!BotAtributo3.isSelected()){
                EntradaAtributo3.setText("");
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
        else if (clase.equals("Prueba")){
            Atributo4 = !Atributo4;
            if (Atributo4){
                ListaAtributo4.getItems().clear();
                int n = 0;
                for(int nit:TipoPrueba.TablaTipoPrueba.keySet()){
                    ListaAtributo4.getItems().add(n,nit);
                    n+=1;
                }
                ListaAtributo4.setVisible(true);
                ListaAtributo4.setVisible(true);
            }else{
                ListaAtributo4.setVisible(false);
            }
        }
        else if (clase.equals("Informe")){
            EntradaAtributo4.setVisible(BotAtributo4.isSelected());
            if(!BotAtributo4.isSelected()){
                EntradaAtributo4.setText("");
            }
        }
    }
    @FXML
    private void botonAtributo5(ActionEvent event){
        if (clase.equals("Prueba")){
            Atributo5 = !Atributo5;
            if (Atributo5){
                ListaAtributo5.getItems().clear();
                int n = 0;
                for(String ref:Dispositivo.TablaDispositivo.keySet()){
                    ListaAtributo5.getItems().add(n,ref);
                    n+=1;
                }
                ListaAtributo5.setVisible(true);
            }else{
                ListaAtributo5.setVisible(false);
            }
        }
        else if(clase.equals("Informe")){
            if(BotAtributo5.isSelected()){
                Comment.setVisible(true);
                for(String comentario : Informe.Comentarios){
                    Comment.getItems().add(comentario);
                }
            }
            else{
                Comment.getItems().clear();
                Comment.setVisible(false);
            }
        }
    }
    @FXML
    private void botonAtributo6(ActionEvent event){
        if(BotAtributo6.isSelected()){
            Paso.setVisible(true);
            NoPaso.setVisible(true);
            NoPaso.setSelected(true);
        }
        else{
            Paso.setVisible(false);
            NoPaso.setVisible(false);
            NoPaso.setSelected(true);
        }
    }
    @FXML
    private void Verificar(ActionEvent event){
        if(clase == null){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sistema de gestión de pruebas eléctricas");
            alert.setHeaderText("Edición");
            alert.setContentText("Por favor seleccione un elemento");
            alert.showAndWait();
        }
        else if (clase.equals("TipoPrueba")){
            VerificarTipoPrueba();
        }
        else if (clase.equals("Prueba")) {
            VerificarPrueba();
        }
        else {
            VerficarInforme();
        }
    }
    public void VerificarTipoPrueba(){
        salida.getItems().clear();
        String id = EntradaUK.getText().trim();
        int ID = -1;
        if (id.equals("")){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sistema de gestión de pruebas eléctricas");
            alert.setHeaderText("Edición");
            alert.setContentText("Por favor ingrese el ID del tipo de prueba");
            alert.showAndWait();
            EntradaUK.setText("");
            return;
        }
        try {
            ID = Integer.parseInt(id);
        }catch (Exception o){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sistema de gestión de pruebas eléctricas");
            alert.setHeaderText("Edición");
            alert.setContentText("El ID para tipo de prueba debe ser un numero mayor que 0");
            alert.showAndWait();
            EntradaUK.setText("");
            return;
        }
        if (ID<=0){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sistema de gestión de pruebas eléctricas");
            alert.setHeaderText("Edición");
            alert.setContentText("El ID para tipo de prueba debe ser un numero mayor que 0");
            alert.showAndWait();
            EntradaUK.setText("");
            return;
        }
        if (!TipoPrueba.TablaTipoPrueba.containsKey(ID)){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sistema de gestión de pruebas eléctricas");
            alert.setHeaderText("Edición");
            alert.setContentText("El ID del tipo de prueba no se encuentra en la base de datos");
            alert.showAndWait();
            EntradaUK.setText("");
            return;
        }
        IDtipoPrueba = ID;
        salida.getItems().add(TipoPrueba.TablaTipoPrueba.get(ID));
        EntradaUK.setText("");
    }
    public void VerificarPrueba(){
        String id = EntradaUK.getText().trim();
        int ID = -1;
        if (id.equals("")){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sistema de gestión de pruebas eléctricas");
            alert.setHeaderText("Edición");
            alert.setContentText("Por favor ingrese el ID de la prueba");
            alert.showAndWait();
            EntradaUK.setText("");
            return;
        }
        try {
            ID = Integer.parseInt(id);
        }catch (Exception o){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sistema de gestión de pruebas eléctricas");
            alert.setHeaderText("Edición");
            alert.setContentText("El ID para prueba debe ser un numero mayor que 0");
            alert.showAndWait();
            EntradaUK.setText("");
            return;
        }
        if (ID<=0){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sistema de gestión de pruebas eléctricas");
            alert.setHeaderText("Edición");
            alert.setContentText("El ID  prueba debe ser un numero mayor que 0");
            alert.showAndWait();
            EntradaUK.setText("");
            return;
        }
        if (!Prueba.TablaPrueba.containsKey(ID)){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sistema de gestión de pruebas eléctricas");
            alert.setHeaderText("Edición");
            alert.setContentText("El ID de la prueba no se encuentra en la base de datos");
            alert.showAndWait();
            EntradaUK.setText("");
            return;
        }
        IDPrueba = ID;
        salida.getItems().add(Prueba.TablaPrueba.get(ID));
        EntradaUK.setText("");
    }
    public void VerficarInforme(){
        verificandoInforme=true;
        salida.getItems().clear();
        String numeroDeInformeString = EntradaUK.getText().trim();
        if (numeroDeInformeString.equals("")){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sistema de gestión de pruebas eléctricas");
            alert.setHeaderText("Número de informe");
            alert.setContentText("Por favor, llene el campo \"Número de Informe\"");
            alert.showAndWait();
            return;
        }
        int numeroDeInforme;
        try {
            numeroDeInforme=Integer.parseInt(numeroDeInformeString);
            if(numeroDeInforme<0){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Sistema de gestión de pruebas eléctricas");
                alert.setHeaderText("Número de informe");
                alert.setContentText("El número de informe debe ser un valor numércio mayor que cero");
                alert.showAndWait();
                return;
            }
        }
        catch (Exception e){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sistema de gestión de pruebas eléctricas");
            alert.setHeaderText("Número de informe");
            alert.setContentText("El número de informe debe ser un valor numércio mayor que cero");
            alert.showAndWait();
            return;
        }
        if (!Informe.InformesPorNumero.containsKey(numeroDeInforme)){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sistema de gestión de pruebas eléctricas");
            alert.setHeaderText("Número de informe");
            alert.setContentText("El número de informe no se encuentra en la base de datos");
            alert.showAndWait();
        }
        else{
            salida.getItems().add(Informe.InformesPorNumero.get(numeroDeInforme));
            NumeroInforme=numeroDeInforme;
        }
    }
    @FXML
    private void Editar(ActionEvent event){
        if(verificandoInforme){
            if(NumeroInforme==null){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Sistema de gestión de pruebas eléctricas");
                alert.setHeaderText("Número de Informe");
                alert.setContentText("Por favor verifique si el informe se encuentra en el sistema");
                alert.showAndWait();
                return;
            }
            verificandoInforme=false;
        }
        if (clase.equals("TipoPrueba")){
            if(IDtipoPrueba<0){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Sistema de gestión de pruebas eléctricas");
                alert.setHeaderText("Edición");
                alert.setContentText("Por favor verifique si el elemento se encuentra en el sistema");
                alert.showAndWait();
                return;
            }
            EditarTipoPrueba();
            return;
        }
        if (clase.equals("Prueba")) {
            EditarPrueba();
            return;
        }
        if (clase.equals("Informe")) {
            EditarInforme();
            return;
        }
    }
    public void EditarTipoPrueba(){
        if (!Atributo1&&!Atributo2&&!Atributo3&&!Atributo4){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sistema de gestión de pruebas eléctricas");
            alert.setHeaderText("Edición");
            alert.setContentText("Por favor seleccione el/los atributos que desea editar");
            alert.showAndWait();
        }
        if (Atributo1){
            String nid = EntradaAtributo1.getText().trim();
            int nID = -1;
            if (nid.equals("")){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Sistema de gestión de pruebas eléctricas");
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
                alert.setTitle("Sistema de gestión de pruebas eléctricas");
                alert.setHeaderText("Editar");
                alert.setContentText("El ID para tipo de prueba debe ser un numero mayor que 0");
                alert.showAndWait();
                EntradaAtributo1.setText("");
                return;
            }
            if (nID<=0){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Sistema de gestión de pruebas eléctricas");
                alert.setHeaderText("Editar");
                alert.setContentText("El ID para tipo de prueba debe ser un numero mayor que 0");
                alert.showAndWait();
                EntradaAtributo1.setText("");
                return;
            }
            if (TipoPrueba.TablaTipoPrueba.containsKey(nID)){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Sistema de gestión de pruebas eléctricas");
                alert.setHeaderText("Editar");
                alert.setContentText("El ID del tipo de prueba ya se encuentra en la base de datos");
                alert.showAndWait();
                EntradaAtributo1.setText("");
                return;
            }
            TipoPrueba.TablaTipoPrueba.get(IDtipoPrueba).ID = nID;
            TipoPrueba.TablaTipoPrueba.put(TipoPrueba.TablaTipoPrueba.get(IDtipoPrueba).ID,TipoPrueba.TablaTipoPrueba.get(IDtipoPrueba));
            TipoPrueba.TablaTipoPrueba.remove(IDtipoPrueba);
            IDtipoPrueba = nID;
            TextoAtributo1.setText("");
        }
        if(Atributo2){
            String nNombre = EntradaAtributo2.getText();
            if (nNombre.equals("")){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Sistema de gestión de pruebas eléctricas");
                alert.setHeaderText("Editar");
                alert.setContentText("Por favor ingrese el nombre del tipo de prueba");
                alert.showAndWait();
                EntradaAtributo2.setText("");
                return;
            }
            String vNombre = TipoPrueba.TablaTipoPrueba.get(IDtipoPrueba).Nombre;
            TipoPrueba.TablaTipoPrueba.get(IDtipoPrueba).Nombre = nNombre;
            if (!TipoPrueba.ArbolTipoPruebaNombre.containsKey(nNombre.toLowerCase())){
                TipoPrueba.ArbolTipoPruebaNombre.put(nNombre.toLowerCase(),new LinkedList<>());
            }
            TipoPrueba.ArbolTipoPruebaNombre.get(nNombre.toLowerCase()).add(TipoPrueba.TablaTipoPrueba.get(IDtipoPrueba));
            TipoPrueba.ArbolTipoPruebaNombre.get(vNombre.toLowerCase()).remove(TipoPrueba.TablaTipoPrueba.get(IDtipoPrueba));
            if (TipoPrueba.ArbolTipoPruebaNombre.get(vNombre.toLowerCase()).isEmpty()){
                TipoPrueba.ArbolTipoPruebaNombre.remove(vNombre.toLowerCase());
            }
            TextoAtributo2.setText("");
        }
        if(Atributo3){
            String nReferencia = ListaAtributo3.getValue();
            if (nReferencia == null){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Sistema de gestión de pruebas eléctricas");
                alert.setHeaderText("Edición");
                alert.setContentText("Por favor seleccione la referencia de la norma asociada al tipo de prueba");
                alert.showAndWait();
                return;
            }
            String vReferencia = TipoPrueba.TablaTipoPrueba.get(IDtipoPrueba).RefNorma;
            TipoPrueba.TablaTipoPrueba.get(IDtipoPrueba).RefNorma = nReferencia;
            if (!TipoPrueba.ArbolTipoPruebaRef.containsKey(nReferencia.toLowerCase())){
                TipoPrueba.ArbolTipoPruebaRef.put(nReferencia.toLowerCase(),new LinkedList<>());
            }
            TipoPrueba.ArbolTipoPruebaRef.get(nReferencia.toLowerCase()).add(TipoPrueba.TablaTipoPrueba.get(IDtipoPrueba));
            TipoPrueba.ArbolTipoPruebaRef.get(vReferencia.toLowerCase()).remove(TipoPrueba.TablaTipoPrueba.get(IDtipoPrueba));
            if (TipoPrueba.ArbolTipoPruebaRef.get(vReferencia.toLowerCase()).isEmpty()){
                TipoPrueba.ArbolTipoPruebaRef.remove(vReferencia.toLowerCase());
            }
            App.sistemaPruebasElectricas.removeEdge(TipoPrueba.TablaTipoPrueba.get(IDtipoPrueba),Norma.TablaNorma.get(vReferencia));
            App.sistemaPruebasElectricas.addEdge(TipoPrueba.TablaTipoPrueba.get(IDtipoPrueba),Norma.TablaNorma.get(nReferencia));
        }
        if (Atributo4){
            int nnit = -1;
            try {
                nnit = ListaAtributo4.getValue();
            }catch (Exception o){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Sistema de gestión de pruebas eléctricas");
                alert.setHeaderText("Edición");
                alert.setContentText("Por favor seleccione el nit del laboratorio correspondiente");
                alert.showAndWait();
                return;
            }
            int vnit = TipoPrueba.TablaTipoPrueba.get(IDtipoPrueba).NitLaboratorio;
            TipoPrueba.TablaTipoPrueba.get(IDtipoPrueba).NitLaboratorio = nnit;
            if (!TipoPrueba.ArbolTipoPruebaNit.containsKey(nnit)){
                TipoPrueba.ArbolTipoPruebaNit.put(nnit,new LinkedList<>());
            }
            TipoPrueba.ArbolTipoPruebaNit.get(nnit).add(TipoPrueba.TablaTipoPrueba.get(IDtipoPrueba));
            TipoPrueba.ArbolTipoPruebaNit.get(vnit).remove(TipoPrueba.TablaTipoPrueba.get(IDtipoPrueba));
            if (TipoPrueba.ArbolTipoPruebaNit.get(vnit).isEmpty()){
                TipoPrueba.ArbolTipoPruebaNit.remove(vnit);
            }
            App.sistemaPruebasElectricas.removeEdge(TipoPrueba.TablaTipoPrueba.get(IDtipoPrueba),Laboratorio.TablaLaboratorio.get(vnit));
            App.sistemaPruebasElectricas.addEdge(TipoPrueba.TablaTipoPrueba.get(IDtipoPrueba),Laboratorio.TablaLaboratorio.get(nnit));
        }
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Sistema de gestión de pruebas eléctricas");
        alert.setHeaderText("Edición");
        alert.setContentText("El tipo de prueba se ha editado satisfactoriamente\n"+TipoPrueba.TablaTipoPrueba.get(IDtipoPrueba).toString());
        alert.showAndWait();
        clase = null;
        SeleccionClase.setText("Elemento que desea editar");
        TextoUK.setText("UK");
        EntradaUK.setText("");
        EntradaAtributo1.setText("");
        EntradaAtributo2.setText("");
        EntradaAtributo1.setVisible(false);
        EntradaAtributo2.setVisible(false);
        ListaAtributo3.setVisible(false);
        ListaAtributo4.setVisible(false);
        TextoAtributo1.setVisible(false);
        TextoAtributo2.setVisible(false);
        TextoAtributo3.setVisible(false);
        TextoAtributo4.setVisible(false);
        textoaviso.setVisible(false);
        BotAtributo1.setVisible(false);
        BotAtributo2.setVisible(false);
        BotAtributo3.setVisible(false);
        BotAtributo4.setVisible(false);
        BotAtributo1.setSelected(false);
        BotAtributo2.setSelected(false);
        BotAtributo3.setSelected(false);
        BotAtributo4.setSelected(false);
        Atributo1 = false;
        Atributo2 = false;
        Atributo3 = false;
        Atributo4 = false;
        salida.getItems().clear();
    }
    public void EditarPrueba(){
        if (!Atributo1&&!Atributo2&&!Atributo3&&!Atributo4){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sistema de gestión de pruebas eléctricas");
            alert.setHeaderText("Edición");
            alert.setContentText("Por favor seleccione el/los atributos que desea editar");
            alert.showAndWait();
        }
        if (Atributo1){
            String nid = EntradaAtributo1.getText().trim();
            int nID = -1;
            if (nid.equals("")){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Sistema de gestión de pruebas eléctricas");
                alert.setHeaderText("Editar");
                alert.setContentText("Por favor ingrese el ID de la prueba");
                alert.showAndWait();
                EntradaAtributo1.setText("");
                return;
            }
            try {
                nID = Integer.parseInt(nid);
            }catch (Exception o){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Sistema de gestión de pruebas eléctricas");
                alert.setHeaderText("Editar");
                alert.setContentText("El ID para prueba debe ser un numero mayor que 0");
                alert.showAndWait();
                EntradaAtributo1.setText("");
                return;
            }
            if (nID<=0){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Sistema de gestión de pruebas eléctricas");
                alert.setHeaderText("Editar");
                alert.setContentText("El ID para prueba debe ser un numero mayor que 0");
                alert.showAndWait();
                EntradaAtributo1.setText("");
                return;
            }
            if (Prueba.TablaPrueba.containsKey(nID)){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Sistema de gestión de pruebas eléctricas");
                alert.setHeaderText("Editar");
                alert.setContentText("El ID de la prueba ya se encuentra en la base de datos");
                alert.showAndWait();
                EntradaAtributo1.setText("");
                return;
            }
            Prueba.TablaPrueba.get(IDPrueba).ID = nID;
            Prueba.TablaPrueba.put(Prueba.TablaPrueba.get(IDPrueba).ID,Prueba.TablaPrueba.get(IDPrueba));
            Prueba.TablaPrueba.remove(IDPrueba);
            IDPrueba = nID;
            TextoAtributo1.setText("");
        }
        if(Atributo2){
            String nNombre = EntradaAtributo2.getText();
            if (nNombre.equals("")){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Sistema de gestión de pruebas eléctricas");
                alert.setHeaderText("Editar");
                alert.setContentText("Por favor ingrese el nombre del la prueba");
                alert.showAndWait();
                EntradaAtributo2.setText("");
                return;
            }
            String vNombre = Prueba.TablaPrueba.get(IDPrueba).Nombre;
            Prueba.TablaPrueba.get(IDPrueba).Nombre = nNombre;
            if (!Prueba.ArbolPruebaNombre.containsKey(nNombre.toLowerCase())){
                Prueba.ArbolPruebaNombre.put(nNombre.toLowerCase(),new LinkedList<>());
            }
            Prueba.ArbolPruebaNombre.get(nNombre.toLowerCase()).add(Prueba.TablaPrueba.get(IDPrueba));
            Prueba.ArbolPruebaNombre.get(vNombre.toLowerCase()).remove(Prueba.TablaPrueba.get(IDPrueba));
            if (Prueba.ArbolPruebaNombre.get(vNombre.toLowerCase()).isEmpty()){
                Prueba.ArbolPruebaNombre.remove(vNombre);
            }
            TextoAtributo2.setText("");
        }
        if(Atributo3){
            String nReferencia = ListaAtributo3.getValue();
            if (nReferencia == null){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Sistema de gestión de pruebas eléctricas");
                alert.setHeaderText("Edición");
                alert.setContentText("Por favor seleccione el nombre de la clase asociada a la prueba");
                alert.showAndWait();
                return;
            }
            String vReferencia = Prueba.TablaPrueba.get(IDPrueba).Clase;
            Prueba.TablaPrueba.get(IDPrueba).Clase = nReferencia;
            if (!Prueba.ArbolPruebaClase.containsKey(nReferencia.toLowerCase())){
                Prueba.ArbolPruebaClase.put(nReferencia.toLowerCase(),new LinkedList<>());
            }
            Prueba.ArbolPruebaClase.get(nReferencia.toLowerCase()).add(Prueba.TablaPrueba.get(IDPrueba));
            Prueba.ArbolPruebaClase.get(vReferencia.toLowerCase()).remove(Prueba.TablaPrueba.get(IDPrueba));
            if (Prueba.ArbolPruebaClase.get(vReferencia.toLowerCase()).isEmpty()){
                Prueba.ArbolPruebaClase.remove(vReferencia.toLowerCase());
            }
            App.sistemaPruebasElectricas.removeEdge(Prueba.TablaPrueba.get(IDPrueba),Clase.TablaClase.get(vReferencia));
            App.sistemaPruebasElectricas.addEdge(Prueba.TablaPrueba.get(IDPrueba),Clase.TablaClase.get(nReferencia));
        }
        if (Atributo4){
            int nnit = -1;
            try {
                nnit = ListaAtributo4.getValue();
            }catch (Exception o){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Sistema de gestión de pruebas eléctricas");
                alert.setHeaderText("Edición");
                alert.setContentText("Por favor seleccione el ID del tipo de laboratorio correspondiente");
                alert.showAndWait();
                return;
            }
            int vnit = Prueba.TablaPrueba.get(IDPrueba).TipoPrueba;
            Prueba.TablaPrueba.get(IDPrueba).TipoPrueba = nnit;
            if (!Prueba.ArbolPruebaTP.containsKey(nnit)){
                Prueba.ArbolPruebaTP.put(nnit,new LinkedList<>());
            }
            Prueba.ArbolPruebaTP.get(nnit).add(Prueba.TablaPrueba.get(IDPrueba));
            Prueba.ArbolPruebaTP.get(vnit).remove(Prueba.TablaPrueba.get(IDPrueba));
            if (Prueba.ArbolPruebaTP.get(vnit).isEmpty()){
                Prueba.ArbolPruebaTP.remove(vnit);
            }
            App.sistemaPruebasElectricas.removeEdge(Prueba.TablaPrueba.get(IDPrueba),TipoPrueba.TablaTipoPrueba.get(vnit));
            App.sistemaPruebasElectricas.addEdge(Prueba.TablaPrueba.get(IDPrueba),TipoPrueba.TablaTipoPrueba.get(nnit));
        }
        if(Atributo5){
            String nReferencia = ListaAtributo5.getValue();
            if (nReferencia == null){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Sistema de gestión de pruebas eléctricas");
                alert.setHeaderText("Edición");
                alert.setContentText("Por favor seleccione la referencia del dispositivo utilizado en la prueba");
                alert.showAndWait();
                return;
            }
            String vReferencia = Prueba.TablaPrueba.get(IDPrueba).Dispositivo;
            Prueba.TablaPrueba.get(IDPrueba).Dispositivo = nReferencia;
            if (!Prueba.ArbolPruebaDispo.containsKey(nReferencia.toLowerCase())){
                Prueba.ArbolPruebaDispo.put(nReferencia.toLowerCase(),new LinkedList<>());
            }
            Prueba.ArbolPruebaDispo.get(nReferencia.toLowerCase()).add(Prueba.TablaPrueba.get(IDPrueba));
            Prueba.ArbolPruebaDispo.get(vReferencia.toLowerCase()).remove(Prueba.TablaPrueba.get(IDPrueba));
            if (Prueba.ArbolPruebaDispo.get(vReferencia.toLowerCase()).isEmpty()){
                Prueba.ArbolPruebaDispo.remove(vReferencia.toLowerCase());
            }
            App.sistemaPruebasElectricas.removeEdge(Prueba.TablaPrueba.get(IDPrueba),Dispositivo.TablaDispositivo.get(vReferencia));
            App.sistemaPruebasElectricas.addEdge(Prueba.TablaPrueba.get(IDPrueba),Dispositivo.TablaDispositivo.get(nReferencia));
        }
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Sistema de gestión de pruebas eléctricas");
        alert.setHeaderText("Edición");
        alert.setContentText("La prueba se ha editado satisfactoriamente\n"+Prueba.TablaPrueba.get(IDPrueba).toString());
        alert.showAndWait();
        clase = null;
        SeleccionClase.setText("Elemento que desea editar");
        TextoUK.setText("UK");
        EntradaUK.setText("");
        TextoAtributo1.setVisible(false);
        TextoAtributo2.setVisible(false);
        TextoAtributo3.setVisible(false);
        TextoAtributo4.setVisible(false);
        TextoAtributo5.setVisible(false);
        textoaviso.setVisible(false);
        BotAtributo1.setVisible(false);
        BotAtributo2.setVisible(false);
        BotAtributo3.setVisible(false);
        BotAtributo4.setVisible(false);
        BotAtributo5.setVisible(false);
        Atributo1 = false;
        Atributo2 = false;
        Atributo3 = false;
        Atributo4 = false;
        Atributo5 = false;
    }
    public void EditarInforme(){
        boolean Atributo1=BotAtributo1.isSelected();
        boolean Atributo2=BotAtributo2.isSelected();
        boolean Atributo3=BotAtributo3.isSelected();
        boolean Atributo4=BotAtributo4.isSelected();
        boolean Atributo5=BotAtributo5.isSelected();
        boolean Atributo6=BotAtributo6.isSelected();

        if(Atributo1){
            String nuevoNumeroInformeString = EntradaAtributo1.getText();
            int nuevoNumeroInforme;
            try {
                nuevoNumeroInforme = Integer.parseInt(nuevoNumeroInformeString);
                if (nuevoNumeroInforme<0){
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Sistema de gestión de pruebas eléctricas");
                    alert.setHeaderText("Número de informe");
                    alert.setContentText("Por favor ingrese un valor mayor o igual que cero");
                    alert.showAndWait();
                    return;
                }
            }
            catch (Exception e) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Sistema de gestión de pruebas eléctricas");
                alert.setHeaderText("Número de informe");
                alert.setContentText("Por favor ingrese un valor numérico");
                alert.showAndWait();
                return;
            }
            if(Informe.InformesPorNumero.containsKey(nuevoNumeroInforme)){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Sistema de gestión de pruebas eléctricas");
                alert.setHeaderText("Número de informe");
                alert.setContentText("Ya existe un informe identificado con el número "+nuevoNumeroInforme);
                alert.showAndWait();
                return;
            }
            Informe.InformesPorNumero.get(NumeroInforme).NumInforme=nuevoNumeroInforme;
            Informe.InformesPorNumero.put(nuevoNumeroInforme,Informe.InformesPorNumero.get(NumeroInforme));
            Informe.InformesPorNumero.remove(NumeroInforme);
            for(Prueba prueba : Prueba.TablaPrueba.values()){
                if(prueba.NumInforme==NumeroInforme){
                    prueba.NumInforme=nuevoNumeroInforme;
                    break;
                }
            }
            NumeroInforme=nuevoNumeroInforme;
        }
        if(Atributo2){
            String HumedadString = EntradaAtributo2.getText();
            double nuevaHumedad;
            try {
                nuevaHumedad = Double.parseDouble(HumedadString);
                if (nuevaHumedad<0 || nuevaHumedad>100){
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Sistema de gestión de pruebas eléctricas");
                    alert.setHeaderText("Humedad %");
                    alert.setContentText("Por favor ingrese un valor entre 0 y 100");
                    alert.showAndWait();
                    return;
                }
            }
            catch (Exception e) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Sistema de gestión de pruebas eléctricas");
                alert.setHeaderText("Humedad %");
                alert.setContentText("Por favor ingrese un valor numérico");
                alert.showAndWait();
                return;
            }
            Informe.InformesPorNumero.get(NumeroInforme).Humedad=nuevaHumedad;
        }
        if(Atributo3){
            String PresionString = EntradaAtributo3.getText();
            double nuevaPresion;
            try {
                nuevaPresion = Double.parseDouble(PresionString);
            }
            catch (Exception e) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Sistema de gestión de pruebas eléctricas");
                alert.setHeaderText("Presión");
                alert.setContentText("Por favor ingrese un valor numérico de presión");
                alert.showAndWait();
                return;
            }
            Informe.InformesPorNumero.get(NumeroInforme).Presion=nuevaPresion;
        }
        if(Atributo4){
            String TemperaturanString = EntradaAtributo4.getText();
            double nuevaTemperatura;
            double viejaTemperatura = Informe.InformesPorNumero.get(NumeroInforme).Temperatura;
            try {
                nuevaTemperatura = Double.parseDouble(TemperaturanString);
            }
            catch (Exception e) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Sistema de gestión de pruebas eléctricas");
                alert.setHeaderText("Tempertura");
                alert.setContentText("Por favor ingrese un valor numérico de temperatura");
                alert.showAndWait();
                return;
            }
            Informe.InformesPorNumero.get(NumeroInforme).Temperatura=nuevaTemperatura;
            if(Informe.InformesPorTemperatura.containsKey(nuevaTemperatura)){
                HashMap<Integer,Informe> InformesConEstaTemperatura = Informe.InformesPorTemperatura.get(nuevaTemperatura);
                InformesConEstaTemperatura.put(Informe.InformesPorNumero.get(NumeroInforme).NumInforme,Informe.InformesPorNumero.get(NumeroInforme));
                Informe.InformesPorTemperatura.put(nuevaTemperatura,InformesConEstaTemperatura);
            }
            else{
                HashMap<Integer,Informe> nuevoInformeConEstaTemperatura = new HashMap<>();
                nuevoInformeConEstaTemperatura.put(Informe.InformesPorNumero.get(NumeroInforme).NumInforme,Informe.InformesPorNumero.get(NumeroInforme));
                Informe.InformesPorTemperatura.put(nuevaTemperatura,nuevoInformeConEstaTemperatura);
            }
            Informe.InformesPorTemperatura.remove(viejaTemperatura);
        }
        if(Atributo5){
            String nuevoComentario = Comment.getValue();
            String viejoComentario = Informe.InformesPorNumero.get(NumeroInforme).Comentario;
            Informe.InformesPorNumero.get(NumeroInforme).Comentario=nuevoComentario;
            if(Informe.InformesPorComentario.containsKey(nuevoComentario)){
                HashMap<Integer,Informe> InformesConEsteComentario = Informe.InformesPorComentario.get(nuevoComentario);
                InformesConEsteComentario.put(Informe.InformesPorNumero.get(NumeroInforme).NumInforme,Informe.InformesPorNumero.get(NumeroInforme));
                Informe.InformesPorComentario.put(nuevoComentario.toLowerCase(),InformesConEsteComentario);
            }
            else{
                HashMap<Integer,Informe> nuevoInformeConEsteComentario = new HashMap<>();
                nuevoInformeConEsteComentario.put(Informe.InformesPorNumero.get(NumeroInforme).NumInforme,Informe.InformesPorNumero.get(NumeroInforme));
                Informe.InformesPorComentario.put(nuevoComentario.toLowerCase(),nuevoInformeConEsteComentario);
            }
            Informe.InformesPorComentario.remove(viejoComentario);
        }
        if(Atributo6){
            Informe.InformesPorNumero.get(NumeroInforme).Resultado=Paso.isSelected();
        }
        if(!Atributo1 && !Atributo2 && !Atributo3 && !Atributo4 && !Atributo5 && !Atributo6){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sistema de gestión de pruebas eléctricas");
            alert.setHeaderText("Edición de informe");
            alert.setContentText("No ha seleccionado ningún atributo para editar");
            alert.showAndWait();
            return;
        }
        if(Atributo1 || Atributo2 || Atributo3 || Atributo4 || Atributo5 || Atributo6){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sistema de gestión de pruebas eléctricas");
            alert.setHeaderText("Edición de informe");
            alert.setContentText("El informe se editó satisfactoriamente\n"+Informe.InformesPorNumero.get(NumeroInforme));
            alert.showAndWait();
        }
        clase = null;
        SeleccionClase.setText("Elemento que desea editar");
        TextoUK.setText("UK");
        EntradaUK.setText("");
        TextoAtributo1.setText("");
        TextoAtributo2.setText("");
        TextoAtributo3.setText("");
        TextoAtributo4.setText("");
        TextoAtributo5.setText("");
        TextoAtributo6.setText("");
        textoaviso.setVisible(false);
        TextoAtributo1.setVisible(false);
        TextoAtributo2.setVisible(false);
        TextoAtributo3.setVisible(false);
        TextoAtributo4.setVisible(false);
        TextoAtributo5.setVisible(false);
        TextoAtributo6.setVisible(false);
        BotAtributo1.setVisible(false);
        BotAtributo2.setVisible(false);
        BotAtributo3.setVisible(false);
        BotAtributo4.setVisible(false);
        BotAtributo5.setVisible(false);
        BotAtributo6.setVisible(false);
        BotAtributo1.setSelected(false);
        BotAtributo2.setSelected(false);
        BotAtributo3.setSelected(false);
        BotAtributo4.setSelected(false);
        BotAtributo5.setSelected(false);
        BotAtributo6.setSelected(false);
        EntradaAtributo1.setText("");
        EntradaAtributo2.setText("");
        EntradaAtributo3.setText("");
        EntradaAtributo4.setText("");
        EntradaAtributo1.setVisible(false);
        EntradaAtributo2.setVisible(false);
        EntradaAtributo3.setVisible(false);
        EntradaAtributo4.setVisible(false);
        Paso.setVisible(false);
        NoPaso.setVisible(false);
        Comment.getItems().clear();
        salida.getItems().clear();
    }
    public void ApagarBotones(){
        BotAtributo1.setVisible(false);
        BotAtributo2.setVisible(false);
        BotAtributo3.setVisible(false);
        BotAtributo4.setVisible(false);
        BotAtributo5.setVisible(false);
        BotAtributo6.setVisible(false);
        BotAtributo1.setSelected(false);
        BotAtributo2.setSelected(false);
        BotAtributo3.setSelected(false);
        BotAtributo4.setSelected(false);
        BotAtributo5.setSelected(false);
        BotAtributo6.setSelected(false);
        Paso.setVisible(false);
        NoPaso.setVisible(false);
        EntradaAtributo1.setVisible(false);
        EntradaAtributo2.setVisible(false);
        EntradaAtributo3.setVisible(false);
        EntradaAtributo4.setVisible(false);
        ListaAtributo3.setVisible(false);
        ListaAtributo4.setVisible(false);
        ListaAtributo5.setVisible(false);
        Comment.setVisible(false);
    }
}
