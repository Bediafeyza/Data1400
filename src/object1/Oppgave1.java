package object1;
/*Lag en klasse kalt Bøker. Denne klassen skal ha følgende attributter:

tittel
pris
forfatter
iSBN-nummer
Videre skal klassen ha en metode som skriver ut de enkelte attributtene via System.out.

Skriv nødvendig kode i main for å opprette et objekt av denne klassen og sette attributtene til noen verdier. Tilslutt skal metoden for å skrive disse dataene ut igjen kalles.
*/

class Bøker{
    String tittel;
    double pris;
    String forfatter;
    String ISBN_nummer;

    void skrivUt(){
        System.out.println("Tittelen: "+tittel);
        System.out.println("Prisen er: "+pris);
        System.out.println("Forfatteren er: "+forfatter);
        System.out.println("ISBN-nummeret: "+ISBN_nummer);
    }

}


public class Oppgave1 {

    public static void main(String [] args) {
        Bøker bok1 = new Bøker();
        bok1.tittel="Circe";
        bok1.pris=169.00;
        bok1.forfatter="Madeline Miller";
        bok1.ISBN_nummer="9781408890042";
        bok1.skrivUt();



    }
}
