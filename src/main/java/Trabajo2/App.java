package Trabajo2;

import Trabajo2.Clases.Usuario;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

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
        launch();
    }

}