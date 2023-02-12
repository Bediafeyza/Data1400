package Oblig2;
/*
import javax.swing.*;

import static javax.swing.JOptionPane.*;

 class Tallspill {
     public int nyttTall() {
         int slumptall = (int) (Math.random() * 201);
         return slumptall;
     }

     public void visMelding(String melding) {
         // Viser parameterens innhold i en meldingsboks.
         showMessageDialog(null, melding);
     }

     private void forLite(int tall) {
        /* Viser melding om at parameterens verdi er for
           lite tall og ber spilleren prøve igjen. */
     /*    String forLite = tall + " er for lite! Prøv igjen!";
         visMelding(forLite);

     }


         String forStort = tall + " er for stort! Prøv igjen!";
         visMelding(forStort);
     }

     public void avsluttRunde(int antall, int gjetning) {

         String avsluttRunde = antall + " er riktig! Du gjettet riktig på" + gjetning + "forsøk.";
         visMelding(avsluttRunde);
     }

     public void kjørSpill() {

    public class Oppgave2b {
        public static void main(String[] args) {
            int slumptall = nyttTall();
            String innTall;
            int gjetning = 0;
            while (true) {

                gjetning++;
                innTall = JOptionPane.showInputDialog("Jeg tenker på et tall mellom 0 og 200. Prøv å gjette på tallet.");
                int tall;

                try {
                    tall = Integer.parseInt(innTall);
                    if (tall > slumptall) {
                        forStort(tall);
                    }
                    if (tall < slumptall) {
                        forLite(tall);
                    }
                    if (tall == slumptall) {
                        avsluttRunde(tall, gjetning);
                        break;
                    }

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error");
                    break;
                    /*

                }
            }
        }
    }
  */
