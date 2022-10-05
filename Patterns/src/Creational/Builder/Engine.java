package Creational.Builder;

public class Engine {

    public final String type;
    public final float cost;
    public final float rating;
    public final int age;

    Engine(String type){
        this.type = type;
        switch(type){
            case "Abrams":
                this.rating = Abrams.rating;
                this.age = Abrams.age;
                this.cost = 1500.0f;
                break;
            case "T72":
                this.rating = T72.rating;
                this.age = T72.age;
                this.cost = 1000.0f;
                break;
            case "Leo2":
                this.rating = Leo2.rating;
                this.age = Leo2.age;
                this.cost = 1200.0f;
                break;
            default:
                this.rating = 8.0f;
                this.age = 30;
                this.cost = 1000.0f;
        }
    }

    public String getType() {
        return type;
    }

    public float getCost() {
        return cost;
    }

    public float getRating() {
        return rating;
    }

    public int getAge() {
        return age;
    }

}
