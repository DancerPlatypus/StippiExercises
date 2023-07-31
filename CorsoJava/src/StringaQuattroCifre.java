import java.util.Scanner;

public class StringaQuattroCifre {
    public void execute(){

        System.out.println("Inserire un numero intero a quattro cife");
        System.out.println("Il programma visualizzerà le cifre del numero digitato riga per riga");

        Scanner tastiera = new Scanner(System.in);
        String numero = tastiera.next();
        System.out.println(numero.substring(0,1));
        System.out.println(numero.substring(1,2));
        System.out.println(numero.substring(2,3));
        System.out.println(numero.substring(3,4));
    }
}
