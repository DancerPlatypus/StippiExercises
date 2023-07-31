import java.util.Scanner;

public class RiscossioneAssegni {
    public void execute(){
        System.out.println("Il programma calcolerà le trattenute sull'importo alla riscossione dell'assegno");
        System.out.println("Inserire qui l'importo dell'assegno: ");
        Scanner tastiera = new Scanner(System.in);
        double importo = tastiera.nextDouble();
        double tassa;
        if (importo<=10) {
            tassa = 1;
            System.out.printf("Il costo del servizio è di € %.2f", tassa);
        }
        else if ((importo > 10) && (importo <= 100)) {
            tassa = importo * 0.10;
            System.out.printf("Il costo del servizio è di € %.2f", tassa);
        }
        else if((importo > 100) && (importo <= 1000)) {
            tassa = (importo * 0.05) + 5;
            System.out.printf("Il costo del servizio è di € %.2f", tassa);
        }
        else{
            tassa = (importo * 0.01) + 40;
            System.out.printf("Il costo del servizio è di € %.2f", tassa);
        }
    }
}
