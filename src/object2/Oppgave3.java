package object2;
/*
Lag en klasse kalt BensinKjøp for å representere informasjon om kjøp av bensin. Klassen skal ha 5 private attributter:

Bensinstasjonens sted (en streng)
Type bensin (en streng)
Antall liter fylt (et desimaltall)
Prisen pr. liter (et desimaltall)
Tidspunkt fylt (en streng)
Klassen skal ha en konstruktør som initialiserer alle attributtene. Lag også get/set metoder for disse. Lag så en metode finnTotalPrisen.
Denne skal ikke ha noen parametere inn, men skal returnere prisen som et desimaltall. Metoden skal da multiplisere antall liter fylt med prisen pr. liter.
 */

class BensinKjøp{

    private String sted;
    private String bensintype;
    private double antallliter;
    private double prisprliter;
    private String tidspunkt;

    public BensinKjøp(String sted, String bensintype, double antallliter, double prisprliter, String tidspunkt){
        this.sted= sted;
        this.bensintype= bensintype;
        this.antallliter= antallliter;
        this.prisprliter= prisprliter;
        this.tidspunkt= tidspunkt;
    }
    public void setSted (String sted){
        this.sted=sted;
    }
    public String getSted(){
        return sted;
    }
    public void setBensintype(String bensintype){
        this.bensintype=bensintype;
    }
    public String setbensintype(){
        return bensintype;
    }
    public void setAntallliter(double antallliter){
        this.antallliter= antallliter;
    }
    public double getAntallliter(){
        return antallliter;
    }
    public void setPrisprliter(double prisprliter){
        this.prisprliter= prisprliter;
    }
    public double getPrisprliter(){
        return prisprliter;
    }
    public void setTidspunkt(String tidspunkt){
        this.tidspunkt= tidspunkt;
    }
    public String gettidspunkt(){
        return tidspunkt;
    }

    public double finnTotalPrisen(){
        return this.antallliter*this.prisprliter;
    }
}

/*
Lag så kode i main for å teste ut denne klassen.
Bruk String.format("%.2f", prisen); for å få to desimaler.
 */


public class Oppgave3 {
    public static void main(String[] args){
        BensinKjøp bensinKjøp= new BensinKjøp("Circle K","Diesel",40.8,23.17,"13:40");

        double pris =bensinKjøp.finnTotalPrisen();


        System.out.println("Totalprisen blir "+String.format("%.2f", bensinKjøp.finnTotalPrisen()) + "kr. Jeg kjøpte bensin på "+
                bensinKjøp.getSted() + " kl "+ bensinKjøp.gettidspunkt());


}

}
