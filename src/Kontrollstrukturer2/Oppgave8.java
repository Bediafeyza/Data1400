package Kontrollstrukturer2;
/*
Lag en while-løkke som summerer alle partallene
fra 0 til 100 og viser gjennomsnittet (0 til og med 98).
Finn også gjennomsnittet.
 */

public class Oppgave8 {
    public static void main(String[] args) {
        int sum= 0;
        int teller = 0;
        int i= 0;
        while (i < 100) {
            sum += i;
            i += 2;
            teller++;
        }
        System.out.println("Summen av partallene mellom 0 og 98 er "+sum );
        double gjennomsnitt = (double)sum/(double)teller;
        System.out.println("Gjennomsnittet er "+gjennomsnitt);
    }
}



