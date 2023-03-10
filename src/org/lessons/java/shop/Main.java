package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {

        //creo un instanza della classe Product usando il costruttore
        Product p1 = new Product("Latte", "biologico", 1.99, 40 );

        //stampo nel terminale i campi
        System.out.println(p1.getName() + " " + p1.getDescription() + " " + p1.getPrice() +  " " + p1.getIva() + " " + p1.getCode());

        //provo a modificare i campi
        p1.setName("Biscotti");
        p1.setDescription(" al cioccolato");
        p1.setPrice(2.50);
        p1.setIva(22);

        //stampo nel terminale il prodotto con i valori diversi
        System.out.println(p1.getName() + " " + p1.getDescription() + " " + p1.getPrice() +  " " + p1.getIva() + " " + p1.getCode());

        //stampo prezzo senza iva
        System.out.println("Prezzo base: " + p1.basePrice());

        //stampo prezzo con iva
        System.out.println("Prezzo con iva: " + p1.ivaPrice());

        //stampo nome esteso
        System.out.println("Nome esteso: " + p1.extendedName());

        //stampo il codice con il pad left
        System.out.println("Codice con pad left: " + p1.padLeft());
    }
}
