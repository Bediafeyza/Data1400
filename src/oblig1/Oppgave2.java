package oblig1;


import javax.swing.*;

class Vare {
    private String navn;
    private int antall;
    private double pris;

    public Vare(String navn, int antall, double pris) {
        this.navn = navn;
        if (antall > 0) {
            this.antall = antall;
        }
        if (pris > 0) {
            this.pris = pris;
        }
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getNavn() {
        return navn;
    }

    public void setAntall(int antall) {
        if (antall > 0) {
            this.antall = antall;
        }
    }

    public int getAntall() {
        return antall;
    }

    public void setPris(double pris) {
        if (pris > 0) {
            this.pris = pris;
        }
    }

    public double getPris() {
        return pris;
    }

    public double totalPris() {
        double totalpris = pris * antall;
        return totalpris;
    }

}

public class Oppgave2 {

    public static void main(String[] args) {


        String navn1 = JOptionPane.showInputDialog("Skriv inn navnet på første vare");
        String antall1 = JOptionPane.showInputDialog("Skriv inn antallet av første vare");
        String pris1 = JOptionPane.showInputDialog("Skriv inn prisen på første vare");

        String navn2 = JOptionPane.showInputDialog("Skriv inn navnet på andre vare");
        String antall2 = JOptionPane.showInputDialog("Skriv inn antallet av andre vare");
        String pris2 = JOptionPane.showInputDialog("Skriv inn prisen på andre vare");

        int antallet1;
        try {
            antallet1 = Integer.parseInt(antall1);
        } catch (Exception e) {
            antallet1 = 0;
            System.out.println(e);
        }
        double prisen1;
        try {
            prisen1 = Double.parseDouble(pris1);
        } catch (Exception e) {
            prisen1 = 0;
            System.out.println(e);
        }
        int antallet2;
        try {
            antallet2 = Integer.parseInt(antall2);
        } catch (Exception e) {
            antallet2 = 0;
            System.out.println(e);
        }
        double prisen2;
        try {
            prisen2 = Double.parseDouble(pris2);
        } catch (Exception e) {
            prisen2 = 0;
            System.out.println(e);
        }
        Vare vare1 = new Vare(navn1, antallet1, prisen1);
        Vare vare2 = new Vare(navn2, antallet2, prisen2);
        vare1.setNavn(navn1);
        vare1.setAntall(antallet1);
        vare1.setPris(prisen1);
        vare2.setNavn(navn2);
        vare2.setAntall(antallet2);
        vare2.setPris(prisen2);
        double totalPris1 = vare1.totalPris();
        double totalPris2 = vare2.totalPris();
        double totalPrisPåAlt = totalPris1 + totalPris2;
        System.out.println("Totalprisen ble: " + totalPrisPåAlt + " kr");


    }
}


