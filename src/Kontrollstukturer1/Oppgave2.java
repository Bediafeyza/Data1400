package Kontrollstukturer1;
/*
Les inn en heltallsvariabel "alder".
Avhengig av hva denne er så skal det skrives ut en tekst tilsvarende :

”Du kan ta førerkortet for bil da du er gammel nok” eller
”Du er for ung til å ta førerkort for bil”.

Gjør dette uten bruk av en else-setning (bruk to if-setninger).

 */

import javax.swing.*;

public class Oppgave2 {
    public static void main(String[] args) {
        String innAlder = JOptionPane.showInputDialog("Fyll inn alderen din : ");
        int alder = Integer.parseInt(innAlder);
        if (alder > 18) {
            JOptionPane.showMessageDialog(null, "Du kan ta førerkortet for bil da du er gammel nok");
        }
        if (alder < 18) {
            JOptionPane.showMessageDialog(null, "Du er for ung til å ta førerkort for bil");

        } else {
            JOptionPane.showMessageDialog(null, "Du er enten umyndig for å ta førerkortet" +
                    " eller så kan du kjøpe" + " hva du vil på polet");
        }
    }
}


