import java.util.ArrayList;

public class Magazzino {
    private ArrayList<Scarpe> scarpa;
    private ArrayList<Maglietta> maglietta;
    private ArrayList<Pantaloni> pantalone;

    public Magazzino(){
        scarpa = new ArrayList<Scarpe>();
        maglietta = new ArrayList<Maglietta>();
        pantalone = new ArrayList<Pantaloni>();
    }
    public ArrayList<Maglietta> getMaglietta() {
        return maglietta;
    }
    public ArrayList<Pantaloni> getPantalone() {
        return pantalone;
    }
    public ArrayList<Scarpe> getScarpa() {
        return scarpa;
    }
    public int giacenzaMaglietta(){
        return maglietta.size();
    }
    public int giacenzaScarpe(){
        return scarpa.size();
    }
    public int giacenzaPantaloni(){
        return pantalone.size();
    }
}
