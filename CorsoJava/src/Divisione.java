import java.util.Scanner;

public class Divisione {
    public boolean divisione(){
        System.out.println("Inserire due numeri da tastiera");
        Scanner tastiera = new Scanner(System.in);
        int x = tastiera.nextInt();
        int y = tastiera.nextInt();
        boolean a = x % y == 0;
        return a;
    }
}
