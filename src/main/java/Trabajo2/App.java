package Trabajo2;

import Trabajo2.Clases.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleGraph;

import java.io.IOException;
import java.util.LinkedList;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("InicioSesion"), 600, 400);
        stage.setScene(scene);
        stage.show();
    }

    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static Graph<Object, DefaultEdge> sistemaPruebasElectricas = new SimpleGraph<>(DefaultEdge.class);
    public static int IDTipoPrueba = 1;
    public static int IDPrueba = 1;


    public static void main(String[] args) {
        Usuario Mateo = new Usuario(1017270479, "jhmgarzonre@unal.edu.co", "Mateo", "Garzon Reyes", "12345");
        Usuario JuanLuis = new Usuario(1152465710, "jlhenaoj@unal.edu.co", "Juan Luis", "Henao Jiménez", "asdfg");
        Usuario David = new Usuario(1037661668, "damunozmo@unal.edu.co", "David", "Muñoz Molina", "qwert");
        Usuario.TablaUsuarioCedula.put(Mateo.Documento,Mateo);
        Usuario.TablaUsuarioCedula.put(JuanLuis.Documento,JuanLuis);
        Usuario.TablaUsuarioCedula.put(David.Documento,David);
        Usuario.TablaUsuarioCorreo.put(Mateo.Correo,Mateo);
        Usuario.TablaUsuarioCorreo.put(JuanLuis.Correo,JuanLuis);
        Usuario.TablaUsuarioCorreo.put(David.Correo,David);
        Laboratorio Lab1 = new Laboratorio(100200300,"Laboratorio alto voltaje","Medellin");
        Laboratorio Lab2 = new Laboratorio(100200400,"Laboratorio maquinas","Bogota");
        sistemaPruebasElectricas.addVertex(Laboratorio.TablaLaboratorio.get(Lab1.NIT));
        sistemaPruebasElectricas.addVertex(Laboratorio.TablaLaboratorio.get(Lab2.NIT));
        Norma norma1 = new Norma("Pruebas alto voltaje","ANSI 900");
        Norma norma2 = new Norma("Pruebas magnetismo","ASTM 800");
        sistemaPruebasElectricas.addVertex(Norma.TablaNorma.get(norma1.Referencia));
        sistemaPruebasElectricas.addVertex(Norma.TablaNorma.get(norma2.Referencia));
        TipoPrueba TipoPrueba1 = new TipoPrueba(IDTipoPrueba,"Alto Voltaje", norma1.Referencia, Lab1.NIT);
        IDTipoPrueba++;
        TipoPrueba.TablaTipoPrueba.put(TipoPrueba1.ID,TipoPrueba1);
        TipoPrueba.ArbolTipoPruebaNombre.put(TipoPrueba1.Nombre.toLowerCase(),new LinkedList<>());
        TipoPrueba.ArbolTipoPruebaNombre.get(TipoPrueba1.Nombre.toLowerCase()).add(TipoPrueba1);
        TipoPrueba.ArbolTipoPruebaRef.put(TipoPrueba1.RefNorma.toLowerCase(),new LinkedList<>());
        TipoPrueba.ArbolTipoPruebaRef.get(TipoPrueba1.RefNorma.toLowerCase()).add(TipoPrueba1);
        TipoPrueba.ArbolTipoPruebaNit.put(TipoPrueba1.NitLaboratorio,new LinkedList<>());
        TipoPrueba.ArbolTipoPruebaNit.get(TipoPrueba1.NitLaboratorio).add(TipoPrueba1);
        sistemaPruebasElectricas.addVertex(TipoPrueba1);
        sistemaPruebasElectricas.addEdge(TipoPrueba1,norma1);
        sistemaPruebasElectricas.addEdge(TipoPrueba1,Lab1);
        TipoPrueba TipoPrueba2 = new TipoPrueba(IDTipoPrueba,"Alta Corriente", norma2.Referencia, Lab2.NIT);
        IDTipoPrueba++;
        TipoPrueba.TablaTipoPrueba.put(TipoPrueba2.ID,TipoPrueba2);
        TipoPrueba.ArbolTipoPruebaNombre.put(TipoPrueba2.Nombre.toLowerCase(),new LinkedList<>());
        TipoPrueba.ArbolTipoPruebaNombre.get(TipoPrueba2.Nombre.toLowerCase()).add(TipoPrueba1);
        TipoPrueba.ArbolTipoPruebaRef.put(TipoPrueba2.RefNorma.toLowerCase(),new LinkedList<>());
        TipoPrueba.ArbolTipoPruebaRef.get(TipoPrueba2.RefNorma.toLowerCase()).add(TipoPrueba1);
        TipoPrueba.ArbolTipoPruebaNit.put(TipoPrueba2.NitLaboratorio,new LinkedList<>());
        TipoPrueba.ArbolTipoPruebaNit.get(TipoPrueba2.NitLaboratorio).add(TipoPrueba1);
        sistemaPruebasElectricas.addVertex(TipoPrueba2);
        sistemaPruebasElectricas.addEdge(TipoPrueba2,norma2);
        sistemaPruebasElectricas.addEdge(TipoPrueba2,Lab2);
        Clase Clase1 = new Clase("Aislamiento 1",norma1.Referencia,14000,1200,16000,1300,60);
        Clase Clase2 = new Clase("Conductividad 5",norma2.Referencia,220,700,230,900,60);
        Clase.TablaClase.put(Clase1.Nombre,Clase1);
        Clase.TablaClase.put(Clase2.Nombre,Clase2);
        sistemaPruebasElectricas.addVertex(Clase1);
        sistemaPruebasElectricas.addVertex(Clase2);
        sistemaPruebasElectricas.addEdge(Clase1,norma1);
        sistemaPruebasElectricas.addEdge(Clase2,norma2);
        Dispositivo dispositivo1 = new Dispositivo("T-100","Transformador",30000,13800);
        Dispositivo dispositivo2 = new Dispositivo("M-700","Multimetro",1,600);
        sistemaPruebasElectricas.addVertex(dispositivo1);
        sistemaPruebasElectricas.addVertex(dispositivo2);
        Prueba prueba1 = new Prueba(IDPrueba,"Prueba de Aislamiento",TipoPrueba1.ID,Clase1.Nombre,dispositivo1.Refetencia);
        IDPrueba++;
        Prueba.TablaPrueba.put(prueba1.ID,prueba1);
        sistemaPruebasElectricas.addVertex(prueba1);
        sistemaPruebasElectricas.addEdge(prueba1,dispositivo1);
        sistemaPruebasElectricas.addEdge(prueba1,dispositivo2);
        sistemaPruebasElectricas.addEdge(prueba1,TipoPrueba1);
        Prueba prueba2 = new Prueba(IDPrueba,"Prueba de Conductividad",TipoPrueba2.ID,Clase2.Nombre, dispositivo2.Refetencia);
        IDPrueba++;
        Prueba.TablaPrueba.put(prueba2.ID,prueba2);
        sistemaPruebasElectricas.addVertex(prueba2);
        sistemaPruebasElectricas.addEdge(prueba2,dispositivo1);
        sistemaPruebasElectricas.addEdge(prueba2,dispositivo2);
        sistemaPruebasElectricas.addEdge(prueba2,TipoPrueba1);
        launch();
    }

}