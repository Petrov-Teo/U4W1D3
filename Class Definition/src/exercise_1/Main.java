package exercise_1;

public class Main {
    public double periteroTot;
    public double areaTot;

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
        System.out.println("il totale dei perimetri del rettangolo1 e del rettangolo2" + perimetroTot(rettangolo1.getPerimetro(), rettangolo2.getPerimetro()));
        System.out.println("il totale dei perimetri del rettangolo1 e del rettangolo2" + areaTot(rettangolo1.getArea(), rettangolo2.getArea()));
    }

    public static double perimetroTot(double ret1, double ret2) {
        double perimetroTotale = ret1 + ret2;
        return perimetroTotale;
    }

    public static double areaTot(double ret1, double ret2) {
        double areTotale = ret1 + ret2;
        return areTotale;
    }

}
