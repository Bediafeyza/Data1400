package Kontrollstukturer1;
/*
Lag deretter et program som løser det med bruk av switch.
 */
import javax.swing.*;

public class Oppgave5b {
    public static void main(String[] args) {
        String måned = JOptionPane.showInputDialog("Skriv inn måned : ");
        switch (måned){
            case "juni":
            case "juli":
            case "august":
                JOptionPane.showMessageDialog(null, "Det er sommer");
                break;
            case "september":
            case "oktober":
            case "november":
                JOptionPane.showMessageDialog(null, "Det er høst.");
                break;
            case "desember":
            case "januar":
            case "februar":
                JOptionPane.showMessageDialog(null, "Det er vinter.");
                break;
            case "mars":
            case "april":
            case "mai":
                JOptionPane.showMessageDialog(null, "Det er vår.");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Feil i input, ikke gylidg måned.");
                break;








        }

    }
}
