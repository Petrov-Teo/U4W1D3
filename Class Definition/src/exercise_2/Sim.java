package exercise_2;

import java.util.Arrays;

public class Sim {
    //ATTRIBUTI
    private final long numero;
    private double credito;
    private Chiamata[] chiamate;

    private int index;

    //COSTRUTTORI
    public Sim(long numero, double credito) {
        this.numero = numero;
        this.credito = credito;
        this.chiamate = new Chiamata[5];
        this.index = 0;
    }


    //METODI

    // Inserimento delle chiamate nell'Array
    public void aggiungiChiamata(Chiamata chiamata) {

        if (index == chiamate.length) {
            System.arraycopy(chiamate, 1, chiamate, 0, chiamate.length - 1);
            chiamate[chiamate.length - 1] = chiamata;
        } else {
            chiamate[index] = chiamata;
            index++;
        }
    }


    // Stampa tutte le chiamate effettuate.

    public void chiamateEffettuate() {
        System.out.println("Chiamate effettuate:");
        for (int i = 0; i < index; i++) {
            System.out.println(chiamate[i]);
        }
    }

    public long getNumero() {
        return numero;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public Chiamata[] getChiamate() {
        return chiamate;
    }

    public void setChiamate(Chiamata[] chiamate) {
        this.chiamate = chiamate;
    }

    public int getIndex() {
        return index;
    }

    @Override
    public String toString() {
        return "Sim{" +
                "numero=" + numero +
                ", credito=" + credito +
                ", chiamate=" + Arrays.toString(chiamate) +
                '}';
    }
}
