package variables1;

import static javax.swing.JOptionPane.*;

public class Oppgave1 {

    public static void main(String[] args){
        /*Lag et program som leser inn en persons fornavn og etternavn hver for seg
        (altså i to forskjellige input-bokser), skjøter dem sammen, og skriver det
        fullstendige navnet ut igjen som del av en passende tekst i en meldingsboks.
        Bruk passende ledetekster ved innlesing, slik at brukeren forstår hva som skal skrives inn.
        */
        String fornavn = showInputDialog("Skriv inn fornavn:");
        String etternavn = showInputDialog("Skriv inn etternavn:");
        String navn = fornavn + " " + etternavn;
        showMessageDialog(null,navn);
    }
}
