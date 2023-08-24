package StorePrj;

public abstract class Products {
    private double prezzo;
    private double discount;
    private String brand;
    public void setDiscount(double discount) {
        this.discount = discount;
    }
    public double getDiscount() {
        return discount;
    }
    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
    public double getPrezzo() {
        return prezzo;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }
    public abstract void printProducts();
    public abstract double makeDiscount();
}
