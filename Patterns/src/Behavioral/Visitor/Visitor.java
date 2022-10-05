package Behavioral.Visitor;

public interface Visitor {

    public double calculateDiscount(Shirt shirt);
    public double calculateDiscount(Jeans jeans);
    public double calculateDiscount(Jacket jacket);
    public double calculateDiscount(Shorts shorts);


}
