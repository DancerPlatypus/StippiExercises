public class BuyNGoodsGetOneFree extends DiscountPolicy{

    private int number;

    public BuyNGoodsGetOneFree(){
        this.number = 0;
    }
    public BuyNGoodsGetOneFree(int n){
        this.number = n;
    }
    public double calculateDiscount() {
        double finalPrice = 0;
        if(number>0 && number<3){
            finalPrice = this.getGoodsPrice();
        }
        else if (number>= 3 && number<6) {
            finalPrice = ((this.getGoodsPrice() * 10)/100);
        }
        else if (number>=6 && number<8) {
            finalPrice = ((this.getGoodsPrice() * 20)/100);
        }
        else {
            System.out.println("Troppi articoli selezionati!");
        }
        return finalPrice;
    }
}
