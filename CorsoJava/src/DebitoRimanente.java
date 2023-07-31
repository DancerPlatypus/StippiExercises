import java.util.Scanner;
public class DebitoRimanente {
    public static final double tasso_di_interesse = 7.49;
    public void execute(){

        Scanner tastiera = new Scanner(System.in);
        System.out.println("Indicare la rata mensile ");
        double rata = tastiera.nextDouble();
        double debito_annuo= rata*12;
        double interesse_annuale = debito_annuo*tasso_di_interesse/100;
        double coperturaDebito = debito_annuo - interesse_annuale;
        System.out.println("L'interesse a debito è: " + interesse_annuale);
        System.out.println("L'ammontare dovuto per estinguere il debito è: " + coperturaDebito);


    }
}
