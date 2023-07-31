import java.util.Scanner;
public class ErroriRunTime {
    public void execute(){
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Digita la tua età.");
        System.out.println("e digita il tuo nome completo.");
        int eta = tastiera.nextInt();
        String nome = tastiera.nextLine();
        nome = nome.toUpperCase();
        System.out.println("Il tuo nome in maiuscolo è" + nome + " e hai " + eta + " anni.");
    }
}
