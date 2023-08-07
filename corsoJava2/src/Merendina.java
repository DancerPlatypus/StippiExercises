public class Merendina {
    private String codice;
    private float prezzo;

    public Merendina (String codice,float prezzo){
        this.codice = codice;
        this.prezzo = prezzo;
    }
    public float getPrezzo() {
        return prezzo;
    }
    public String getCodice(){
        return codice;
    }

    public void stampaMerendina(){
        System.out.println("Il codice è: " + codice);
        System.out.println("Il prezzo della merendina è: " + prezzo);
    }
}
