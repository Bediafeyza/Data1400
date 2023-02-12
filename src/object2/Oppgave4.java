package object2;
/*
Lag en klasse kalt Klokke.
Klassen skal ha tre private heltalls- attributter, time, minutter, sekunder.

Klassen skal ha en konstruktør som initialiserer alle attributtene.
Lag også get/set metoder for disse. Set metodene skal sjekke
om inndataene er korrekte (0-24 timer, 0-59 på de to andre).
*/

import java.awt.desktop.ScreenSleepEvent;

class Klokke {
    private int time;
    private int minutter;
    private int sekunder;


    public Klokke(int time, int minutter, int sekunder) {
        this.time = time;
        this.minutter = minutter;
        this.sekunder = sekunder;
    }

    public void setTime(int time) {
        if (time >= 0 && time <= 24) {
            this.time = time;
        }
    }

    public int getTime() {
        return time;
    }

    public void setMinutter(int minutter) {
        if (minutter >= 0 && time <= 59) {
            this.minutter = minutter;

        }
    }

    public int getMinutter() {
        return minutter;
    }

    public void setSekunder(int sekunder) {
        if (sekunder >= 0 && time <= 59)
            this.sekunder = sekunder;
        {
        }
    }

    public int getSekunder() {
        return sekunder;
    }
    public void visTiden(){
        System.out.println("tt : " + time + "  mm : " + minutter + " ss : " + sekunder);

    }
}
        /* Lag så en metode "visTiden" som skriver ut tiden enten
        på System.out eller som meldingsboks på følgende format tt : mm : ss.
        */

        public class Oppgave4 {
            public static void main(String[] args) {
                Klokke tid1 = new Klokke(11,43,12);
                tid1.visTiden();
                Klokke tid2 = new Klokke(26,45,30);
                tid2.visTiden();

            }
        }

