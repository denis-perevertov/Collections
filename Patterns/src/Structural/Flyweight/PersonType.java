package Structural.Flyweight;

public class PersonType {

    public String name;
    public int age;
    public String shirtColor;

    public PersonType(String name, int age, String color) {
        this.name = name;
        this.age = age;
        shirtColor = color;
    }

    @Override
    public String toString() {
        return "PersonType{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", shirtColor='" + shirtColor + '\'' +
                '}';
    }
}
