package object1;

import static javax.swing.JOptionPane.*;
/*
Utvid oppgave 1 til å lese inn de nødvendige dataene fra input-bokser og
skrive resultatet ut i en meldingsboks.
 */


class Bøker1{
    String tittel;
    double pris;
    String forfatter;
    String ISBN_nummer;

    void skrivUt(){
        String ut ="Tittel: "+tittel+" Prisen er: "+pris+" Forfatteren er: "+forfatter+
                    "ISBN-nummeret er: "+ISBN_nummer;

        showMessageDialog(null,ut);

    }

}

public class Oppgave2 {

    public static void main(String [] args) {
        Bøker1 bok1 = new Bøker1();
      String forfatter=showInputDialog("Forfatternavnet:");
      String tittel = showInputDialog("Tittelen er:");
      String innPris=showInputDialog("Prisen er");
      String nummer= showInputDialog("ISBN-nummeret er");
      double pris = Double.parseDouble(innPris);
      bok1.forfatter=forfatter;
      bok1.tittel=tittel;
      bok1.pris=pris;
      bok1.ISBN_nummer=nummer;
        bok1.skrivUt();



    }
}
