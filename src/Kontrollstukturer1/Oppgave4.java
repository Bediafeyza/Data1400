package Kontrollstukturer1;
/*
Definer så en variabel som indikerer høyeste alder
man kan ta førerkort uten årlig legesjekk (= 70 år).
Oppdater oppgavene over slik at programmet skriver ut meldingene

Du er for ung til å ta førerkort for bil
Du kan ta førerkort for bil og du trenger ikke årlige legesjekker
Du er absolutt gammel nok for å kjøre bil, men må ha årlige legesjekker
 */

import javax.swing.*;

public class Oppgave4 {
    public static void main(String[] args) {
            String innAlder = JOptionPane.showInputDialog("Fyll inn alderen din : ");
            int alder = Integer.parseInt(innAlder);
            if(alder < 18){
                JOptionPane.showMessageDialog(null,"Du er for ung til å ta førerkort for bil");
            }
            else if (alder < 70){
               JOptionPane.showMessageDialog(null,"Du kan ta førerkortet for bil da du er gammel nok"+
                       " du trenger ikke årlige legesjekker");
            }
            else {JOptionPane.showMessageDialog(null,"Du er absolutt gammel nok for å kjøre bil, "+
                    " men må ha årlige legesjekker");

            }
    }
}
