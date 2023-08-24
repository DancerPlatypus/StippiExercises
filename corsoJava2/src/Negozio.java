
import java.util.*;
public class Negozio {

    private Date dataVendita;
    private ArrayList<Vendite> registroVendite;
    private ArrayList<Reso> registroResi;
    private Magazzino magazzino;

    public void setMagazzino(Magazzino magazzino) {
        this.magazzino = magazzino;
    }
    public void setRegistroVendite(ArrayList<Vendite> registroVendite) {
        this.registroVendite = registroVendite;
    }
    public void setRegistroResi(ArrayList<Reso> registroResi) {
        this.registroResi = registroResi;
    }
    public void setDataVendita(Date dataVendita) {
        this.dataVendita = dataVendita;
    }
    public Magazzino getMagazzino() {
        return magazzino;
    }
    public Date getDataVendita() {
        return dataVendita;
    }
    public ArrayList<Reso> getRegistroResi() {
        return registroResi;
    }
    public ArrayList<Vendite> getRegistroVendite() {
        return registroVendite;
    }
    public Negozio(){
       dataVendita = new Date();
       registroVendite = new ArrayList<Vendite>();
       registroResi = new ArrayList<Reso>();
       magazzino = new Magazzino();
   }
    public boolean risposta(){
       Scanner tastiera = new Scanner(System.in);
       System.out.println("Si desidera acquistare altri prodotti?");
        String risposta = tastiera.nextLine();
        if(risposta.equalsIgnoreCase("si")){
            aggiungiProdotto();
            return true;
        }
        return false;
    }
    public ArrayList<Vendite> aggiungiProdotto(){
        Vendite v = new Vendite();
        if(risposta()){
            RegistraVendita(v.getTotaleProdotti());
        }
        return registroVendite;
    }


    public void RegistraVendita(ArrayList<Prodotti> prodotti){
        Vendite v = new Vendite();
        int index= -1;
        for (Prodotti p: prodotti) {
           if(p instanceof Maglietta){
                index = magazzino.getMaglietta().indexOf(p);
                if(index>=0){
                    magazzino.getMaglietta().remove(p);
                    v.getTotaleProdotti().add(p);
                }
                else {
                    System.out.println("Non ci sono abbastanza magliette in magazzino");
                }
           }
           else if (p instanceof Pantaloni) {
               index = magazzino.getPantalone().indexOf(p);
               if(index >= 0){
                   magazzino.getPantalone().remove(p);
                   v.getTotaleProdotti().add(p);
               }
               else {
                   System.out.println("Non ci sono abbastanza pantaloni in magazzino");
               }
           }
           else if (p instanceof Scarpe){
               index = magazzino.getScarpa().indexOf(p);
               if (index >= 0){
                   magazzino.getScarpa().remove(p);
                   v.getTotaleProdotti().add(p);
               }
               else {
                   System.out.println("Non ci sono abbastanza scarpe in magazzino");
               }
           }
        }
    }
    public void RegistraResi(ArrayList<Prodotti> prodotti, Vendite vendita){
        Reso r = new Reso();
        for (Prodotti p: prodotti){
            if(p instanceof Maglietta){
                    magazzino.getMaglietta().add((Maglietta) p);
                    v.getTotaleProdotti().remove(p);

        }

    }
}

