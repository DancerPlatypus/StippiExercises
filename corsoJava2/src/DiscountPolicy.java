public abstract class DiscountPolicy {
    private int goodsNumber;
    private int goodsPrice;
    public DiscountPolicy(){
        this.goodsNumber = 0;
        this.goodsPrice = 0;
    }
    public DiscountPolicy (int goods, int price){
        this.goodsNumber = goods;
        this.goodsPrice = price;
    }
    public void setGoodsNumber(int goodsNumber) {
        this.goodsNumber = goodsNumber;
    }
    public void setGoodsPrice(int goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public int getGoodsNumber() {
        return goodsNumber;
    }

    public int getGoodsPrice() {
        return goodsPrice;
    }

    public abstract double calculateDiscount();
}
