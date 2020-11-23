package Trabajo2.Clases;


import java.util.Hashtable;

public class Laboratorio {
    public static Hashtable<Integer,Laboratorio> TablaLaboratorio = new Hashtable<>();
    public int NIT;
    public String Nombre;
    public String Direccion;
    public int IDprueba;

    public Laboratorio(int NIT, String nombre, String direccion) {
        this.NIT = NIT;
        Nombre = nombre;
        Direccion = direccion;
        IDprueba = 1;
        TablaLaboratorio.put(NIT,this);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this){
            return true;
        }
        if (!(o instanceof Laboratorio)){
            return false;
        }
        Laboratorio laboratorio = (Laboratorio) o;
        return (laboratorio.NIT == this.NIT);
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
