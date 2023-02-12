package object1;

class Bil {
    private String farge;

    public void visFarge() {
        System.out.println("Fargen til bilen er "+farge);
    }

    public void settFarge(String fargen) {
        farge = fargen;
    }

    public String hentFarge(){
        return farge;
    }
}


public class objekter1notes {
    public static void main(String[] args) {
        Bil nyBil = new Bil();
        nyBil.settFarge("blå");
        //nyBil.visFarge();
        String bilFargen;
        bilFargen = nyBil.hentFarge();
        System.out.println("Fargen til bilen er "+bilFargen);

    }
}



