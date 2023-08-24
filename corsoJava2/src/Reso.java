import java.util.ArrayList;
import java.util.Date;

public class Reso {
    private Date dataReso;
    private Vendite venditaRef;
    private ArrayList<Prodotti> totaleResi;
    public Reso (){
        dataReso = new Date();
        venditaRef = null;
        totaleResi = new ArrayList<Prodotti>();
    }
    public void setVenditaRef(Vendite venditaRef) {
        this.venditaRef = venditaRef;
    }
    public void setDataReso(Date dataReso) {
        this.dataReso = dataReso;
    }
    public void setTotaleResi(ArrayList<Prodotti> totaleResi) {
        this.totaleResi = totaleResi;
    }
    public Date getDataReso() {
        return dataReso;
    }
    public Vendite getVenditaRef() {
        return venditaRef;
    }
    public ArrayList<Prodotti> getTotaleResi() {
        return totaleResi;
    }
}
