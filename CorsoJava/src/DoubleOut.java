public class DoubleOut {
    public static void scrivi(double somma){
        if(somma >= 0){
            System.out.print('E');
            scriviPositivo(somma);
        }
        else {
            double sommaPositiva = - somma;
            System.out.print('E');
            System.out.print('-');
            scriviPositivo(sommaPositiva);
        }
    }

    public static void scriviPositivo(double somma){
        int centesimiTotali = (int) Math.round(somma * 100);
        int euro = centesimiTotali/100;
        int centesimi = centesimiTotali%100;
        System.out.print(euro);
        System.out.print('.');
        if (centesimi<10){
            System.out.print('0');
        }
        System.out.print(centesimi);
    }

    public static void scriviRiga (double somma){
        scrivi(somma);
        System.out.print('\n');
    }
    private static void scriviScientifico(double somma){
        if (somma > 0){
            System.out.print("\t");
        }
        else {
            System.out.print("\t-");
            somma = - somma;
        }
        int counter = 0;
        boolean sumCk = somma > 1;
        if(sumCk){
            while ( somma > 10 ){
                somma = somma / 10;
                counter ++;
            }
        }
        else {
            while (somma < 10 ){
                somma = somma * 10;
                counter ++;
            }

        }
        System.out.printf("%.2f",somma);
        System.out.print('E');
        if(!sumCk)
            System.out.print('-');
        System.out.print(counter);
    }
    public static void scriviScientificoNuovaRiga(double somma){
        scriviScientifico(somma);
        System.out.print('\n');
    }
}
