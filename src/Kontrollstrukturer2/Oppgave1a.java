package Kontrollstrukturer2;
/*
Beregn Pi med 6 desimalers nøyaktighet.
Pi er et tall med et uendelig antall desimaler.
Pi med 11 desimaler er 3.14159265358.
Bruk en løkke til å beregne pi ved hjelp av denne rekken:
Pi=4 - 4/3 + 4/5 - 4/7 + 4/9 - 4/11+....
 */

import javax.swing.*;

public class Oppgave1a {
    public static void main(String[] args) {
        int nummer = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn et heltall for antall: "));

        double pi = 4;
        int fortegn = -1;
        for (long i = 3; i <nummer; i+=2){
            pi += fortegn * (4/(double) i);
            fortegn= -fortegn;
        }
        JOptionPane.showMessageDialog(null, "PI skal være 3.14159265358.\nBlir: " + pi);

    }
}
