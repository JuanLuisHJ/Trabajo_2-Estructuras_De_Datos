package Trabajo2.Clases;

import Trabajo2.App;

import java.util.*;

public class TipoPrueba {
    public static Hashtable<Integer,TipoPrueba> TablaTipoPrueba = new Hashtable<>();
    public static TreeMap<String, LinkedList<TipoPrueba>> ArbolTipoPruebaNombre = new TreeMap<>();
    public static TreeMap<String, LinkedList<TipoPrueba>> ArbolTipoPruebaRef = new TreeMap<>();
    public static TreeMap<Integer, LinkedList<TipoPrueba>> ArbolTipoPruebaNit = new TreeMap<>();
    public String Nombre;
    public int ID;
    public String RefNorma;
    public int NitLaboratorio;

    public TipoPrueba( int ID,String nombre,String refnorma, int laboratorio) {
        Nombre = nombre;
        RefNorma = refnorma;
        NitLaboratorio = laboratorio;
        this.ID = ID;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this){
            return true;
        }
        if (!(o instanceof TipoPrueba)){
            return false;
        }
        TipoPrueba tipoPrueba = (TipoPrueba) o;
        return (tipoPrueba.ID == this.ID);
    }

    @Override
    public String toString() {
        String print = "---------------------------------------------";
        print += "Tipo de prueba:         " + "\n";
        print += "Nombre:                 " + Nombre + "." + "\n";
        print += "ID:                     " + ID + "." + "\n";
        print += "Referencia de la norma: " + RefNorma + "." + "\n";
        print += "NIT del laboratorio:    " + NitLaboratorio + "." + "\n";
        print += "---------------------------------------------";
        return print;
    }
}
