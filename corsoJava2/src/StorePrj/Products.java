public abstract class Products {
    private String brand;
    public abstract void printProducts();
    public abstract double makeDiscount();
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }
}
