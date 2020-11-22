package Trabajo2.Clases;

import java.util.ArrayList;
import java.util.List;

public class TipoPrueba {
    public String Nombre;
    public String RefNorma;
    public int NitLaboratorio;

    public TipoPrueba( String nombre, String refnorma, int laboratorio) {
        Nombre = nombre;
        RefNorma = refnorma;
        NitLaboratorio = laboratorio;
    }

    @Override
    public String toString() {
        String print = "---------------------------------------------";
        print += "Tipo de prueba:         " + "\n";
        print += "Nombre:                 " + Nombre + "." + "\n";
        print += "Referencia de la norma: " + RefNorma + "." + "\n";
        print += "NIT del laboratorio:    " + NitLaboratorio + "." + "\n";
        print += "---------------------------------------------";
        return print;
    }
}
