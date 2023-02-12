package Aritmetikk;

import static javax.swing.JOptionPane.*;

public class Oppgave11 {
    /*
    Les inn et tall mellom 0 og 1000 og
    skriv ut summen av sifrene i tallet (tverrsummen).
    F.eks inndata 751 skal gi
    utdata 7 + 5 + 1 = 13. Tips: 751 % 10 = 1 og 751 / 10 = 75.
     */
    public static void main(String [] args) {
        String innTall = showInputDialog("Skriv inn et tall mellom 0 og 1000");
        int tall = Integer.parseInt(innTall);
        int uTall = tall;
        int sum = 0;
        int enkelttall;
        enkelttall = tall % 10;
        sum += enkelttall;
        tall = tall / 10;
        enkelttall = tall % 10;
        sum +=enkelttall;
        tall = tall/ 10;
        sum += tall;
        System.out.print("Tverrsummen av tallet "+uTall+" er "+sum);
    }

}

