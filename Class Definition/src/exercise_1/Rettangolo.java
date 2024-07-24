package exercise_1;


public class Rettangolo {

    // ATTRIBUTI
    private double id;
    private double altezza;
    private double larghezza;


    // COSTRUTTORI
    public Rettangolo(double altezza, double larghezza) {
        this.id = Math.random();
        this.larghezza = larghezza;
        this.altezza = altezza;

    }

    //METODI
    public double calcoloPerimetro() {
        return this.larghezza * 2 + this.altezza * 2;

    }

    public double areaRettangolo() {
        return this.altezza * this.larghezza;

    }

    //GET METODS

    public double getId() {
        return id;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }


    //SETMETODS

    public double getLarghezza() {
        return larghezza;
    }

    public void setLarghezza(double larghezza) {
        this.larghezza = larghezza;
    }

    @Override
    public String toString() {
        return "Rettangolo{" +
                "id=" + id +
                ", altezza=" + altezza +
                ", larghezza=" + larghezza +
                '}';
    }
}
