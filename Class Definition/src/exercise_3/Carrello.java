package exercise_3;

import java.util.Arrays;

public class Carrello {
    //ATTRIBUTI
    private Cliente cliente;
    private Articolo[] articoli;
    private int numeroArticoli;

    //COSTRUTTORI
    public Carrello(Cliente cliente) {
        this.cliente = cliente;
        this.articoli = new Articolo[5];
        this.numeroArticoli = 0;
    }


    //METODI
    public void aggiungiArticolo(Articolo articolo) {
        if (numeroArticoli < articoli.length) {
            articoli[numeroArticoli] = articolo;
            numeroArticoli++;
        } else {
            System.out.println("Il carrello è pieno. Non puoi aggiungere altri articoli.");
        }
    }

    public double calcolaTotale() {
        double totale = 0.0;
        for (int i = 0; i < numeroArticoli; i++) {
            totale += articoli[i].getPrezzo();
        }
        return totale;
    }

    @Override
    public String toString() {
        return "Carrello{" +
                "Cliente=" + cliente +
                ", Articoli=" + Arrays.toString(articoli) +
                ", Numero articoli nel carrello=" + numeroArticoli +
                '}';
    }
}
