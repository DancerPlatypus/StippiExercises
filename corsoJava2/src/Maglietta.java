public class Maglietta extends Prodotti{
    private char taglia;
    public Maglietta(){
        super();
        taglia = ' ';
    }
    public Maglietta(double prezzo, String colore, char newTaglia){
        super(prezzo, colore);
        taglia = newTaglia;
    }
    public void setTaglia(char taglia) {
        this.taglia = taglia;
    }
    public char getTaglia() {
        return taglia;
    }


    public double sconto() {
        return 0;
    }
}
