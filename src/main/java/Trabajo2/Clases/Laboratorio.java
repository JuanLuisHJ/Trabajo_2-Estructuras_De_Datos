package Trabajo2.Clases;

import java.util.ArrayList;
import java.util.List;

public class Laboratorio {
    public int NIT;
    public String Nombre;
    public String Direccion;
    public int IDprueba;

    public Laboratorio(int NIT, String nombre, String direccion) {
        this.NIT = NIT;
        Nombre = nombre;
        Direccion = direccion;
        IDprueba = 1;
    }

    @Override
    public String toString() {
        String print = "---------------------------------------------";
        print += "Laboratorio:     " + "\n";
        print += "NIT:             " + NIT + "." + "\n";
        print += "Nombre:          " + Nombre + "." + "\n";
        print += "Dirección:       " + Direccion + "." + "\n";
        print += "---------------------------------------------";
        return print;
    }
}
