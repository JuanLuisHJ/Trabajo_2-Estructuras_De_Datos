package Trabajo2.Clases;

import java.util.*;

public class TipoPrueba {
    public static Hashtable<Integer,TipoPrueba> TablaTipoPrueba = new Hashtable<>();
    public static TreeMap<String, LinkedList<TipoPrueba>> ArbolTipoPruebaNombre = new TreeMap<>();
    public String Nombre;
    public int ID;

    public TipoPrueba( String nombre) {
        Nombre = nombre;
    }

    @Override
    public String toString() {
        String print = "---------------------------------------------";
        print += "Tipo de prueba:         " + "\n";
        print += "Nombre:                 " + Nombre + "." + "\n";
        print += "ID:                     " + ID + "." + "\n";
        print += "---------------------------------------------";
        return print;
    }
}
