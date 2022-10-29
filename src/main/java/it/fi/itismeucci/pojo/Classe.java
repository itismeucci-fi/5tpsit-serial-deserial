package it.fi.itismeucci.pojo;

import java.util.ArrayList;

/**
 * I meteodi getX, setX e toString
 * possono essere generati in automatico da
 * vscode
 * pulsante destro -> source action -> genertate getter and setter
 * pulsante destro -> source action -> genertate toString
 */
public class Classe {

    private int numero;
    private String sezione;
    private String aula;
    private ArrayList<Alunno> alunni = new ArrayList<Alunno>();

    /**
     * è importante che ci sia sempre il costruttore di default
     * deve essere scritto se è presente un altro costruttore
     */
    public Classe() {

    }

    public Classe(int numero, String sezione, String aula) {
        this.numero = numero;
        this.sezione = sezione;
        this.aula = aula;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getSezione() {
        return sezione;
    }

    public void setSezione(String sezione) {
        this.sezione = sezione;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public ArrayList<Alunno> getAlunni() {
        return alunni;
    }

    public void setAlunni(ArrayList<Alunno> alunni) {
        this.alunni = alunni;
    }

    @Override
    public String toString() {
        return "Classe [numero=" + numero + ", sezione=" + sezione + ", aula=" + aula + ", alunni=" + alunni + "]";
    }

}
