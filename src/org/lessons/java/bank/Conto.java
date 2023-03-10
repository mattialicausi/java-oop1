package org.lessons.java.bank;

public class Conto {

    //campi
    private final int accountNumber;
    private String name;
    private double balance;

    //costruttori
    public Conto(String name, int accountNumber) {
        this.name = name;
        this.balance = 0;
        this.accountNumber = accountNumber;

    }

    //getter e setter
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    //metodi
    public void addCash(double cash) {
        balance += cash;
        System.out.println("Hei versato " + cash + "€ sul conto." );
    }

    public void withdrawCash(double cash) {
        if (cash <= 0) {
            System.out.println("L'importo inserito deve essere maggiore di 0");
            return;
        }

        if (balance <= 0) {
            System.out.println("Non è possibile prelevare, il saldo è insufficiente");
            return;
        }

        if (cash > balance) {
            System.out.println("L'importo inserito è maggiore della disponibilità, cambia importo");
            return;
        }

        balance -= cash;
        System.out.println("Hai prelevato " + cash + " euro, il tuo saldo attuale è " + balance + " euro");
    }

}
