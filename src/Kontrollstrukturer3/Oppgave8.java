package Kontrollstrukturer3;
/*
Palindrom er en sekvens med tegn som kan leses likt begge veier.
Feks. 12321 er et palindrom.
Skriv et program som leser inn et 5 sifret heltall og
avgjør om dette er et palindrom eller ikke. Dersom ikke tallet er 5 siffer,
les inn tallet på nytt.
Tips: Bruk heltallsdivisjon og modulus for å finne de ulike sifrene i tallet.
 */

import javax.swing.*;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave8 {
    public static void main(String[] args) {
        int nummer;
        int tall1;
        int tall2;

        do {
            nummer = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn et femsifret tall"));
        } while (nummer < 10000 || nummer > 100000);

        boolean palindrom1 = false;
        boolean palindrom2 = false;

        //Eks.: 12321

        tall1 = nummer / 10000; //1
        tall2 = nummer % 10; //1

        if (tall1 == tall2) {
            palindrom1 = true;
        }

        nummer = (nummer - tall1 * 10000) / 10; //232

        tall1 = nummer / 100; //2
        tall2 = nummer % 10; //2

        if (tall1 == tall2) {
            palindrom2 = true;
        }

        if (palindrom1 && palindrom2) {
            JOptionPane.showMessageDialog(null, "Tallet er et palindrom");
        } else {
            JOptionPane.showMessageDialog(null, "Tallet er ikke et palindrom");
        }

    }
}
