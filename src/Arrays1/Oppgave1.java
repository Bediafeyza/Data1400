package Arrays1;
/*
Definer følgende helttalls-array: 1,2,3,4,5,6,7,8,9.
Skriv ut element nummer 3 og 6 med System.out
 */

public class Oppgave1 {
    public static void main(String[] args){
        int[] liste = new int[10];
        liste [0]=0;
        liste [1]=1;
        liste [2]=2;
        liste [3]=3;
        liste [4]=4;
        liste [5]=5;
        liste [6]=6;
        liste [7]=7;
        liste [8]=8;
        liste [9]=9;

        String ut = "Her er tallene i listen: ";
        ut += liste[3]+", ";
        ut += liste[6]+" ";
        System.out.println(ut);
    }
}