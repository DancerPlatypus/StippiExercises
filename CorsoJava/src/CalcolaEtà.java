import java.util.Scanner;

public class CalcolaEtà {
    public void execute(){
        System.out.println("Verrà determinato l'anno in cui si festeggia il compleanno");
        System.out.println("Inserire qui l'età anagrafica e l'anno di nascita:");

        Scanner tastiera = new Scanner(System.in);
        int n = tastiera.nextInt();
        int anno = tastiera.nextInt();

        System.out.println("il tuo compleanno verrà festeggiato nell'anno:" + (anno+n) );
    }
}
