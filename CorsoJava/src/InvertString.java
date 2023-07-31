public class InvertString {
    public String Invert (String stringToInvert){
        String s = "";
        int l = stringToInvert.length();
        char m;
        for (int i = 0; i < l; i++){
            m = stringToInvert.charAt(i); //carattere alla posizione i
            s = m + s; // NON VALE LA PROPRIETà COMMUTATIVA NELLA SOMMA DI STRINGHE, IL CARATTERE m VIENE AGGIUNTO ALL'INIZIO DELLA NUOVA STRINGA s
        }
        System.out.println(s);
        return s;
    }
}
