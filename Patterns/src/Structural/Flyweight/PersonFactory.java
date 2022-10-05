package Structural.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class PersonFactory {

    public static Map<String, PersonType> personTypes = new HashMap<>();

    public static PersonType getType (String name, int age, String color) {
        PersonType person = personTypes.get(name);
        if(person == null) {
            person = new PersonType(name, age, color);
            personTypes.put(name, person);
        }
        return person;
    }
}
