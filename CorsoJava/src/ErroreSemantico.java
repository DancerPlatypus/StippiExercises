import java.util.Scanner;

public class ErroreSemantico {
    public void execute(){
        int altezza = 0, larghezza = 0, profondità = 0;
        System.out.println("Digita l'altezza, larghezza e profondità ");
        System.out.println("di una scatola e verrà calcolato il volume.");

        Scanner tastiera = new Scanner(System.in);
        altezza = tastiera.nextInt();
        larghezza = tastiera.nextInt();
        // manca l'input del volore di profondità
        profondità = tastiera.nextInt();


        int volume = altezza * larghezza * profondità;
        System.out.println("il voume è " + volume);
    }
}
