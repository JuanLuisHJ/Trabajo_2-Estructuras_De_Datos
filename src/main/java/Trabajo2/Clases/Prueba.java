package Trabajo2.Clases;

import java.util.*;

public class Prueba {
    public static Hashtable<Integer,Prueba> TablaPrueba = new Hashtable<>();
    public static TreeMap<String, LinkedList<Prueba>> ArbolPruebaNombre = new TreeMap<>();
    public static TreeMap<String, LinkedList<Prueba>> ArbolPruebaClase = new TreeMap<>();
    public static TreeMap<Integer, LinkedList<Prueba>> ArbolPruebaTP = new TreeMap<>();
    public static TreeMap<String, LinkedList<Prueba>> ArbolPruebaDispo = new TreeMap<>();
    public int ID;
    public String Nombre;
    public int TipoPrueba;
    public int NumInforme;
    public String Clase;
    public String Dispositivo;

    public Prueba(int ID,String nombre, int tipoprueba, String clase, String dispositivo) {
        this.ID = ID;
        Nombre = nombre;
        TipoPrueba = tipoprueba;
        NumInforme = -1;
        Clase = clase;
        Dispositivo = dispositivo;
        TablaPrueba.put(ID,this);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this){
            return true;
        }
        if (!(o instanceof Prueba)){
            return false;
        }
        Prueba prueba = (Prueba) o;
        return (prueba.ID == this.ID);
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
        print += "Dispositivo:                 " + Dispositivo + "." + "\n";
        print += "---------------------------------------------";
        return print;
    }
}
