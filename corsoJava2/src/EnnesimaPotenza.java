public class EnnesimaPotenza {
    public static int calcolaDieciAlla( int x, int n){
        int risultato = 0;

        if (n == 0){
            risultato = 1;
            return risultato;
        }
        if ( n >= 0){
            if (n % 2 == 0){
                risultato = 10 * (n/2);
            }
        }

        return risultato;
    }
}
