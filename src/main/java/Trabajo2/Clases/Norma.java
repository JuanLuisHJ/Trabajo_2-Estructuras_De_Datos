package Trabajo2.Clases;


import java.util.Hashtable;

public class Norma {
    public static Hashtable<String,Norma> TablaNorma = new Hashtable<>();
    public String Nombre;
    public String Referencia;

    public Norma(String nombre, String referencia) {
        Nombre = nombre;
        Referencia = referencia;
        TablaNorma.put(referencia,this);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this){
            return true;
        }
        if (!(o instanceof Norma)){
            return false;
        }
        Norma norma = (Norma) o;
        return norma.Referencia.equalsIgnoreCase(this.Referencia);
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
