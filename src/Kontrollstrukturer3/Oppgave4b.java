package Kontrollstrukturer3;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave4b {
        public static void main(String[] args) {
            int nummer;
            int storst = 0;

            for (int teller = 1; teller <= 10; teller++){
                String innTall = showInputDialog("Skriv inn heltall nummer " + teller);
                nummer = Integer.parseInt(innTall);

                if(nummer > storst){
                    storst = nummer;
                }
            }
            showMessageDialog(null,"Det største tallet er " + storst);
        }
    }

