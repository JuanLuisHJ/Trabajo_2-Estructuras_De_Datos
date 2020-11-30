package Trabajo2;

import Trabajo2.Clases.Informe;
import Trabajo2.Clases.Prueba;
import Trabajo2.Clases.TipoPrueba;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.text.Text;

import java.io.IOException;

public class MenuBusquedaControlador {
    public String clase = null;
    public String tatributoTipoPrueba = null;
    public String tatributoPrueba = null;
    public String BusquedaPor;
    @FXML
    public Label TextoAtributo;
    @FXML
    public TextField EntradaAtributo;
    @FXML
    public SplitMenuButton SeleccionClase;
    @FXML
    public SplitMenuButton AtributoTipoPrueba;
    @FXML
    public SplitMenuButton AtributoInforme;
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
    public SplitMenuButton AtributoPrueba;
    @FXML
    public MenuItem SeleccionPrueba;
    @FXML
    public MenuItem SeleccionIDP;
    @FXML
    public MenuItem SeleccionNombreP;
    @FXML
    public MenuItem SeleccionClaseP;
    @FXML
    public MenuItem SeleccionTP;
    @FXML
    public MenuItem SeleccionDISPO;
    @FXML
    public MenuItem NUMINFO;
    @FXML
    public MenuItem COMNT;
    @FXML
    public MenuItem TMPRTR;
    @FXML
    public ChoiceBox<String> comentarios;
    @FXML
    public Label UK;
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
        tatributoTipoPrueba = "ID";
    }
    @FXML
    private void SeleccionAtributoTipoPruebaNombre(ActionEvent event){
        AtributoTipoPrueba.setText("Nombre");
        TextoAtributo.setText("Nombre");
        TextoAtributo.setVisible(true);
        EntradaAtributo.setVisible(true);
        tatributoTipoPrueba = "Nombre";
    }
    @FXML
    private void SeleccionAtributoTipoPruebaRef(ActionEvent event){
        AtributoTipoPrueba.setText("Referencia de norma");
        TextoAtributo.setText("Referencia de norma");
        TextoAtributo.setVisible(true);
        EntradaAtributo.setVisible(true);
        tatributoTipoPrueba = "Ref";
    }
    @FXML
    private void SeleccionAtributoTipoPruebaNit(ActionEvent event){
        AtributoTipoPrueba.setText("Nit del laboratorio");
        TextoAtributo.setText("Nit del laboratorio");
        TextoAtributo.setVisible(true);
        EntradaAtributo.setVisible(true);
        tatributoTipoPrueba = "NIT";
    }
    @FXML
    private void SeleccionPrueba(ActionEvent event) {
        AtributoPrueba.setVisible(true);
        SeleccionClase.setText("Prueba");
        clase = "Prueba";
    }
    @FXML
    private void SeleccionAtributoPruebaID(ActionEvent event){
        AtributoPrueba.setText("ID");
        TextoAtributo.setText("ID");
        TextoAtributo.setVisible(true);
        EntradaAtributo.setVisible(true);
        tatributoPrueba = "ID";
    }
    @FXML
    private void SeleccionAtributoPruebaNombre(ActionEvent event){
        AtributoPrueba.setText("Nombre");
        TextoAtributo.setText("Nombre");
        TextoAtributo.setVisible(true);
        EntradaAtributo.setVisible(true);
        tatributoPrueba = "Nombre";
    }
    @FXML
    private void SeleccionAtributoPruebaClase(ActionEvent event){
        AtributoPrueba.setText("Nombre de la clase");
        TextoAtributo.setText("Nombre de la clase");
        TextoAtributo.setVisible(true);
        EntradaAtributo.setVisible(true);
        tatributoPrueba = "Clase";
    }
    @FXML
    private void SeleccionAtributoPruebaTP(ActionEvent event){
        AtributoPrueba.setText("ID del Tipo de prueba");
        TextoAtributo.setText("ID del Tipo de prueba");
        TextoAtributo.setVisible(true);
        EntradaAtributo.setVisible(true);
        tatributoPrueba = "NIT";
    }
    @FXML
    private void SeleccionAtributoPruebaDISPO(ActionEvent event){
        AtributoPrueba.setText("Referencia del dispositivo usado");
        TextoAtributo.setText("Referencia del dispositivo usado");
        TextoAtributo.setVisible(true);
        EntradaAtributo.setVisible(true);
        tatributoPrueba = "Dispositivo";
    }
    @FXML
    private void SeleccionInforme(ActionEvent event){
        AtributoInforme.setVisible(true);
        SeleccionClase.setText("Informe");
        clase = "Informe";
    }
    @FXML
    private void SeleccionAtributoNumeroInforme(ActionEvent event){
        AtributoInforme.setText("Número de informe");
        TextoAtributo.setVisible(true);
        TextoAtributo.setText("Número de informe");
        EntradaAtributo.setVisible(true);
        BusquedaPor = "NumeroDeInforme";
        UK.setVisible(true);
        clase = "Informe";
    }
    @FXML
    private void SeleccionAtributoComentario(ActionEvent event){
        AtributoInforme.setText("Comentario");
        TextoAtributo.setVisible(true);
        TextoAtributo.setText("Comentario");
        for(String com : Informe.Comentarios){
            comentarios.getItems().add(com);
        }
        comentarios.setVisible(true);
        BusquedaPor = "Comentario";
        clase = "Informe";
    }
    @FXML
    private void SeleccionAtributoTemperatura(ActionEvent event){
        AtributoInforme.setText("Temperatura");
        TextoAtributo.setVisible(true);
        TextoAtributo.setText("Temperatura");
        EntradaAtributo.setVisible(true);
        BusquedaPor = "Temperatura";
    }
    @FXML
    private void Buscar(ActionEvent event){
        if(clase == null){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sistema de gestion de pruebas electricas");
            alert.setHeaderText("Búsqueda");
            alert.setContentText("Por favor seleccione un elemento");
            alert.showAndWait();
        }
        if(tatributoTipoPrueba == null){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sistema de gestion de pruebas electricas");
            alert.setHeaderText("Busqueda");
            alert.setContentText("Por favor seleccione un atributo");
            alert.showAndWait();
        }
        else if (clase.equals("TipoPrueba")){
            BuscarTipoPrueba();
        }
        else if (clase.equals("Prueba")) {
            BuscarPrueba();
        }
        else if(!BusquedaPor.equals("")){
            BuscarInforme();
        }
    }

    public void BuscarTipoPrueba(){
        salida.getItems().clear();
        if (tatributoTipoPrueba.equals("ID")){
            salida.getItems().clear();
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
            tatributoTipoPrueba = null;
            TextoAtributo.setVisible(false);
            EntradaAtributo.setVisible(false);
            AtributoTipoPrueba.setVisible(false);

        }else if (tatributoTipoPrueba.equals("Nombre")){
            salida.getItems().clear();
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
            tatributoTipoPrueba = null;
            TextoAtributo.setVisible(false);
            EntradaAtributo.setVisible(false);
            AtributoTipoPrueba.setVisible(false);

        }else if (tatributoTipoPrueba.equals("Ref")){
            salida.getItems().clear();
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
            tatributoTipoPrueba = null;
            TextoAtributo.setVisible(false);
            EntradaAtributo.setVisible(false);
            AtributoTipoPrueba.setVisible(false);

        }else if(tatributoTipoPrueba.equals("NIT")){
            salida.getItems().clear();
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
            tatributoTipoPrueba = null;
            TextoAtributo.setVisible(false);
            EntradaAtributo.setVisible(false);
            AtributoTipoPrueba.setVisible(false);
        }
    }

    public void BuscarPrueba(){
        if (tatributoPrueba.equals("ID")){
            String id = EntradaAtributo.getText().trim();
            int ID = -1;
            if (id.equals("")){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Sistema de gestion de pruebas electricas");
                alert.setHeaderText("Busqueda");
                alert.setContentText("Por favor ingrese el ID de la prueba");
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
                alert.setContentText("El ID para prueba debe ser un numero mayor a 0");
                alert.showAndWait();
                EntradaAtributo.setText("");
                return;
            }
            if (ID<=0){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Sistema de gestion de pruebas electricas");
                alert.setHeaderText("Busqueda");
                alert.setContentText("El ID para prueba debe ser un numero mayor a 0");
                alert.showAndWait();
                EntradaAtributo.setText("");
                return;
            }
            if (!Prueba.TablaPrueba.containsKey(ID)){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Sistema de gestion de pruebas electricas");
                alert.setHeaderText("Busqueda");
                alert.setContentText("El ID de la prueba no se encuentra en la base de datos");
                alert.showAndWait();
                EntradaAtributo.setText("");
                return;
            }
            salida.getItems().add(Prueba.TablaPrueba.get(ID));
            EntradaAtributo.setText("");
            SeleccionClase.setText("Elemento que desea buscar");
            AtributoPrueba.setText("Seleccione el atributo");
            clase = null;
            tatributoPrueba = null;
            TextoAtributo.setVisible(false);
            EntradaAtributo.setVisible(false);
            AtributoPrueba.setVisible(false);

        }else if (tatributoPrueba.equals("Nombre")){
            String Nombre = EntradaAtributo.getText().toLowerCase();
            if (Nombre.equals("")){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Sistema de gestion de pruebas electricas");
                alert.setHeaderText("Busqueda");
                alert.setContentText("Por favor ingrese el nombre de la prueba");
                alert.showAndWait();
                EntradaAtributo.setText("");
                return;
            }
            if (!Prueba.ArbolPruebaNombre.containsKey(Nombre)){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Sistema de gestion de pruebas electricas");
                alert.setHeaderText("Busqueda");
                alert.setContentText("El nombre de la prueba no se encuentra en la base de datos");
                alert.showAndWait();
                EntradaAtributo.setText("");
                return;
            }
            for (Prueba prueba:Prueba.ArbolPruebaNombre.get(Nombre)){
                salida.getItems().add(prueba);
            }
            EntradaAtributo.setText("");
            SeleccionClase.setText("Elemento que desea buscar");
            AtributoPrueba.setText("Seleccione el atributo");
            clase = null;
            tatributoPrueba = null;
            TextoAtributo.setVisible(false);
            EntradaAtributo.setVisible(false);
            AtributoPrueba.setVisible(false);

        }else if (tatributoPrueba.equals("Clase")){
            String Referencia = EntradaAtributo.getText().toLowerCase();
            if (Referencia.equals("")){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Sistema de gestion de pruebas electricas");
                alert.setHeaderText("Busqueda");
                alert.setContentText("Por favor ingrese el nombre de la clase asociada a la prueba");
                alert.showAndWait();
                EntradaAtributo.setText("");
                return;
            }
            if (!Prueba.ArbolPruebaClase.containsKey(Referencia)){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Sistema de gestion de pruebas electricas");
                alert.setHeaderText("Busqueda");
                alert.setContentText("La clase no tiene pruebas asociadas");
                alert.showAndWait();
                EntradaAtributo.setText("");
                return;
            }
            for (Prueba prueba:Prueba.ArbolPruebaClase.get(Referencia)){
                salida.getItems().add(prueba);
            }
            EntradaAtributo.setText("");
            SeleccionClase.setText("Elemento que desea buscar");
            AtributoPrueba.setText("Seleccione el atributo");
            clase = null;
            tatributoPrueba = null;
            TextoAtributo.setVisible(false);
            EntradaAtributo.setVisible(false);
            AtributoPrueba.setVisible(false);

        }else if(tatributoPrueba.equals("NIT")){
            String nit = EntradaAtributo.getText().trim();
            int NIT = -1;
            if (nit.equals("")){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Sistema de gestion de pruebas electricas");
                alert.setHeaderText("Busqueda");
                alert.setContentText("Por favor ingrese el ID del Tipo de prueba correspondiente a la prueba");
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
                alert.setContentText("El ID del Tipo de prueba debe ser un numero mayor a 0");
                alert.showAndWait();
                EntradaAtributo.setText("");
                return;
            }
            if (NIT<=0){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Sistema de gestion de pruebas electricas");
                alert.setHeaderText("Busqueda");
                alert.setContentText("El ID del Tipo de prueba debe un numero mayor a 0");
                alert.showAndWait();
                EntradaAtributo.setText("");
                return;
            }
            if (!Prueba.ArbolPruebaTP.containsKey(NIT)){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Sistema de gestion de pruebas electricas");
                alert.setHeaderText("Busqueda");
                alert.setContentText("El ID del Tipo de prueba no tiene pruebas asociadas");
                alert.showAndWait();
                EntradaAtributo.setText("");
                return;
            }
            for (Prueba prueba:Prueba.ArbolPruebaTP.get(NIT)){
                salida.getItems().add(prueba);
            }
            EntradaAtributo.setText("");
            SeleccionClase.setText("Elemento que desea buscar");
            AtributoPrueba.setText("Seleccione el atributo");
            clase = null;
            tatributoPrueba = null;
            TextoAtributo.setVisible(false);
            EntradaAtributo.setVisible(false);
            AtributoPrueba.setVisible(false);
        } else if (tatributoPrueba.equals("Dispositivo")){
            String Referencia = EntradaAtributo.getText().toLowerCase();
            if (Referencia.equals("")){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Sistema de gestion de pruebas electricas");
                alert.setHeaderText("Busqueda");
                alert.setContentText("Por favor ingrese la referencia del dispositivo usado en la prueba");
                alert.showAndWait();
                EntradaAtributo.setText("");
                return;
            }
            if (!Prueba.ArbolPruebaDispo.containsKey(Referencia)){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Sistema de gestion de pruebas electricas");
                alert.setHeaderText("Busqueda");
                alert.setContentText("El dispositivo no tiene pruebas asociadas");
                alert.showAndWait();
                EntradaAtributo.setText("");
                return;
            }
            for (Prueba prueba:Prueba.ArbolPruebaDispo.get(Referencia)){
                salida.getItems().add(prueba);
            }
            EntradaAtributo.setText("");
            SeleccionClase.setText("Elemento que desea buscar");
            AtributoPrueba.setText("Seleccione el atributo");
            clase = null;
            tatributoPrueba = null;
            TextoAtributo.setVisible(false);
            EntradaAtributo.setVisible(false);
            AtributoPrueba.setVisible(false);
        }
    }

    public void BuscarInforme(){
        salida.getItems().clear();
        if(BusquedaPor.equals("NumeroDeInforme")){
            if (Informe.InformesPorNumero.isEmpty()){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Sistema de gestión de pruebas eléctricas");
                alert.setHeaderText("Buscar");
                alert.setContentText("No hay informes registrados en el sistema todavía");
                alert.showAndWait();
                return;
            }
            String numeroInformeString = EntradaAtributo.getText();
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
                alert.setTitle("Sistema de gestión de pruebas eléctricas");
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
                EntradaAtributo.setText("");
            }
            else{
                salida.getItems().add(Informe.InformesPorNumero.get(numeroInforme));
                EntradaAtributo.setText("");
                TextoAtributo.setVisible(false);
                EntradaAtributo.setVisible(false);
                UK.setVisible(false);
                BusquedaPor = "";
                clase = null;
            }
        }
        else if(BusquedaPor.equals("Comentario")){
            salida.getItems().clear();
            if (Informe.InformesPorComentario.isEmpty()){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Sistema de gestión de pruebas eléctricas");
                alert.setHeaderText("Buscar");
                alert.setContentText("No hay informes registrados en el sistema todavía");
                alert.showAndWait();
                return;
            }
            String comentario = comentarios.getValue().toLowerCase();
            if(Informe.InformesPorComentario.containsKey(comentario)){
                for(Integer numInfo : Informe.InformesPorComentario.get(comentario).keySet()){
                    salida.getItems().add(Informe.InformesPorComentario.get(comentario).get(numInfo));
                }
            }
            else{
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Sistema de gestion de pruebas electricas");
                alert.setHeaderText("Temperatura");
                alert.setContentText("No se encuentran informes registrados con este comentario "+comentario);
                alert.showAndWait();
                return;
            }
            TextoAtributo.setVisible(false);
            TextoAtributo.setText("");
            BusquedaPor = "";
            comentarios.setVisible(false);
            clase = null;
        }
        else if(BusquedaPor.equals("Temperatura")){
            if (Informe.InformesPorTemperatura.isEmpty()){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Sistema de gestión de pruebas eléctricas");
                alert.setHeaderText("Buscar");
                alert.setContentText("No hay informes registrados en el sistema todavía");
                alert.showAndWait();
                return;
            }
            String TemperaturaString = EntradaAtributo.getText();
            double temperatura;
            try{
                temperatura = Integer.parseInt(TemperaturaString);
            }
            catch(Exception e){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Sistema de gestion de pruebas electricas");
                alert.setHeaderText("Temperatura");
                alert.setContentText("Por favor ingrese un valor numérico de temperatura");
                alert.showAndWait();
                return;
            }
            if(Informe.InformesPorTemperatura.containsKey(temperatura)){
                for(Integer numInfo : Informe.InformesPorTemperatura.get(temperatura).keySet()){
                    salida.getItems().add(Informe.InformesPorComentario.get(temperatura).get(numInfo));
                }
            }
            else{
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Sistema de gestion de pruebas electricas");
                alert.setHeaderText("Temperatura");
                alert.setContentText("No se encuentran informes registrados con esta temperatura "+temperatura);
                alert.showAndWait();
                return;
            }
            TextoAtributo.setVisible(false);
            EntradaAtributo.setVisible(false);
            TextoAtributo.setText("");
            BusquedaPor = "";
            clase = null;
        }
    }
}
