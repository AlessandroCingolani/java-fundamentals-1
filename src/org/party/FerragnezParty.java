package org.party;

import java.util.Scanner;

public class FerragnezParty {
    public static void main(String[] args) {
        // import scan
        Scanner scan = new Scanner(System.in);
        String[] guestsList = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone","Rachel Zeilic"};

        System.out.print("Give me your name for check if you are in the list: ");
        String userName = scan.nextLine();
        boolean inList = false;
        for(int i = 0; i < guestsList.length; i++) {
            if(guestsList[i].equals(userName)){
                inList = true;
                break;
            }
        }
        if(inList){
            System.out.println("You can enter");
        }else  {
            System.out.println("Sorry you can't enter");
        }
        //close scanner
        scan.close();
    }
}
