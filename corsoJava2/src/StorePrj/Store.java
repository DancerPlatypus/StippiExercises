import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Store {
    private Date sellDate;
    private ArrayList<Sell> salesRegister;
    private ArrayList<Refound> refoundsRegister;
    private Warehouse warehouse;public void setSellDate (Date sellDate){
        this.sellDate = sellDate;
    }
    public void setSalesRegister (ArrayList <Sell> salesRegister){
        this.salesRegister = salesRegister;
    }
    public void setRefoundsRegister (ArrayList <Refound> refoundsRegister){
        this.refoundsRegister = refoundsRegister;
    }
    public void setWarehouse (Warehouse warehouse){
        this.warehouse = warehouse;
    }
    public Date getSellDate() {
        return sellDate;
    }
    public ArrayList<Sell> getSalesRegister() {
        return salesRegister;
    }
    public ArrayList<Refound> getRefoundsRegister() {
        return refoundsRegister;
    }
    public Warehouse getWarehouse(){
        return warehouse;
    }
    public Store(){
        sellDate = new Date();
        salesRegister = new ArrayList<Sell>();
        refoundsRegister = new ArrayList<Refound>();
        warehouse = new Warehouse();
    }
    public boolean answer(){
        Sell s = new Sell();
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Si desidera acquistare altri prodotti?");
        String answer = tastiera.nextLine();
        if (answer.equalsIgnoreCase("si")){
            salesRecord(s.getProductsAmount());
            return true;
        }
        return  false;
    }
    public void salesRecord(ArrayList<Products> products){
        Sell s = new Sell();
        int index = -1;
        for (Products p : products) {
            if (p instanceof Shirt) {
                index = warehouse.getShirts().indexOf(p);
                if (index >= 0) {
                    warehouse.getShirts().remove(p);
                    s.getProductsAmount().add(p);
                }
                else {
                    System.out.println("Non ci sono abbastanza magliette in magazzino");
                }
            }
            else if (p instanceof Trouser) {
                index = warehouse.getTrousers().indexOf(p);
                if (index >= 0) {
                    warehouse.getTrousers().remove(p);
                    s.getProductsAmount().add(p);
                }
                else {
                    System.out.println("Non ci sono abbastanza pantaloni in magazzino");
                }
            }
            else if (p instanceof Shoe) {
                index = warehouse.getShoes().indexOf(p);
                if (index >= 0) {
                    warehouse.getShoes().remove(p);
                    s.getProductsAmount().add(p);
                }
                else {
                    System.out.println("Non ci sono abbastanza scarpe in magazzino");
                }
            }
        }
    }
}
