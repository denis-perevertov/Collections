package Structural.Proxy;

public class Client {

    public String name;
    public String profession;
    public int age;
    public double rating;

    public Client() {
    }

    public Client(String name) {
        this.name = name;
    }

    public Client(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Client(String name, String profession, int age, double rating) {
        this.name = name;
        this.profession = profession;
        this.age = age;
        this.rating = rating;
    }


}
