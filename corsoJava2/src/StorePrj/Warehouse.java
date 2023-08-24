import java.util.ArrayList;

public class Warehouse {
    private ArrayList<Shirt> shirts;
    private ArrayList<Trouser> trousers;
    private ArrayList<Shoe> shoes;
    public void setShirts(ArrayList<Shirt> shirts) {
        this.shirts = shirts;
    }
    public void setTrousers(ArrayList<Trouser> trousers) {
        this.trousers = trousers;
    }
    public void setShoes(ArrayList<Shoe> shoes) {
        this.shoes = shoes;
    }
    public ArrayList<Shirt> getShirts() {
        return shirts;
    }
    public ArrayList<Trouser> getTrousers() {
        return trousers;
    }
    public ArrayList<Shoe> getShoes() {
        return shoes;
    }
}
