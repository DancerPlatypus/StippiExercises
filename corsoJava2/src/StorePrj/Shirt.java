package StorePrj;

public class Shirt extends Products{
    private String colour;
    private double price;
    private char size;
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
    public char getSize() {
        return size;
    }
    public void printProducts() {
        System.out.println("Maglietta" + this.getBrand() + " " + size + " " + colour);
    }
    public double makeDiscount() {
        return (price * (this.getDiscount()/100));
    }
}
