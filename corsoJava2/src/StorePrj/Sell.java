package StorePrj;

import java.util.ArrayList;
import java.util.Date;

public class Sell {
    private ArrayList<Products> productsAmount;
    Date dayTime;
    public void setProductsAmount(ArrayList<Products> productsAmount) {
        this.productsAmount = productsAmount;
    }
    public void setDayTime(Date dayTime) {
        this.dayTime = dayTime;
    }
    public ArrayList<Products> getProductsAmount() {
        return productsAmount;
    }
    public Date getDayTime() {
        return dayTime;
    }

    public void makeReceipt(){
        for (Products p: productsAmount){
            System.out.println("DESCRIZIONE " + " " + "PREZZO");
            if(p instanceof Shirt){
                p.printProducts();
                System.out.print(" " + p.getPrezzo());
            }
            else if(p instanceof Trouser){
                p.printProducts();
                System.out.print(" " + p.getPrezzo());
            }
            else if(p instanceof  Shoe){
                p.printProducts();
                System.out.print(" " + p.getPrezzo());
            }
        }
        System.out.print("TOTALE COMPLESSIVO: " + getSubTotal());
        System.out.print(dayTime);
    }
    public double getSubTotal(){
        double subtotal = 0;
        for (Products p: productsAmount) {
            if (p instanceof Shirt){
                subtotal = subtotal + ((Shirt) p).getPrice();
            }
            else if(p instanceof Trouser){
                subtotal = subtotal + ((Trouser) p).getPrice();
            }
            else if (p instanceof  Shoe){
                subtotal = subtotal + ((Shoe) p).getPrice();
            }
        }
        return subtotal;
    }
    public boolean equals(Sell sell) {
        if(dayTime == sell.getDayTime()){
            for (int i = 0; i<sell.productsAmount.size(); i++){
                if(sell.productsAmount.indexOf(i) == productsAmount.indexOf(i)){
                    return true;
                }
            }
        }
        return false;
    }
}
