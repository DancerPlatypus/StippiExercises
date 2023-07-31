import java.util.Scanner;

public class Esercizio1 {
    public void execute(){

        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserisci una stringa");
        int n = tastiera.nextInt();
        String s = tastiera.next();

        System.out.println("n è " + n);
        System.out.println("s è " + s);
    }
}
