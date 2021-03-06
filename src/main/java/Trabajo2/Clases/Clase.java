package Trabajo2.Clases;

import java.util.Hashtable;

public class Clase {
    public static Hashtable<String,Clase> TablaClase = new Hashtable<>();
    public String Nombre;
    public String Norma;
    public double VoltajePrueba;
    public double CorrientePrueba;
    public double VoltajeMaximo;
    public double CorrienteMaxima;
    public double Tiempo;

    public Clase(String nombre, String norma, double voltajePrueba, double corrientePrueba, double voltajeMaximo, double corrienteMaxima, double tiempo) {
        Nombre = nombre;
        Norma = norma;
        VoltajePrueba = voltajePrueba;
        CorrientePrueba = corrientePrueba;
        VoltajeMaximo = voltajeMaximo;
        CorrienteMaxima = corrienteMaxima;
        Tiempo = tiempo;
        TablaClase.put(nombre,this);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this){
            return true;
        }
        if (!(o instanceof Clase)){
            return false;
        }
        Clase clase = (Clase) o;
        return clase.Nombre.equalsIgnoreCase(this.Nombre);
    }

    @Override
    public String toString() {
        String print = "---------------------------------------------";
        print += "Clase: " + "\n";
        print += "Nombre:                  " + Nombre + "." + "\n";
        print += "Referencia de la norma:  " + Norma + "." + "\n";
        print += "Voltaje de prueba [V]:   " + VoltajePrueba + "." + "\n";
        print += "Corriente de prueba [A]: " + CorrientePrueba + "." + "\n";
        print += "Voltaje máximo [V]:      " + VoltajeMaximo + "." + "\n";
        print += "Corriente máxima [A]:    " + CorrienteMaxima + "." + "\n";
        print += "Tiempo de prueba [s]:    " + Tiempo + "." + "\n";
        print += "---------------------------------------------";
        return print;
    }
}
