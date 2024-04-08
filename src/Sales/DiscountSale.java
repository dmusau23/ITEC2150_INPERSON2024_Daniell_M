package Sales;

public class DiscountSale extends Sale{

    private double discountRate; //discount rate and it cannot be a negative value

    public DiscountSale(){
        super();
        discountRate = 0;
    }

    public DiscountSale(String name, double price, double dc) throws Exception{
        super(name,price);
        this.discountRate = dc;
    }

    public DiscountSale(DiscountSale dsObject){
        super(dsObject);
        this.discountRate = dsObject.discountRate;
    }


    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) throws Exception {
        if(discountRate < 0){
            throw new Exception("Discount rate cannot be a negative value");
        }else {
            this.discountRate = discountRate;
        }
    }

    /**
     * hoow to compute the total price after discount rate apply to the original
     * price * (price * discountRate)
     */

    public double totalPrice(){
        double newPrice = getPrice() - getPrice() * (discountRate/100);
        return newPrice;
    }

    public String toString(){
        return String.format("The %s's discount you will get is %.1f " +
                "and your sales price is %.2f",
                super.getName(),discountRate, totalPrice());
    }


}
