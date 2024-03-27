package org.trains;

import java.util.Scanner;

public class CalcolaBiglietto {
    public static void main(String[] args) {
        //import scanner
        Scanner scan = new Scanner(System.in);

        //variables
        double priceKm = 0.21;
        int underAgeDiscount = 20, seniorDiscount = 40;


        // chiedi quanti chilometri deve percorrere
        System.out.print("How many kilometers you have to travel: ");
        double kmToTravel = scan.nextDouble();
        System.out.println(kmToTravel);

        // chiedi l' età dell' utente
        System.out.print("How old are you: ");
        int age = scan.nextInt();
        System.out.println(age);

        //calcolare prezzo biglietto
        double priceTicket = priceKm * kmToTravel;

        //utilizzo cast perchè sto facendo calcolo con 2 interi
        if(age < 18) {
            priceTicket = priceTicket - (priceTicket*((double) underAgeDiscount / 100));
        } else if (age > 65) {
            priceTicket = priceTicket - (priceTicket*((double) seniorDiscount / 100));
        }
        System.out.println("Ticket price : " + priceTicket + "€");

        scan.close();
    }
}

