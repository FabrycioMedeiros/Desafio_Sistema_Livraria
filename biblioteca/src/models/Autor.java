package models;

public class Autor {
    private int id;
    private String nome;
    private String dataNascimento;

    public Autor(int id, String nome, String dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    @Override
    public String toString() {
        return "Autor: " + nome + " (Nascimento: " + dataNascimento + ")";
    }
}
