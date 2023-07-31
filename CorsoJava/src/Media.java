import java.util.Scanner;

public class Media {
    public void execute(){

        System.out.println("Inserire tre numeri interi e il programma calcolerà la media");
        Scanner tastiera = new Scanner(System.in);
        int n1 = tastiera.nextInt();
        int n2 = tastiera.nextInt();
        int n3 = tastiera.nextInt();

        double media = (double) (n1 + n2 + n3) / 3;
        System.out.printf("La media dei tre numeri è: %.2f", media);
    }
}
