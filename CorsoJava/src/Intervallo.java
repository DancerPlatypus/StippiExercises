import java.util.Scanner;

public class Intervallo {
    public void execute(){
        System.out.println("Dati due numeri interi n, m il programma calcolerà e mostrerà a schermo i numeri interi contenuti nell'intervallo");

        Scanner tastiera = new Scanner(System.in);
        int n = tastiera.nextInt();
        int m = tastiera.nextInt();
        int i;
        int tmp;
        if (m<n){
            tmp = n;
            n = m;
            m = tmp;
        }
        if (n==m){
            System.out.println("Non ci sono numeri nell'intervallo");
        }
        else {
            System.out.println("I numeri interi contenuti nell'intervallo sono:");
        }
        for(i=n; i<=m; i++){
                System.out.println(i);
        }
    }
}
