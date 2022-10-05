package Behavioral.Visitor;

public class NormalDiscountVisitor implements Visitor {

    @Override
    public double calculateDiscount(Shirt shirt) {
        return shirt.getCost()*0.1;
    }

    @Override
    public double calculateDiscount(Jeans jeans) {
        return jeans.getCost()*0.15;
    }

    @Override
    public double calculateDiscount(Jacket jacket) {
        return jacket.getCost()*0.1;
    }

    @Override
    public double calculateDiscount(Shorts shorts) {
        return shorts.getCost()*0.15;
    }

}
