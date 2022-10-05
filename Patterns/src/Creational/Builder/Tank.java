package Creational.Builder;

public class Tank {

    public String name;
    public Turret turret;
    public Engine engine;
    public Hull hull;
    public Tracks tracks;
    public Barrel barrel;

    Tank() {}
    Tank(String name){
        this.name = name;
    }

    public void displayData(){
        float totalCost = this.turret.cost + this.engine.cost + this.hull.cost + this.tracks.cost + this.barrel.cost;
        float avgRating = (this.turret.rating + this.engine.rating + this.hull.rating + this.tracks.rating + this.barrel.rating)/5;
        System.out.println("=- TANK NAME: " + this.name + " -= \nCharacteristics:");
        System.out.printf("Hull: %s, age %d, rating %.2f\n",this.hull.type,this.hull.age,this.hull.rating);
        System.out.printf("Engine: %s, age %d, rating %.2f\n",this.engine.type,this.engine.age,this.engine.rating);
        System.out.printf("Turret: %s, age %d, rating %.2f\n",this.turret.type,this.turret.age,this.turret.rating);
        System.out.printf("Barrel: %s, age %d, rating %.2f\n",this.barrel.type,this.barrel.age,this.barrel.rating);
        System.out.printf("Tracks: %s, age %d, rating %.2f\n\n",this.tracks.type,this.tracks.age,this.tracks.rating);
        System.out.println("Total cost of the tank: " + Math.round(totalCost)+"$");
        System.out.printf("Average power rating: %.2f",avgRating);
    }


}
