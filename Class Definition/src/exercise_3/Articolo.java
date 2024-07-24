package exercise_3;

import java.util.Random;

public class Articolo {
    //ATTRIBUTI
    private int codiceArticolo;
    private String descrizioneArticolo;
    private double prezzo;
    private double numeroPezziDisponibili;

    //COSTRUTTORI
    public Articolo(String descrizioneArticolo, double prezzo, double numeroPezziDisponibili) {
        Random random = new Random();
        this.codiceArticolo = random.nextInt(0, 156548);
        this.descrizioneArticolo = descrizioneArticolo;
        this.prezzo = prezzo;
        this.numeroPezziDisponibili = numeroPezziDisponibili;
    }

    //METODI


    public int getCodiceArticolo() {
        return codiceArticolo;
    }

    public String getDescrizioneArticolo() {
        return descrizioneArticolo;
    }

    public void setDescrizioneArticolo(String descrizioneArticolo) {
        this.descrizioneArticolo = descrizioneArticolo;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public double getNumeroPezziDisponibili() {
        return numeroPezziDisponibili;
    }

    public void setNumeroPezziDisponibili(double numeroPezziDisponibili) {
        this.numeroPezziDisponibili = numeroPezziDisponibili;
    }

    @Override
    public String toString() {
        return "Articolo{" +
                "Codice Articolo = " + codiceArticolo +
                ", Descrizione Articolo = '" + descrizioneArticolo + '\'' +
                ", Prezzo = " + " " + "€" + " " + prezzo +
                ", Numero Pezzi Disponibili = " + numeroPezziDisponibili +
                '}';
    }
}
