package exercise_2;

public class Main {
    public static void main(String[] args) {
        Sim sim1 = new Sim(3206812491L, 0.0);
        Chiamata chiamata1 = new Chiamata(3265847515L, 3.15);
        Chiamata chiamata2 = new Chiamata(3265845118L, 2.45);
        Chiamata chiamata3 = new Chiamata(3164875157L, 45.15);
        Chiamata chiamata4 = new Chiamata(3395545149L, 5.21);
        Chiamata chiamata5 = new Chiamata(3206848127L, 34.48);

        System.out.println("————————————————————————————————————————————————————————————————————————");
        System.out.println("————————————————————————————————————————————————————————————————————————");
        System.out.println("sim1 prima dell'inserimento");
        System.out.println(sim1);
        sim1.aggiungiChiamata(chiamata1);
        sim1.aggiungiChiamata(chiamata2);
        sim1.aggiungiChiamata(chiamata3);
        sim1.aggiungiChiamata(chiamata4);
        sim1.aggiungiChiamata(chiamata5);
        System.out.println("sim1 dopo l'inserimento");
        System.out.println(sim1);
        System.out.println("————————————————————————————————————————————————————————————————————————");
        System.out.println("————————————————————————————————————————————————————————————————————————");
    }
}
