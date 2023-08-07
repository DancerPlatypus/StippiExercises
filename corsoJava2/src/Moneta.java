public class Moneta {
    private int quantita;
    private float valore;
    public Moneta(int quantita, float valore){
        this.quantita = quantita;
        this.valore = valore;
    }
    public void stampaMoneta(){
        if (quantita != 0) {
            System.out.println(quantita + " " + valore);
        }
    }
}
