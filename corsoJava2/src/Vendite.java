import java.util.ArrayList;

public class Vendite {

    private double prezzo;
    private double sconto;
    private ArrayList <Prodotti> totaleProdotti;

    public Vendite(){
        prezzo = 0;
        sconto = 0;
        totaleProdotti = new ArrayList<Prodotti>();
    }
    public Vendite (double prezzo, double sconto, ArrayList<Prodotti> prodotti){
        this.prezzo = prezzo;
        this.sconto = sconto;
        this.totaleProdotti = prodotti;
    }
    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
    public void setSconto(double sconto) {
        this.sconto = sconto;
    }
    public void setTotaleProdotti(ArrayList<Prodotti> totaleProdotti) {
        this.totaleProdotti = totaleProdotti;
    }

    public double getPrezzo() {
        return prezzo;
    }
    public double getSconto() {
        return sconto;
    }
    public ArrayList<Prodotti> getTotaleProdotti() {
        return totaleProdotti;
    }
}
