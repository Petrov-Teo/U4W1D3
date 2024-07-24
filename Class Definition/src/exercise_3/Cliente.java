package exercise_3;

import java.time.LocalDate;
import java.util.Random;

public class Cliente {
    //ATTRIBUTI
    private int codiceCliente;
    private String nome;
    private String cognome;
    private String email;
    private LocalDate data;

    //COSTRUTTORI
    public Cliente(String nome, String cognome, String email) {
        Random random = new Random();
        this.codiceCliente = random.nextInt(100, 1000);
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.data = LocalDate.now();
    }

    //METODI

    public int getCodiceCliente() {
        return codiceCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "codiceCliente=" + codiceCliente +
                ", Nome='" + nome + '\'' +
                ", Cognome='" + cognome + '\'' +
                ", Email='" + email + '\'' +
                ", Data=" + data +
                '}';
    }
}
