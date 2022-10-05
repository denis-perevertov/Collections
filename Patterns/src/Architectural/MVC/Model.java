package Architectural.MVC;

import java.util.ArrayList;
import java.util.List;

public class Model {

    static List<Conversion> conversionList = new ArrayList<>();

    Model() {

    }

    static public void add (Conversion conversion) {
        conversionList.add(conversion);
    }



}
