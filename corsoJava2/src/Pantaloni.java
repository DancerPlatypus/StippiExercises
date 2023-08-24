public class Pantaloni extends Prodotti{

    private int taglia;
    public Pantaloni(){
        super();
        taglia = 0;
    }
    public Pantaloni(double prezzo, String colore, int newTaglia){
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
