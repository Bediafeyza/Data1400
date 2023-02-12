package variables1;

import static javax.swing.JOptionPane.*;

public class Oppgave2 {
    /*Utvid oppgave 1 med å lese inn alderen.
    Programmet skal så vise følgende i meldingsboksen (f.eks inndata):”Alderen til Ole Olsen er 21 år.”
    */
public static void main(String[] args) {
    String fornavn = showInputDialog("Skriv inn fornavn:");
    String etternavn = showInputDialog("Skriv inn etternavn:");
    String alder = showInputDialog("Skriv inn alderen:");
    String navn = fornavn + " " + etternavn;
    String ut = "Alderen til " + navn +" er " + alder +" år.";
    showMessageDialog(null,ut);
}


}



