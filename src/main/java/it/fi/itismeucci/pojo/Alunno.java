package it.fi.itismeucci.pojo;

import java.util.Date;

/**
 * I meteodi getX, setX e toString
 * possono essere generati in automatico da
 * vscode
 * pulsante destro -> source action -> genertate getter and setter
 * pulsante destro -> source action -> genertate toString
 */
public class Alunno {

    private String nome;
    private String cognome;
    private Date dataNascita;

    
    /**
     * è importante che ci sia sempre il costruttore di default
     * deve essere scritto se è presente un altro costruttore
     */
    public Alunno() {

    }

    
    public Alunno(String nome, String cognome, Date dataNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
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

    public Date getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(Date dataNascita) {
        this.dataNascita = dataNascita;
    }

    @Override
    public String toString() {
        return "Alunno [nome=" + nome + ", cognome=" + cognome + ", dataNascita=" + dataNascita + "]";
    }

}
