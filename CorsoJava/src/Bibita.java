import java.util.Scanner;

public class Bibita {

    Scanner tastiera = new Scanner(System.in);
    public String CalcolaPrezzo(int conteggio){
        double h = 0, costo = 0;
        int i = 0, r, V;
        while(i < conteggio){
            System.out.println("inserire il raggio");
            r = tastiera.nextInt();
            System.out.println("inserire il volume");
            V = tastiera.nextInt();

            h =  V / ( r * r *  Math.PI );
            costo = 2 * Math.PI * r *(r + h);
            System.out.println("L'altezza della lattina vale : " + h);
            System.out.println("Il costo di produzione è di " + costo);
            i ++;
        }
        return "L'altezza della lattina è: " + h + "e il costo di produzione è di " + costo;
    }
}
