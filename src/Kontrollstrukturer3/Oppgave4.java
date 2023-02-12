package Kontrollstrukturer3;
/*
Et program skal finne det største tallet av 10 heltall.
Tallene skal leses inn via Inputbokser og vises som en meldingsboks.
Programmet skal bruke tre heltallsvariabler:

telller; som teller 0 til 10
nummer; som er tallet som er lest inn
størst; det til en hver tid største tallet
 */
import javax.swing.*;
public class Oppgave4 {
    public static void main(String[] args) {
        int teller = 0;
        int nummer = 0;
        int størst = 0;

        while (teller < 10) {
            nummer = Integer.parseInt(JOptionPane.showInputDialog("Tall " + teller));
            if (nummer > størst) {
            }
            teller++;
        }
        System.out.println(størst);

    }
}




