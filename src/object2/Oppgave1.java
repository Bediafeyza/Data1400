package object2;

/*
Lag en klasse «Person» med følgende private attributter:

fornavn
etternavn
adresse
telefonnr
Lag en konstruktør som setter disse ved instansiering av klassen. Lag så «get», «set» metoder for disse.

Lag så en metode som skriver ut dataene via Swing sin ShowMessageDialog med linjeskift mellom de ulike feltene.

Skriv så kode i «main» for å lese inn dataene via Swing sin input, opprette et objekt og kalle metoden over for å vise disse.
 */

import javax.swing.*;

class Person {
    private String fornavn;
    private String etternavn;
    private String adresse;
    private String telefonnr;

    public Person() {
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public String getEtternavn() {
        return etternavn;

    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setTelefonnr(String telefonnr) {
        this.telefonnr = telefonnr;
    }

    public String getTelefonnr() {
        return telefonnr;
    }


    public class Oppgave1 {
    }

    public static void main(String[] args) {
        Person nyPerson = new Person();


        String fornavn = JOptionPane.showInputDialog("Skriv inn fornavn:");
        String etternavn = JOptionPane.showInputDialog("Skriv inn etternavn:");
        String adresse = JOptionPane.showInputDialog("Skriv inn adressen:");
        String telefonnr = JOptionPane.showInputDialog("Skriv inn telefonnr:");

        nyPerson.setFornavn("Bedia");
        nyPerson.setEtternavn("Yesiltoklu ");
        nyPerson.setAdresse("Haugerudveien 38 ");
        nyPerson.setTelefonnr("40 88 91 05");


        JOptionPane.showMessageDialog(null, nyPerson.getFornavn());
        JOptionPane.showMessageDialog(null, nyPerson.getEtternavn());
        JOptionPane.showMessageDialog(null, nyPerson.getAdresse());
        JOptionPane.showMessageDialog(null, nyPerson.getTelefonnr());
    }
}
