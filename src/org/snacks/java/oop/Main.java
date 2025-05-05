package org.snacks.java.oop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        //Snack studente (1)
        Studente s = new Studente("Simone", "Rossi", 15);
        System.out.println("Il nome, cognome e l'età dello studente sono:" + s.getStudent() + " " + "anni");

        //Snack conto bancario (2)
        ContoBancario cb= new ContoBancario("123456789012", new BigDecimal(500.50));
        System.out.println("Il suo numero di conto é il seguente:" + cb.getConto());
        cb.prelievo(new BigDecimal(400.50)); 
        System.out.println("Saldo rimanente dopo il prelievo:" + cb.getSaldo());

        cb.deposito(new BigDecimal(300));
        System.out.println("Saldo rimanente dopo il deposito:" + cb.getSaldo());
    }
}
