package org.lessons.java.bank;

import java.util.Random;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {

        //chiedo il nome all'utente e genero un conto
        System.out.println("Inserisci il tuo nome");
        Scanner scan = new Scanner(System.in);
        String userName = scan.nextLine();

        //genero numero casuale per l'account number
        Random rand = new Random();
        int randomAccountNumber = rand.nextInt(1, 1000 );

        Conto c1 = new Conto(userName, randomAccountNumber);

        System.out.println("Account number: " + c1.getAccountNumber() + " Name: " + c1.getName());


        //chiedo all'utente che operazione vuole effettuare


        boolean close = false;

        while (!close) {

            System.out.println("Che operazione vuoi effettuare?");
            System.out.println("Per il prelievo digita 1");
            System.out.println("Per il versamento digita 2");
            System.out.println("Per Uscire digita 3");

            Scanner scanOperation = new Scanner(System.in);
            int operation = Integer.parseInt(scanOperation.nextLine());

            System.out.println("hai scelto l'opzione " + operation);

            //continuo con le operazioni

            if (operation == 1) {

                //prelievo

                System.out.println("Quanto vuoi prelevare? ");
                Scanner withdrawC = new Scanner(System.in);
                int cashToW = Integer.parseInt(withdrawC.nextLine());

                c1.withdrawCash(cashToW);
            } else if (operation == 2 ) {

                //versamento

                System.out.println("Quanto vuoi versare? ");
                Scanner addC = new Scanner(System.in);
                int cashToA = Integer.parseInt(addC.nextLine());

                c1.addCash(cashToA);

            } else if (operation == 3) {

                //esci

                System.out.println("Sei uscito");
                close = true;
                return;
            }
        }


    }
}
