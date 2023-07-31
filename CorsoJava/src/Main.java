// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner tastiera = new Scanner(System.in);

      /*
       System.out.println("Inserire la propria data di nascita: ");
       int day = tastiera.nextInt();
       int month= tastiera.nextInt();
       int year = tastiera.nextInt();
       Zodiac z = new Zodiac();
       String sign = z.determinateZodiacSign(month, day);
        if (sign.isEmpty()) {
            System.out.println("ERRORE");
        } else {
            System.out.println("il tuo segno zodiacale è : " + sign);
        }










       /* double test = tastiera.nextDouble();
       DoubleOut.scriviScientificoNuovaRiga(test);
















































       /*    System.out.println("inserire un valore n");
       int conteggio = tastiera.nextInt();
       Bibita b = new Bibita();
       System.out.println(b.CalcolaPrezzo(conteggio));





























       /* System.out.println("Inserire una stringa");
       String input = tastiera.nextLine();
       InvertString is = new InvertString();
       String output = is.Invert(input);
       System.out.println(output);




















































       /*System.out.println("Per ciascun lancio della moneta scrivi t per testa e c per croce");
       LancioMoneta lm = new LancioMoneta();
       char lancio;
       double pTeste, pCroce;
       int t = 0;
       int c = 0;
       for( int n = 1; n <= 8; n++){
           System.out.println( n +"esimo lancio");
           lancio = tastiera.next().charAt(0);
           if ( lancio == 't' || lancio == 'T'){
               t = t + 1;
               // System.out.println(t);
           } else if (lancio == 'c' || lancio == 'C') {
               c = c + 1;
               // System.out.println(c);
           } else {
               System.out.println("ERROR");
           }
       }
       //System.out.println(c);
       // System.out.println(t);
       // pTeste = ((double) t / 8) *100;
       // pCroce = ((double) c / 8) *100;
       pTeste = lm.calcolaT(t);
       pCroce = lm.calcolaC(c);

       System.out.println("La percentuale di teste è di " + pTeste);
       System.out.println("La percentuale di teste è di " + pCroce);







































        /*
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserire qui un numero n intero positivo");
        System.out.println("Il programma calcolerà la somma dei numeri interi dispari");
        int n = tastiera.nextInt();

        SumOddNum sum = new SumOddNum();
        int somma = sum.Sum(n);
        System.out.println("La somma dei numeri dispari fino ad n vale: " + somma);













*/


    System.out.println("Indicare il peso qui: ");
    double peso = tastiera.nextDouble();
    System.out.println("Indicare l'altezza qui: ");
    double altezza = tastiera.nextDouble();
    System.out.println("Indicare l'età qui: ");
    int eta = tastiera.nextInt();
    System.out.println("Indicare il sesso qui: ");
    String sesso = tastiera.next();
    sesso = sesso.toLowerCase();
    System.out.println("Indicare il numero di volte alla settimana in cui si svolge attività fisica");
    int attivita = tastiera.nextInt();
    HarrisBenedictEquation hbe = new HarrisBenedictEquation();
    double calories = hbe.calories(peso, altezza, eta, sesso);//PRIMO METODO

    double MetBas = calories;
    double caloriefinali = hbe.newCalories (attivita,MetBas); //SECONDO METODO (calcolare le cal in base ad attività)
    caloriefinali = (int) Math.round(caloriefinali);
    int quantita = (int) (caloriefinali / 230);
    quantita = quantita % 230;

    System.out.println("Il tuo metabolismo basale è di " + caloriefinali + " calorie");
    System.out.println("Che corrispondono a circa " + quantita + " barrette di cioccolato da 230cal l'una.");


    }
}
