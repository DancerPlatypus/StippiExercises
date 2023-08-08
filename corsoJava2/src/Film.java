import java.util.Scanner;

public class Film {

    private String titolo;
    private String classificazioneMPAA;

    private int[] numeroPersone;

    private int[] valutazione;

    public Film(String titolo, String classificazioneMPAA){
        this.titolo = titolo;
        this.classificazioneMPAA = classificazioneMPAA;
        this.valutazione = new int[] {1, 2, 3, 4, 5};
        this.numeroPersone = new int[this.valutazione.length];
    }

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
    public String getTitolo(){
        return this.titolo;
    }

    public int[] getValutazione(){
        return this.valutazione;
    }

    public int[] getNumeroPersone(){
        return this.numeroPersone;
    }

    public void modificaNumeroPersone(){
        Scanner tastiera = new Scanner(System.in);
        for (int i = 0; i<numeroPersone.length; i++){
            System.out.println("Quante persone hanno dato la valutazione " + (i+1) + " al film?");
            numeroPersone[i] = tastiera.nextInt();
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
