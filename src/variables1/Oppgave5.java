package variables1;

import static javax.swing.JOptionPane.*;

public class Oppgave5 {
    /*
     Endre oppgave 4 slik at utskriften ikke kommer i en meldingsboks, men i System.out.
     */

    public static void main(String [] args){
        String fornavn = showInputDialog("Skriv inn fornavn:");
        String etternavn = showInputDialog("Skriv inn etternavn:");
        String alder = showInputDialog("Skriv inn alderen:");
        String adress = showInputDialog("Skriv inn adressen:");
        String poststed = showInputDialog("Skriv inn poststed:");
        String postnr = showInputDialog("Skriv inn postnr:");
        String ut = "Navn :"+fornavn+" "+etternavn+"\n"+
                "Adresse :"+adress+"\n"+
                "Postnummer :"+postnr+"\n"+
                "Poststed :"+poststed+"\n"+
                "Alder :"+alder+" år.";

      System.out.println(ut);


    }
}
