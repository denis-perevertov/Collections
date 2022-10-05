package Behavioral.Visitor;

import java.awt.*;

public class VisitorDemo {

    public static void main(String[] args) {

        Shirt myShirt = new Shirt(100.0);
        Jeans myJeans = new Jeans(90.0);
        Jacket myJacket = new Jacket(140.0, Color.BLACK, "Patagonia");
        Shorts myShorts = new Shorts(85.0);
        
        Visitor normalDiscVisitor = new NormalDiscountVisitor();
        Visitor newYearsDiscVisitor = new NewYearsDiscountVisitor();
        Visitor blackFrDiscVisitor = new BlackFridayDiscountVisitor();

        System.out.println("Normal discount for this shirt is: "+myShirt.accept(normalDiscVisitor));
        System.out.println("Normal discount for this jeans is: "+myJeans.accept(normalDiscVisitor));
        System.out.println("Normal discount for this jacket is: "+myJacket.accept(normalDiscVisitor));
        System.out.println("Normal discount for this shorts is: "+myShorts.accept(normalDiscVisitor));

        System.out.println("");

        System.out.println("New Year's discount for this shirt is: "+myShirt.accept(newYearsDiscVisitor));
        System.out.println("New Year's discount for this jeans is: "+myJeans.accept(newYearsDiscVisitor));
        System.out.println("New Year's discount for this jacket is: "+myJacket.accept(newYearsDiscVisitor));
        System.out.println("New Year's discount for this shorts is: "+myShorts.accept(newYearsDiscVisitor));

        System.out.println("");

        System.out.println("Black Friday's discount for this shirt is: "+myShirt.accept(blackFrDiscVisitor));
        System.out.println("Black Friday's discount for this jeans is: "+myJeans.accept(blackFrDiscVisitor));
        System.out.println("Black Friday's discount for this jacket is: "+myJacket.accept(blackFrDiscVisitor));
        System.out.println("Black Friday's discount for this shorts is: "+myShorts.accept(blackFrDiscVisitor));

    }

}
