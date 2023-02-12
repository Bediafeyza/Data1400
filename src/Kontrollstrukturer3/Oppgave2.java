package Kontrollstrukturer3;
/*
En salgsperson får kommisjon av salget sitt.
Det betyr at vedkommende får 9 % av salget i tillegg til vanlig månedslønn.

Skriv et program som leser prisen på et antall varer selgeren har solgt og
regn ut hvor mye tillegg vedkommende er berettiget til.
Bruk inputbokser og avslutt innlesningen når prisen er 0.
 */

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave2 {
    public static void main(String[] args) {
        String innVarePris = showInputDialog("Skriv inn prisen på varen og avslutt med 0");
        double varePris = Double.parseDouble(innVarePris);
        double totaltpris = 0;

        while (varePris > 0){
            totaltpris += varePris;
            innVarePris =showInputDialog("Skriv inn prisen på varen og avslutt med 0");
            varePris = Double.parseDouble(innVarePris);
        }
        double kommisjon = totaltpris * 0.09;

        showMessageDialog(null,"Kommisjonen for totalt "+ totaltpris +" kr blir " + kommisjon + " kr");
    }
}
