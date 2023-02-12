package Kontrollstrukturer2;
/*
Lag en primtallsgenerator. Det vl si liste ut alle primtall
fra 0 og opp til et valgt tall.
Et primtall er et tall som bare er delelig med 1 og seg selv.
 */


import javax.swing.*;

class Opggave2a {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn et heltall: "));
        int c = 0;
        String primtall = " er et primtall!";

        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                c++;
            }
            if (c > 2){
                primtall = " er ikke et primtall!";
                break;
            }
        }
        JOptionPane.showMessageDialog(null, "Tallet " + n + primtall);
    }
}


