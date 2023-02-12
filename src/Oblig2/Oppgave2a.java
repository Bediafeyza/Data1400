package Oblig2;


import static javax.swing.JOptionPane.*;

class TallSpill {
    public int nyttTall() {
        int nyttTall = (int) (Math.random() * 201);
        return nyttTall;
    }

    public void visMelding(String melding) {
        showMessageDialog(null, melding);
    }

    private void forLite(int tall) {
        String melding = tall + " er for lite! Prøv igjen";
        visMelding(melding);
    }

    private void forStort(int tall) {
        String melding = tall + " er for stort! Prøv igjen!";
        visMelding(melding);
    }

    public void avsluttRunde(int antall, int gjetning) {
        String melding = antall + " er riktig!\nDu gjettet riktig på " + gjetning + " forsøk.";
        visMelding(melding);
    }

    public void kjørSpill() {
        int riktigTall = nyttTall();
        String skrivInnTall = showInputDialog("Jeg tenker på et tall mellom 0 og 200.\n Prøv å gjette på tallet:");
        try{
            int skrevetInnTall = Integer.parseInt(skrivInnTall);
        }
        catch(Exception e){
            System.out.println(e);
        }
        int gjettetTall = Integer.parseInt(skrivInnTall);
        int gjetninger = 0;
        while (riktigTall != gjettetTall) {
            gjetninger++;
            if (riktigTall == gjettetTall) {
                avsluttRunde(gjettetTall, gjetninger);
            } else if (riktigTall < gjettetTall) {
                forStort(gjettetTall);
            } else if (riktigTall > gjettetTall) {
                forLite(gjettetTall);
            }
            skrivInnTall = showInputDialog("Jeg tenker på et tall mellom 0 og 200.\n Prøv å gjette på tallet:");
            try{
                int skrevetInnTall = Integer.parseInt(skrivInnTall);
            }
            catch(Exception e){
                System.out.println(e);
            }
            gjettetTall = Integer.parseInt(skrivInnTall);
            if (riktigTall == gjettetTall) {
                avsluttRunde(gjettetTall, gjetninger);
            }
        }
    }
}

public class Oppgave2a {
    public static void main(String[] args) {
        TallSpill tallspill1 = new TallSpill();
        tallspill1.kjørSpill();
    }
}






