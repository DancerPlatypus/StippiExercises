import java.util.Scanner;

public class QuattroCifre {
    public void execute(){
        System.out.println("Inserire un numero intero a quattro cife");
        System.out.println("Il programma visualizzerà le cifre del numero digitato riga per riga");
        Scanner tastiera = new Scanner(System.in);
        int numero = tastiera.nextInt();

        int migliaia = numero / 1000;
        int resto = numero % 1000;
        int centinaia = resto / 100;
        resto = resto % 100;
        int decine = resto / 10;
        resto = resto % 10;

        System.out.println(migliaia);
        System.out.println(centinaia);
        System.out.println(decine);
        System.out.println(resto);
    }
}
