package Aritmetikk;

import static javax.swing.JOptionPane.*;

public class Oppgave5 {
    /* Lag et program som regner om fra fahrenheit til celsius. Les inn verdien for fahrenheit og regn ut tilsvarende celsius med
     følgende formel: C = (F-32)/1.8. Skriv så ut resultatet i Celsius.
     */
    public static void main(String [] args) {
        String innGraderFaherenheit = showInputDialog("Skriv inn gradene i Faherenheit");
        double graderFaherenheit = Double.parseDouble(innGraderFaherenheit);
        double graderCelsius = (graderFaherenheit-32)/1.8;
        String graderCelciusMedToDesimaler = String.format("%.2f",graderCelsius);
        System.out.print(innGraderFaherenheit+" grader F gir "+graderCelciusMedToDesimaler+" grader C");


    }

}
