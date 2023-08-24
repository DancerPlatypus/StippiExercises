package StorePrj;

public class Shoe extends Products{
    private String colour;
    private double price;
    private int size;
    public void setColour(String colour) {
        this.colour = colour;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setSize(char size) {
        this.size = size;
    }
    public String getColour() {
        return colour;
    }
    public double getPrice() {
        return price;
    }
    public int getSize() {
        return size;
    }
    public void printProducts() {
        System.out.println("Scarpe" + this.getBrand() + " " + size + " " + colour);;
    }

    public double makeDiscount() {
        return (price * (this.getDiscount()/100));
    }
}
