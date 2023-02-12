package Arrays1;
/*
Lag et program som teller
opp antall partall og antall oddetall i et helttalls-array.
 */

public class Oppgvae7 {
    public static void main(String [] args){
        int[] liste = {45, 34, 5, 8, 10, 2, 13, 25};

        int partall = 0;
        int oddetall = 0;

        for ( int i : liste){
            if (i % 2 == 0){
                partall ++;
            }
            else{
                oddetall ++;
            }
        }
        System.out.println("Listen inneholder " + partall + " partall");
        System.out.println("Listen inneholder " + oddetall + " oddetall");
    }
}
