import java.util.Scanner;

public class Punteggio {
    public void execute(){
        System.out.println("Inserire un valore");
        Scanner tastiera = new Scanner(System.in);
        int n =  tastiera.nextInt();
        if ((n>0) && (n<=100))
            System.out.println("Il valore inserito è valido");
        else
            System.out.println("Il valore inserito dev'essere compreso tra 0 e 100, riprova");
    }
}
