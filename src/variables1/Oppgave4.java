package variables1;

import static javax.swing.JOptionPane.*;

public class Oppgave4 {
        /*
        Endre oppgave 3 slik at det vises følgende i meldingsboksen (f.eks inndata):
        Navn : Ole Olsen
        Adresse : Osloveien 23
        Postnummer : 0470
        Poststed : Oslo
        Alder : 21 år.
        Tips: bruk \n for å få ny linje
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

            showMessageDialog(null,ut);


    }
}
