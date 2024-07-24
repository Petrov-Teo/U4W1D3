package exercise_1;

public class Main {


    public static void main(String[] args) {
        // Creiamo il primo rettangolo
        Rettangolo rettangolo1 = new Rettangolo(25, 15);

        // Creiamo il secondo rettangolo
        Rettangolo rettangolo2 = new Rettangolo(52, 25);

        System.out.println("———————————————————————————————————————————————————————————————————————————————————");
        System.out.println("———————————————————————————————————————————————————————————————————————————————————");
        System.out.println(rettangolo1);
        System.out.println("———————————————————————————————————————————————————————————————————————————————————");
        System.out.println(rettangolo2);
        System.out.println("———————————————————————————————————————————————————————————————————————————————————");
        System.out.println("Il Perimetro del primo rettangolo è" + " " + rettangolo1.calcoloPerimetro());
        System.out.println("L'aria del primo rettangolo è" + " " + rettangolo1.areaRettangolo());
        System.out.println("———————————————————————————————————————————————————————————————————————————————————");
        System.out.println("Il Perimetro del secondo rettangolo è" + " " + rettangolo2.calcoloPerimetro());
        System.out.println("L'aria del secondo rettangolo è" + " " + rettangolo2.areaRettangolo());
        System.out.println("———————————————————————————————————————————————————————————————————————————————————");
        System.out.println("il Totale dei perimetri è");
        System.out.println(sommaPerimetro(rettangolo1, rettangolo2));
        System.out.println("———————————————————————————————————————————————————————————————————————————————————");
        System.out.println("il Totale dell'area è");
        System.out.println(sommaArea(rettangolo1, rettangolo2));
        System.out.println("———————————————————————————————————————————————————————————————————————————————————");
        System.out.println("———————————————————————————————————————————————————————————————————————————————————");

    }

    public static double sommaPerimetro(Rettangolo ret1, Rettangolo ret2) {
        double somma = ret1.calcoloPerimetro() + ret2.calcoloPerimetro();
        return somma;
    }

    public static double sommaArea(Rettangolo ret1, Rettangolo ret2) {
        double somma = ret1.areaRettangolo() + ret2.areaRettangolo();
        return somma;
    }


}
