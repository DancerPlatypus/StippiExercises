public class Film {

    private String titolo;
    private String classificazioneMPAA;

    private int[] numeroPersone;

    private int[] valutazione;

    public void setTitolo(String titolo){
        this.titolo = titolo;
    }
    public void setClassificazioneMPAA(String classificazione){
        this.classificazioneMPAA = classificazione;
    }
    public void setNumeroPersone(int[] persone){
        this.numeroPersone = persone;
    }
    public void setValutazione (){
        this.valutazione = new int[] {1, 2, 3, 4, 5};
    }
    public void aggiungiValutazione(int voto){
        if((voto>0) && (voto<=5)){
            this.numeroPersone[voto-1]++;
        }
    }
    public double getMedia(){
        double media = 0;
        int den = 0;
        for (int i = 0; i<valutazione.length; i++){
            den += numeroPersone[i];
            media += ((valutazione[i] * numeroPersone[i]));
        }
        media = media/den;
        return media;
    }
}
