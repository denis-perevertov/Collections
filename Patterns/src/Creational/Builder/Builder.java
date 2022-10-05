package Creational.Builder;

public interface Builder {

    public Builder setTurret(Turret turret);
    public Builder setEngine(Engine engine);
    public Builder setHull(Hull hull);
    public Builder setTracks(Tracks tracks);
    public Builder setBarrel(Barrel barrel);


}
