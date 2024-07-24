package exercise_1;


import java.util.Random;

public class Rettangolo {

    // ATTRIBUTI
    private int id;
    private double altezza;
    private double larghezza;


    // COSTRUTTORI
    public Rettangolo(double altezza, double larghezza) {
        Random random = new Random();
        this.id = random.nextInt(0, 999);
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
