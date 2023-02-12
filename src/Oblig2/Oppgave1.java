package Oblig2;
/*
Lag et program som beregner og
skriver ut summen av alle tall mellom to grenser som brukeren skriver inn.
Programmet skal starte med å lese inn nedre og øvre grense for summen.

Dersom innlest øvre grense er mindre enn eller lik nedre grense,
skal programmet skrive ut en melding til brukeren om dette og foreta ny innlesing.

Når godkjente grenser er lest inn, skal programmet beregne nevnte sum og summen
skal så skrive den ut som en sum.Hvis f. eks. nedre grense er 2 og øvre grense er
8 skal det skrives ut følgende tekst: "2 + 3 + 4 + 5 + 6 + 7 + 8 = 35".

Test ut programmet med nedre grense lik 1 og øvre grense lik 100.
Legg inn et linjeskift for hvert 10. tall i summen´.
*/

public class Oppgave1 {
    public static void main(String[] args) {
        int nedreGrense = 1;
        int øvreGrense = 100;

        if (nedreGrense <1 || øvreGrense >100 || øvreGrense <= nedreGrense) {
            System.out.println("Du må foreta en ny innlesning");
        }
        else {
            int sum = 0;
            for (int i = nedreGrense; i <= øvreGrense; i++) {
                sum = sum + i;
                System.out.print(i+ " + ");
                if (i%10 == 0){
                    System.out.print("\n");
                } else if (i == øvreGrense) {
                    System.out.print(i = sum);

                }
            }
            System.out.print("= "+sum);
        }
    }
}










