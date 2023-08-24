public abstract class Prodotti {
    private double prezzo;

    private String colore;
    public Prodotti(){
        prezzo = 0;
        String colore = null;
    }
    public Prodotti (double newPrezzo, String newColore){
        this.prezzo = newPrezzo;
        this.colore= newColore;
    }
    public void setColore(String colore) {
        this.colore = colore;
    }
    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
    public String getColore() {
        return colore;
    }
    public double getPrezzo() {
        return prezzo;
    }
    public abstract double sconto();
}
