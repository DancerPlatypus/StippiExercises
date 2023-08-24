import java.util.ArrayList;
import java.util.Date;

public class Refound {
    Sell reference;
    ArrayList<Products> products;
    Date dayTime;
    public void setReference(Sell reference) {
        this.reference = reference;
    }
    public void setProducts(ArrayList<Products> products) {
        this.products = products;
    }
    public void setDayTime(Date dayTime) {
        this.dayTime = dayTime;
    }
    public Sell getReference() {
        return reference;
    }
    public ArrayList<Products> getProducts() {
        return products;
    }
    public Date getDayTime() {
        return dayTime;
    }
}
