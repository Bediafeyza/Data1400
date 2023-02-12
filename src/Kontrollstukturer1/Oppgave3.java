package Kontrollstukturer1;
/*
Gjør oppgave 2 ved hjelp av en else-setning (i tillegg til en if).
 */

import javax.swing.*;

public class Oppgave3 {
        public static void main(String[] args) {
            String innAlder = JOptionPane.showInputDialog("Fyll inn alderen din : ");
            int alder = Integer.parseInt(innAlder);
            if (alder >= 18) {
                JOptionPane.showMessageDialog(null, "Du kan ta førerkortet for bil da du er gammel nok");
            }
           else {
                JOptionPane.showMessageDialog(null, "Du er for ung til å ta førerkort for bil");

            }
        }
    }

