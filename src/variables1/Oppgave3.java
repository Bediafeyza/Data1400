package variables1;

import static javax.swing.JOptionPane.*;

public class Oppgave3 {
    public static void main(String[] args){
        /* Utvid oppgave 2 med adresse, poststed og postnr. Les inn dataene i
         flere inputbox'er og skriv det ut i en setning f.eks :
         Ole Olsen bor i Osloveien 23 som har postnummer 0470 i Oslo.
         Ole’s alder er 21 år.
         */
        String fornavn = showInputDialog("Skriv inn fornavn:");
        String etternavn = showInputDialog("Skriv inn etternavn:");
        String alder = showInputDialog("Skriv inn alderen:");
        String adress = showInputDialog("Skriv inn adressen:");
        String poststed = showInputDialog("Skriv inn poststed:");
        String postnr = showInputDialog("Skriv inn postnr:");
        String ut = fornavn+" "+etternavn+" bor i "+adress+" som har postnummer "+postnr+" i "+poststed+
               ". "+fornavn+"'s alder er " +alder+ " år.";
        showMessageDialog(null,ut);
    }

}
