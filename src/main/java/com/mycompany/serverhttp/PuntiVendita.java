package com.mycompany.serverhttp;
import java.util.ArrayList;
public class PuntiVendita {
    private int size;
    private ArrayList<DatiPunto> listaRisultati;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public ArrayList<DatiPunto> getlistaRisultati() {
        return listaRisultati;
    }

    public void setlistaRisultati(ArrayList<DatiPunto> puntiVendita) {
        this.listaRisultati = puntiVendita;
    }

    @Override
    public String toString() {
        String s = "";
        for (int i=0; i < listaRisultati.size();i++)
        {
            s += listaRisultati.get(i).toString() + "\n";
        }
        return s;
    }
    
}
