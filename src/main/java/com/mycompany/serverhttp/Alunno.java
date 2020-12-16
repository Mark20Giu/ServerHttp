package com.mycompany.serverhttp;
public class Alunno {
     private int id;
    private String nome;
    private String cognome;

    public Alunno(int id, String nome, String cognome) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
    }

    public Alunno(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    public Alunno() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
