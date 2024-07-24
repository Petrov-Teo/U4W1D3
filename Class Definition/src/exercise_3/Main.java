package exercise_3;

public class Main {
    public static void main(String[] args) {
// Creazione Cliente
        Cliente cliente1 = new Cliente("Teo", "Petrov", "petrov@pigrecoservizi.com");

        System.out.println("————————————————————————————————————————————————————————————————————————");
        System.out.println("————————————————————————————————————————————————————————————————————————");
        System.out.println("Cliente");
        System.out.println(cliente1);
        System.out.println();
        System.out.println("————————————————————————————————————————————————————————————————————————");
        System.out.println("Creazione Articoli");
// Creazione Articoli
        Articolo articolo1 = new Articolo("Vaso", 13.50, 4);
        System.out.println("il Primo articolo è:" + articolo1);
        System.out.println();
        Articolo articolo2 = new Articolo("Quadro", 45.78, 1);
        System.out.println("il Primo articolo è:" + articolo2);
        System.out.println();
        Articolo articolo3 = new Articolo("Sedia vintage", 13.52, 5);
        System.out.println("il Primo articolo è:" + articolo3);
        System.out.println();
        Articolo articolo4 = new Articolo("Tavolo", 413.50, 44);
        System.out.println("il Primo articolo è:" + articolo4);
        System.out.println();
        Articolo articolo5 = new Articolo("Scrivania del '800", 13.50, 89);
        System.out.println("il Primo articolo è:" + articolo5);
        System.out.println("————————————————————————————————————————————————————————————————————————");
// Creazione Carrello
        Carrello carrello1 = new Carrello(cliente1);

        carrello1.aggiungiArticolo(articolo1);
        carrello1.aggiungiArticolo(articolo2);
        carrello1.aggiungiArticolo(articolo3);
        carrello1.aggiungiArticolo(articolo4);
        carrello1.aggiungiArticolo(articolo5);

        System.out.println(carrello1);
        System.out.println("————————————————————————————————————————————————————————————————————————");
        System.out.println("Il Totale del Tuo Carrello è: " + "€" + " " + carrello1.calcolaTotale());
        System.out.println("————————————————————————————————————————————————————————————————————————");
        System.out.println("————————————————————————————————————————————————————————————————————————");
    }
}