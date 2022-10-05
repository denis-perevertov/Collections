package Architectural.MVC;

import java.util.List;

public class Controller {

    static double convert(int value, String initialType, String wantedType) {

        double conversionRate = 0.0;

        if(initialType.equalsIgnoreCase("dollar")) {
            switch(wantedType.toLowerCase()) {
                case "euro": conversionRate = 1.05; break;
                case "ruble": conversionRate = 60; break;
                case "hryvna": conversionRate = 40; break;
                default: conversionRate = 10; break;
            }
        }
        else if(initialType.equalsIgnoreCase("euro")) {
            switch(wantedType.toLowerCase()) {
                case "dollar": conversionRate = 0.95; break;
                case "ruble": conversionRate = 65; break;
                case "hryvna": conversionRate = 42; break;
                default: conversionRate = 10; break;
            }
        }
        else if(initialType.equalsIgnoreCase("ruble")) {
            switch(wantedType.toLowerCase()) {
                case "euro": conversionRate = 0.015; break;
                case "dollar": conversionRate = 0.016; break;
                case "hryvna": conversionRate = 1.5; break;
                default: conversionRate = 10; break;
            }
        }
        else if(initialType.equalsIgnoreCase("hryvna")) {
            switch(wantedType.toLowerCase()) {
                case "euro": conversionRate = 0.025; break;
                case "ruble": conversionRate = 0.67; break;
                case "dollar": conversionRate = 0.03; break;
                default: conversionRate = 10; break;
            }
        }

        double convertedValue = value*conversionRate;

        Model.add(new Conversion(value, initialType, wantedType, convertedValue));

        return convertedValue;
    }

    static void showConversions() {

        List<Conversion> convList = Model.conversionList;

        for(Conversion conversion : convList) {
            System.out.println(conversion.toString());
        }

    }

}
