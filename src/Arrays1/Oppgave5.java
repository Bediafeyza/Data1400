package Arrays1;
/*
Bruk arrayet i oppgave 4 og skriv kode for å finne det største og
minste tallet i arrayet via en løkke.
Tips:
Sett største og minste tallet til første elementet i arrayet før løkken.
*/

public class Oppgave5 {
    public static void main(String[] args) {
        int[] liste = {2, 45, 34, 5, 8, 10, 13, 25};

        int største = liste[0];
        int minste = liste[0];

        for (int i : liste){
            if (i > største) {
                største = i;
            }else if ( i < minste){
                minste = i;
            }
        }
        System.out.println("Det største tallet i listen er " + største);
        System.out.println("Det minste talllet i listen er " + minste);
    }
}


