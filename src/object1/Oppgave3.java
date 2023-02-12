package object1;


/*
Lag en klasse kalt Person. Denne skal inneholde følgende attributter:

navn
adresse
telefonnr
fødselsår
Lag en metode for å regne ut alderen til en person. Metoden skal ikke ta inn noen parametere, den skal regne ut alderen ut i fra fødselsår. Metoden skal returnere alderen.

Lag så en metode som, tar inn alderen, og som skriver ut alle vitale data for personen på følgende måte:

Per Hansen med adresse Osloveien 82 med telefonnummer 22124512 er 21 år.

Opprett et eller flere person objekter i main-metoden for å teste ut.
 */

import static javax.swing.JOptionPane.*;


    class Person{
        public String navn;
        public String adresse;
        public String telefonnr;
        public int fødselsår;

        public int alder(){
            return 2020 - fødselsår;

        }

        public void skrivUt(int alder){
            String ut = navn+" med adressen "+adresse+" med telefonnummer "+telefonnr+ " er " +
                    " "+alder+ "år";
            System.out.print(ut);


        }
    }

public class Oppgave3 {

    public static void main(String [] args) {
        Person enPerson = new Person();

        enPerson.navn= "Ole Olsen";
        enPerson.adresse= "Osloveien 38";
        enPerson.telefonnr= "1234567";
        enPerson.fødselsår= 1992;

        int alder = enPerson.alder();
        enPerson.skrivUt(alder);


    }
}
