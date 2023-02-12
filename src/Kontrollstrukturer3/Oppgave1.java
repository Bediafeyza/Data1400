package Kontrollstrukturer3;
/*
Lag et program som regner ut hvor mye en bil bruker i bensin på ulike turer.
Programmet skal lese inn to og to verdier, lengden på turen i km og
hvormye bensin som ble brukt.
Les Skriv inn ved hjelp av inputbokser (JOptionPane).
Når lengden på turen er 0 eller negativ avsluttes innlesningen
og det skrives ut hvor mye gjennomsnittlig bensin bilen har brukt pr mil.
 */

import javax.swing.*;


public class Oppgave1 {
    public static void main(String[] args) {
        String innKm= JOptionPane.showInputDialog("Skriv inn antall km på turen, avslutt med 0");
        double antallKm= Double.parseDouble(innKm);
        String innLiter = JOptionPane.showInputDialog("Skriv inn antall liter som ble brukt på turen");
        double antallLiter = Double.parseDouble(innLiter);
        double totaltAntallKm = 0, totaltAntallLiter = 0;

        while (antallKm > 0){
            totaltAntallKm += antallKm;
            totaltAntallLiter += antallLiter;
            innKm = JOptionPane.showInputDialog("Skriv inn antall km på denne turen, avslutt med 0");
            antallKm = Double.parseDouble(innKm);
            innLiter = JOptionPane.showInputDialog("Skriv inn antall liter som ble brukt på turen");
            antallLiter = Double.parseDouble(innLiter);
        }
        double gjennomsnitt = totaltAntallLiter/totaltAntallKm*10;
        JOptionPane.showMessageDialog(null,"Gjennomsnittelig forbruk pr mil er " + gjennomsnitt + " liter");
        }
    }

