package exercise_2;

public class Chiamata {
    //ATTRIBUTI
    private long numeroDaChiamare;
    private double durataTelefonata;

    //COSTRUTTORI
    public Chiamata(long numeroDaChiamare, double durataTelefonata) {
        this.numeroDaChiamare = numeroDaChiamare;
        this.durataTelefonata = durataTelefonata;
    }

    //METODI

    public long getNumeroDaChiamare() {
        return numeroDaChiamare;
    }

    public void setNumeroDaChiamare(long numeroDaChiamare) {
        this.numeroDaChiamare = numeroDaChiamare;
    }

    public double getDurataTelefonata() {
        return durataTelefonata;
    }

    public void setDurataTelefonata(double durataTelefonata) {
        this.durataTelefonata = durataTelefonata;
    }

    @Override
    public String toString() {
        return "Chiamata{" +
                "numeroDaChiamare=" + numeroDaChiamare +
                ", durataTelefonata=" + durataTelefonata +
                '}';
    }
}
