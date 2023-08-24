public class Scarpe extends Prodotti{
    private int taglia;
    public Scarpe(){
        super();
        taglia = 0;
    }
    public Scarpe(double prezzo, String colore, int newTaglia){
        super(prezzo, colore);
        taglia = newTaglia;
    }
    public void setTaglia(int taglia) {
        this.taglia = taglia;
    }
    public int getTaglia() {
        return taglia;
    }
    public double sconto() {
        return 0;
    }
}
