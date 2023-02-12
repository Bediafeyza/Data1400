package Kontrollstukturer1;
/*
Lag et program som leser inn et månedsnavn.
Så skal programmet skrive ut hvilken årstid det er. Reglene er:

Sommer : juni, juli, august
Høst : september, oktober, november
Vinter: desember, januar, februar,
Vår : mars, april, mai,
a) Lag først et program som løser det med if /else

b) Lag deretter et program som løser det med bruk av switch.
 */

import javax.swing.*;
public class Oppgave5 {
    public static void main(String[] args) {
        String måned = JOptionPane.showInputDialog("Skriv inn måned : ");

        if (måned.equals("juni") || måned.equals("juli") || måned.equals("august")){
            JOptionPane.showMessageDialog(null, "Det er sommer");
            }
        else if (måned.equals("september") || måned.equals("oktober") || måned.equals("november")){
            JOptionPane.showMessageDialog(null, "Det er høst");
        }
        else if (måned.equals("desember") || måned.equals("januar") || måned.equals("februar")){
            JOptionPane.showMessageDialog(null, "Det er vinter");
        }
        else{
            JOptionPane.showMessageDialog(null,"Det er ikke en gyldig måned");
        }
    }

}

