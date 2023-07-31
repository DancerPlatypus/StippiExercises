import java.util.Scanner;

public class OdioAmore {
    public void execute(){
        System.out.println("Il programma legge una riga di testo e sostituisce la prima occorrenza della parola odio con amore");
        System.out.println("Scrivi una riga di testo");
        Scanner tastiera = new Scanner(System.in);
        String s = tastiera.nextLine();
        int odio = s.indexOf("odio");
        int odiolengh = "odio".length();
        String sub1 = s.substring(0,odio);
        String sub2 = s.substring(odio + odiolengh, s.length());
        String nuovaStringa = sub1 + "amo" + sub2;
        System.out.println(nuovaStringa);
    }
}
