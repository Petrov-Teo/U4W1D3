package exercise_1;

public class Main {


    public static void main(String[] args) {
        // Creiamo il primo rettangolo
        Rettangolo rettangolo1 = new Rettangolo(25, 15);

        // Creiamo il secondo rettangolo
        Rettangolo rettangolo2 = new Rettangolo(52, 25);


        System.out.println();
        System.out.println("Il Perimetro del primo rettangolo è" + " " + rettangolo1.calcoloPerimetro());
        System.out.println("L'aria del primo rettangolo è" + " " + rettangolo1.areaRettangolo());
        System.out.println();
        System.out.println("Il Perimetro del primo rettangolo è" + " " + rettangolo2.calcoloPerimetro());
        System.out.println("L'aria del primo rettangolo è" + " " + rettangolo2.areaRettangolo());
        System.out.println("il Totale dei perimetri ");
        System.out.println("il totale dei perimetri del rettangolo1 e del rettangolo2" + sommaPerimetroTot(rettangolo1.getPerimetro(), rettangolo2.getPerimetro()));

    }

    public static double sommaPerimetroTot(double ret1, double ret2) {
        return ret1 + ret2;
    }


}
