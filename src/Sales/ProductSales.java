package Sales;

public class ProductSales {
    public static void main(String[] args) throws Exception{
        Sale s1 = new Sale("power generator",10);
        DiscountSale ds = new DiscountSale("power generator",10,5);
//        System.out.println(s1.greaterThan(ds));
//        System.out.println(s1.lessThan(ds));
//        System.out.println(s1.equals(ds));
//        System.out.println(s1.equalDeals(ds));

//        if(s1.greaterThan(ds)){
//            System.out.println("Good deal");
//        }
//        else if(s1.lessThan(ds)) {
//            System.out.println("Bad deal");
//        }
        if(ds.greaterThan(s1)){
            System.out.println("Bad deal");
        }else{
            System.out.println("Good deal");
        }

    }
}
