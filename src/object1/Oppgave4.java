package object1;
/*
Utvid oppgave 3 med å lese inn dataene fra input-bokser og vise resultatet i en meldingsboks på følgende format:

Navn: Per Hansen
Adresse : Osloveien 82
Telefonnr : 22124512
Alder : 21 år.

Tips: bruk \n for å få ny linje
 */

import javax.swing.*;

import static javax.swing.JOptionPane.*;

    class Person1{
        public String navn;
        public String adresse;
        public String telefonnr;
        public int fødselsår;

        public int alder(){
            return 2020 - fødselsår;

        }
        public void skrivUt(int alder){
            String ut ="Navn: "+navn+"\n Adressen: "+adresse+"\n Telefonnummer: "+telefonnr+ " er " +
                    " \n"+alder+ "år";
            showMessageDialog(null,ut);



        }
    }

public class Oppgave4 {

    public static void main(String [] args) {
        Person1 enPerson = new Person1();


        String navn= showInputDialog("Navn:");
        String adresse= showInputDialog("Adresse:");
        String telefonnr=showInputDialog("Telefonnr:");
        String innFødselsår= showInputDialog("Fødselsår:");
        int fødselsår= Integer.parseInt(innFødselsår);


        enPerson.navn= navn;
        enPerson.adresse= adresse;
        enPerson.telefonnr= telefonnr;
        enPerson.fødselsår= fødselsår;

        int alder = enPerson.alder();
        enPerson.skrivUt(alder);


    }
}
