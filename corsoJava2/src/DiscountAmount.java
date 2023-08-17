public class DiscountAmount extends DiscountPolicy{

    private int minimum;
    private double percentage;

    public  DiscountAmount(){
        this.minimum = 0;
        this.percentage = 0;
    }

    public DiscountAmount(int min, double percent){
        this.minimum = min;
        this.percentage = percent;
    }

    public double calculateDiscount() {
        double finalPrice = 0;
        if(getGoodsNumber()>minimum){
            finalPrice = ((getGoodsPrice() * percentage) / 100);
        }
        return finalPrice;
    }
}
