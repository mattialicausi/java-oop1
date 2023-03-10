package org.lessons.java.shop;

import java.util.Random;

public class Product {

    //campi
    private int code;
    private String name;
    private String description;
    private double price;
    private double iva;


    //costruttori

    public Product(String name, String description, double price, double iva) {

        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;

        Random rand = new Random();
        this.code = rand.nextInt(1, 1000);

    }


    //getter e setter

    //code getter
    public int getCode() {
        return code;
    }

    //name getter e setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //description getter e setter

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //price getter e setter

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //iva getter e setter

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }


    //metodi

    //prezzo base
    public double basePrice() {
        return price;
    }

    //prezzo con iva
    public double ivaPrice() {
       double iva_price = ((price * iva) / 100);
       return price + iva_price;
    }

    //nome esteso del prodotto
    public String extendedName() {
        return code + "-" + name;
    }

    //padLeft
    public String padLeft() {
        // controlla se il codice è minore di 8 caratteri
        if (String.valueOf(code).length() < 8) {
            // aggiungi gli zeri necessari all'inizio del codice
            String paddedCode = String.format("%0" + (8 - String.valueOf(code).length()) + "d%s", 0, code);
            return paddedCode;
        }
        // se il codice è già di almeno 8 caratteri, restituisci il codice stesso
        return String.valueOf(code);
    }


}
