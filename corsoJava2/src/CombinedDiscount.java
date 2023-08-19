public class CombinedDiscount extends DiscountPolicy{

    private DiscountPolicy discountAmount;
    private DiscountPolicy buyNGoodsGetOneFree;

    public CombinedDiscount(DiscountPolicy k, DiscountPolicy l){
        this.discountAmount = k;
        this.buyNGoodsGetOneFree = l;
    }

    public double calculateDiscount() {
        return 0;
    }
}
