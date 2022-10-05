package Behavioral.Visitor;

public class BlackFridayDiscountVisitor implements Visitor {
    @Override
    public double calculateDiscount(Shirt shirt) {
        return shirt.getCost()*0.4;
    }

    @Override
    public double calculateDiscount(Jeans jeans) {
        return jeans.getCost()*0.3;
    }

    @Override
    public double calculateDiscount(Jacket jacket) {
        return jacket.getCost()*0.35;
    }

    @Override
    public double calculateDiscount(Shorts shorts) {
        return shorts.getCost()*0.2;
    }
}
