import java.util.Scanner;

public class Scelta {
    public void stampaScelta (){
        System.out.println("Inserire scelta");
        Scanner tastiera = new Scanner(System.in);
        char scelta = tastiera.next().charAt(0);
        switch (scelta){
            case 'a':
                System.out.println(scelta);
                break;
            case 'b':
                System.out.println(scelta);
                break;
            case 'c':
                System.out.println(scelta);
                break;
            case 'd':
                System.out.println(scelta);
                break;
            case 'e':
                System.out.println(scelta);
                break;
            default:
                System.out.println("ERROR");
                break;
        }
    }
}
