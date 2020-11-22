package Trabajo2.Clases;

import java.util.ArrayList;
import java.util.List;

public class Norma {
    public String Nombre;
    public String Referencia;

    public Norma(String nombre, String referencia) {
        Nombre = nombre;
        Referencia = referencia;
    }

    @Override
    public String toString() {
        String print = "---------------------------------------------";
        print += "Norma:      " + "\n";
        print += "Nombre:     " + Nombre + "." + "\n";
        print += "Referencia: " + Referencia + "." + "\n";
        print += "---------------------------------------------";
        return print;
    }
}
