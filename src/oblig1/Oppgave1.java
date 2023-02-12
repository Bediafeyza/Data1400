package oblig1;


class Sirkel {

    public static double sirkeldiameter(double radius){
        double sirkeldiameter = radius*2;
        return sirkeldiameter;
    }
    public static double sirkelomkrets(double radius){
        double sirkelomkrets = 2*Math.PI*radius;
        return sirkelomkrets;
    }
    public static double sirkelareal(double radius){
        double sirkelareal = Math.PI*Math.pow(radius,2);
        return sirkelareal;
    }
}

public class Oppgave1 {
    public static void main(String[]args){
        double radius=23.5;
        double diameter=Sirkel.sirkeldiameter(radius);
        double omkrets=Sirkel.sirkelomkrets(radius);
        double areal=Sirkel.sirkelareal(radius);
        System.out.println("Arealet av sirkelen med radius 23.5 er "+String.format("%.2f",areal));
        System.out.println("Omkretesen av sirkelen med radius 23.5 er "+String.format("%.2f",omkrets));
        System.out.println("Diameteren til sirkelen er med radius 23.5 er "+String.format("%.2f",diameter));

    }
}
