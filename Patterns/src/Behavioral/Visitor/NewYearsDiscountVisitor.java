package Behavioral.Visitor;

public class NewYearsDiscountVisitor implements Visitor {

    @Override
    public double calculateDiscount(Shirt shirt) {
        return shirt.getCost()*0.2;
    }

    @Override
    public double calculateDiscount(Jeans jeans) {
        return jeans.getCost()*0.2;
    }

    @Override
    public double calculateDiscount(Jacket jacket) {
        return jacket.getCost()*0.22;
    }

    @Override
    public double calculateDiscount(Shorts shorts) {
        return shorts.getCost()*0.4;
    }

}
