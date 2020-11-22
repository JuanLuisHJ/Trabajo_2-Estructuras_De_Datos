package Trabajo2.Clases;

import java.util.ArrayList;
import java.util.List;

public class Prueba {
    public String ID;
    public String Nombre;
    public String TipoPrueba;
    public int NumInforme;
    public String Clase;

    public Prueba(String ID,String nombre, String tipoprueba, String clase,ArrayList<String> refDispositivos) {
        this.ID = ID;
        Nombre = nombre;
        TipoPrueba = tipoprueba;
        NumInforme = -1;
        Clase = clase;
    }

    @Override
    public String toString() {
        String print = "---------------------------------------------";
        print += "Prueba:                      " + "\n";
        print += "ID:                          " + ID + "." + "\n";
        print += "Nombre:                      " + Nombre + "." + "\n";
        print += "Tipo de prueba:              " + TipoPrueba + "." + "\n";
        print += "Número de informe:           " + NumInforme + "." + "\n";
        print += "Clase:                       " + Clase + "." + "\n";
        print += "---------------------------------------------";
        return print;
    }
}
