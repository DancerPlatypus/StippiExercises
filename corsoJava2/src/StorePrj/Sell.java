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
}
