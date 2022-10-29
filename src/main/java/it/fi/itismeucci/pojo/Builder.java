package it.fi.itismeucci.pojo;

import java.util.Date;

public class Builder {

    public static Classe inizializzaClasse() {
        // inizializzo la classe con gli alunni
        Classe c = new Classe(5, "BIA", "9-TW");
        Alunno a1 = new Alunno("Nome 1", "Cognome 1", new Date(2004, 0, 1));
        Alunno a2 = new Alunno("Nome 2", "Cognome 2", new Date(2004, 1, 1));
        Alunno a3 = new Alunno("Nome 3", "Cognome 3", new Date(2004, 2, 1));
        // etc...
        c.getAlunni().add(a1);
        c.getAlunni().add(a2);
        c.getAlunni().add(a3);
        return c;
    }

}
