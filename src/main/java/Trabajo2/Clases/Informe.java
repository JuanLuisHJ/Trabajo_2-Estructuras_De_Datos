package Trabajo2.Clases;

import java.util.HashMap;
import java.util.TreeMap;

public class Informe {
    public static HashMap<Integer,Informe> InformesPorNumero = new HashMap<>();
    public static TreeMap<String,HashMap<Integer,Informe>> InformesPorComentario = new TreeMap<>();
    public static TreeMap<Double,HashMap<Integer,Informe>> InformesPorTemperatura = new TreeMap<>();
    public int NumInforme;//numero de informe en clase prueba
    public boolean Resultado;
    public String Comentario;
    public double Temperatura;
    public double Humedad;
    public double Presion;
    public static String[] Comentarios = {"Corriente excedida","Flameo","Perforación","Prueba superada"};


    public Informe(int numInforme, boolean resultado, String comentario, double temperatura, double humedad,double presion) {
        NumInforme = numInforme;
        Resultado = resultado;
        Comentario = comentario;
        Temperatura = temperatura;
        Humedad = humedad;
        Presion = presion;
    }

    @Override
    public boolean equals(Object object) {
        if (object == this){
            return true;
        }
        if (!(object instanceof Informe)){
            return false;
        }
        Informe informe = (Informe) object;
        return (informe.NumInforme == this.NumInforme);
    }

    @Override
    public String toString() {
        String print = "---------------------------------------------";
        print += "Informe: " + "\n";
        print += "Numero de informe:    " + NumInforme + "." + "\n";
        print += "Resultado:            " + PasoNoPaso() + "." + "\n";
        print += "Comentarios:          " + Comentario + "." + "\n";
        print += "Temperatura [°C]:     " + Temperatura + "." + "\n";
        print += "Humedad relativa [%]: " + Humedad + "." + "\n";
        print += "Presion [mmHg]:       " + Presion + "." + "\n";
        print += "---------------------------------------------\n";
        return print;
    }

    public String PasoNoPaso(){
        if (Resultado){
            return "Pasó";
        }
        else{
            return "No Pasó";
        }
    }
}