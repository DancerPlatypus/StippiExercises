import java.util.Scanner;
public class Concat_stringhe {
    public void execute(){

        System.out.println("Il programma visualizzerà la concatenazione di due stringhe e la loro relativa lunghezza");
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserire due stringhe");

        String s1 = tastiera.next();
        String s2 = tastiera.next();

        System.out.println(s1);
        System.out.println("la lunghezza della prima stringa è: " + s1.length());
        System.out.println(s2);
        System.out.println("la lunghezza della seconda stringa è: " + s2.length());

        System.out.println("Ora verranno visualizzate le due stringhe concatenate tra loro sulla stessa riga");
        String s3 = s1.concat(" " + s2);
        System.out.println(s3);
        System.out.println("la lunghezza della concatenazione delle prime due stringhe è: " + s3.length());
    }
}
