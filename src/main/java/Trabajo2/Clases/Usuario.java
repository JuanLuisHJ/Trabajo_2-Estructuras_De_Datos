package Trabajo2.Clases;

import java.util.Hashtable;

public class Usuario {
    public static Hashtable<Integer,Usuario> TablaUsuarioCedula = new Hashtable<>();
    public static Hashtable<String,Usuario> TablaUsuarioCorreo = new Hashtable<>();
    public int Documento;
    public String Correo;
    public String Nombre;
    public String Apellido;
    public String Contraseña;


    public Usuario(int Documento, String Correo, String Nombre, String Apellido, String Contraseña) {
        this.Documento = Documento;
        this.Correo = Correo;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Contraseña = Contraseña;
    }

    @Override
    public String toString() {
        String print = "---------------------------------------------";
        print += "Usuario:    " + "\n";
        print += "Documento:  " + Documento + "." + "\n";
        print += "Nombre:     " + Nombre + "." + "\n";
        print += "Apellido:   " + Apellido + "." + "\n";
        print += "Contraseña: " + Contraseña + "." + "\n";
        print += "---------------------------------------------";
        return print;
    }
}