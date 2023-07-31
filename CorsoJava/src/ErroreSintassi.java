import java.util.Scanner;

public class ErroreSintassi {

    public void execute (){
        System.out.println("Digita i due numeri da moltiplicare");  //manca "" ;
        Scanner tastiera = new Scanner(System.in);

        // manca il tipo int di n1 e n2
        int n1 = tastiera.nextInt();
        int n2 = tastiera.nextInt();
        int prodotto = n1 * n2;
        System.out.println("il prodotto è " + prodotto); // + significa concatenazione di stringhe
    }
}
