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
        double km = scan.nextDouble();
        System.out.println(km);

        // chiedi l' età dell' utente
        System.out.print("How old are you: ");
        int age = scan.nextInt();
        System.out.println(age);




        scan.close();
    }
}
