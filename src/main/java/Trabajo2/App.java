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
import java.util.HashMap;
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
        Laboratorio Lab1 = new Laboratorio(100200300,"Laboratorio alto voltaje","Medellín");
        Laboratorio Lab2 = new Laboratorio(100200400,"Laboratorio maquinas","Bogotá");
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
        TipoPrueba.ArbolTipoPruebaNombre.get(TipoPrueba2.Nombre.toLowerCase()).add(TipoPrueba2);
        TipoPrueba.ArbolTipoPruebaRef.put(TipoPrueba2.RefNorma.toLowerCase(),new LinkedList<>());
        TipoPrueba.ArbolTipoPruebaRef.get(TipoPrueba2.RefNorma.toLowerCase()).add(TipoPrueba2);
        TipoPrueba.ArbolTipoPruebaNit.put(TipoPrueba2.NitLaboratorio,new LinkedList<>());
        TipoPrueba.ArbolTipoPruebaNit.get(TipoPrueba2.NitLaboratorio).add(TipoPrueba2);
        sistemaPruebasElectricas.addVertex(TipoPrueba2);
        sistemaPruebasElectricas.addEdge(TipoPrueba2,norma2);
        sistemaPruebasElectricas.addEdge(TipoPrueba2,Lab2);
        TipoPrueba TipoPrueba3 = new TipoPrueba(IDTipoPrueba,"Prueba de vacio", norma2.Referencia, Lab2.NIT);
        IDTipoPrueba++;
        TipoPrueba.TablaTipoPrueba.put(TipoPrueba3.ID,TipoPrueba3);
        TipoPrueba.ArbolTipoPruebaNombre.put(TipoPrueba3.Nombre.toLowerCase(),new LinkedList<>());
        TipoPrueba.ArbolTipoPruebaNombre.get(TipoPrueba3.Nombre.toLowerCase()).add(TipoPrueba3);
        TipoPrueba.ArbolTipoPruebaRef.put(TipoPrueba3.RefNorma.toLowerCase(),new LinkedList<>());
        TipoPrueba.ArbolTipoPruebaRef.get(TipoPrueba3.RefNorma.toLowerCase()).add(TipoPrueba3);
        TipoPrueba.ArbolTipoPruebaNit.put(TipoPrueba3.NitLaboratorio,new LinkedList<>());
        TipoPrueba.ArbolTipoPruebaNit.get(TipoPrueba3.NitLaboratorio).add(TipoPrueba3);
        sistemaPruebasElectricas.addVertex(TipoPrueba3);
        sistemaPruebasElectricas.addEdge(TipoPrueba3,norma2);
        sistemaPruebasElectricas.addEdge(TipoPrueba3,Lab2);
        Clase Clase1 = new Clase("Aislamiento 1",norma1.Referencia,14000,1200,16000,1300,60);
        Clase Clase2 = new Clase("Conductividad 5",norma2.Referencia,220,700,230,900,60);
        Clase.TablaClase.put(Clase1.Nombre,Clase1);
        Clase.TablaClase.put(Clase2.Nombre,Clase2);
        sistemaPruebasElectricas.addVertex(Clase1);
        sistemaPruebasElectricas.addVertex(Clase2);
        sistemaPruebasElectricas.addEdge(Clase1,norma1);
        sistemaPruebasElectricas.addEdge(Clase2,norma2);
        Dispositivo dispositivo1 = new Dispositivo("T-100","Transformador",30000,13800);
        Dispositivo dispositivo2 = new Dispositivo("M-700","Multímetro",1,600);
        sistemaPruebasElectricas.addVertex(dispositivo1);
        sistemaPruebasElectricas.addVertex(dispositivo2);
        Prueba prueba1 = new Prueba(IDPrueba,"Prueba de Aislamiento",TipoPrueba1.ID,Clase1.Nombre,dispositivo1.Refetencia);
        IDPrueba++;
        Prueba.TablaPrueba.put(prueba1.ID,prueba1);
        Prueba.ArbolPruebaNombre.put(prueba1.Nombre.toLowerCase(), new LinkedList<>());
        Prueba.ArbolPruebaNombre.get(prueba1.Nombre.toLowerCase()).add(prueba1);
        Prueba.ArbolPruebaClase.put(prueba1.Clase.toLowerCase(), new LinkedList<>());
        Prueba.ArbolPruebaClase.get(prueba1.Clase.toLowerCase()).add(prueba1);
        Prueba.ArbolPruebaTP.put(prueba1.TipoPrueba, new LinkedList<>());
        Prueba.ArbolPruebaTP.get(prueba1.TipoPrueba).add(prueba1);
        Prueba.ArbolPruebaDispo.put(prueba1.Dispositivo.toLowerCase(), new LinkedList<>());
        Prueba.ArbolPruebaDispo.get(prueba1.Dispositivo.toLowerCase()).add(prueba1);
        sistemaPruebasElectricas.addVertex(prueba1);
        sistemaPruebasElectricas.addEdge(prueba1,dispositivo1);
        sistemaPruebasElectricas.addEdge(prueba1,dispositivo2);
        sistemaPruebasElectricas.addEdge(prueba1,TipoPrueba1);
        
        Prueba prueba2 = new Prueba(IDPrueba,"Prueba de Conductividad",TipoPrueba2.ID,Clase2.Nombre, dispositivo2.Refetencia);
        IDPrueba++;
        Prueba.TablaPrueba.put(prueba2.ID,prueba2);
        Prueba.ArbolPruebaNombre.put(prueba2.Nombre.toLowerCase(), new LinkedList<>());
        Prueba.ArbolPruebaNombre.get(prueba2.Nombre.toLowerCase()).add(prueba2);
        Prueba.ArbolPruebaClase.put(prueba2.Clase.toLowerCase(), new LinkedList<>());
        Prueba.ArbolPruebaClase.get(prueba2.Clase.toLowerCase()).add(prueba2);
        Prueba.ArbolPruebaTP.put(prueba2.TipoPrueba, new LinkedList<>());
        Prueba.ArbolPruebaTP.get(prueba2.TipoPrueba).add(prueba2);
        Prueba.ArbolPruebaDispo.put(prueba2.Dispositivo.toLowerCase(), new LinkedList<>());
        Prueba.ArbolPruebaDispo.get(prueba2.Dispositivo.toLowerCase()).add(prueba2);
        sistemaPruebasElectricas.addVertex(prueba2);
        sistemaPruebasElectricas.addEdge(prueba2,dispositivo1);
        sistemaPruebasElectricas.addEdge(prueba2,dispositivo2);
        sistemaPruebasElectricas.addEdge(prueba2,TipoPrueba1);
        Prueba prueba3 = new Prueba(IDPrueba,"Prueba de Corto",TipoPrueba2.ID,Clase2.Nombre,dispositivo2.Refetencia);
        IDPrueba++;
        Prueba.TablaPrueba.put(prueba3.ID,prueba3);
        Prueba.ArbolPruebaNombre.put(prueba3.Nombre.toLowerCase(), new LinkedList<>());
        Prueba.ArbolPruebaNombre.get(prueba3.Nombre.toLowerCase()).add(prueba3);
        Prueba.ArbolPruebaClase.put(prueba3.Clase.toLowerCase(), new LinkedList<>());
        Prueba.ArbolPruebaClase.get(prueba3.Clase.toLowerCase()).add(prueba3);
        Prueba.ArbolPruebaTP.put(prueba3.TipoPrueba, new LinkedList<>());
        Prueba.ArbolPruebaTP.get(prueba3.TipoPrueba).add(prueba3);
        Prueba.ArbolPruebaDispo.put(prueba3.Dispositivo.toLowerCase(), new LinkedList<>());
        Prueba.ArbolPruebaDispo.get(prueba3.Dispositivo.toLowerCase()).add(prueba3);
        sistemaPruebasElectricas.addVertex(prueba3);
        sistemaPruebasElectricas.addEdge(prueba3,dispositivo1);
        sistemaPruebasElectricas.addEdge(prueba3,dispositivo2);
        sistemaPruebasElectricas.addEdge(prueba3,TipoPrueba1);

        Informe informe1 = new Informe(10,true,"Aislamiento sólido",34.5,67,637);
        prueba1.NumInforme= informe1.NumInforme;
        sistemaPruebasElectricas.addVertex(informe1);
        sistemaPruebasElectricas.addEdge(informe1,prueba1);
        Informe.InformesPorNumero.put(informe1.NumInforme,informe1);
        HashMap<Integer,Informe> infoPorComent = new HashMap<>();
        infoPorComent.put(informe1.NumInforme,informe1);
        Informe.InformesPorComentario.put(informe1.Comentario.toLowerCase(),infoPorComent);
        Informe.InformesPorNumero.put(informe1.NumInforme,informe1);
        HashMap<Integer,Informe> infoPorTemp = new HashMap<>();
        infoPorTemp.put(informe1.NumInforme,informe1);
        Informe.InformesPorTemperatura.put(informe1.Temperatura,infoPorTemp);

        Informe informe2 = new Informe(20,false,"Disrupción",34.5,55,677);
        prueba2.NumInforme= informe2.NumInforme;
        sistemaPruebasElectricas.addVertex(informe2);
        sistemaPruebasElectricas.addEdge(informe2,prueba2);
        Informe.InformesPorNumero.put(informe2.NumInforme,informe2);
        HashMap<Integer,Informe> infoPorComent2 = new HashMap<>();
        infoPorComent.put(informe2.NumInforme,informe2);
        Informe.InformesPorComentario.put(informe2.Comentario.toLowerCase(),infoPorComent2);
        HashMap<Integer,Informe> infoPorTemp2 = new HashMap<>();
        infoPorTemp2.put(informe2.NumInforme,informe2);
        Informe.InformesPorTemperatura.put(informe2.Temperatura,infoPorTemp2);

        Informe informe3 = new Informe(30,true,"Prueba superada",24.5,77,621);
        prueba3.NumInforme= informe3.NumInforme;
        sistemaPruebasElectricas.addVertex(informe3);
        sistemaPruebasElectricas.addEdge(informe3,prueba3);
        Informe.InformesPorNumero.put(informe3.NumInforme,informe3);
        HashMap<Integer,Informe> infoPorComent3 = new HashMap<>();
        infoPorComent.put(informe3.NumInforme,informe3);
        Informe.InformesPorComentario.put(informe3.Comentario.toLowerCase(),infoPorComent3);
        HashMap<Integer,Informe> infoPorTemp3 = new HashMap<>();
        infoPorTemp2.put(informe3.NumInforme,informe3);
        Informe.InformesPorTemperatura.put(informe3.Temperatura,infoPorTemp3);

        launch();
    }
}