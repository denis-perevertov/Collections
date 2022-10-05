package Creational.Builder;

public class TankBuilder implements Builder {

    private Tank tank;

    TankBuilder(String name) {
        this.tank = new Tank(name);
    }

    public TankBuilder setTurret(Turret turret) {
        this.tank.turret = turret;
        return this;
    }

    public TankBuilder setEngine(Engine engine) {
        this.tank.engine = engine;
        return this;
    }

    public TankBuilder setHull(Hull hull) {
        this.tank.hull = hull;
        return this;
    }

    public TankBuilder setTracks(Tracks tracks) {
        this.tank.tracks = tracks;
        return this;
    }
    public TankBuilder setBarrel(Barrel barrel) {
        this.tank.barrel = barrel;
        return this;
    }

    public Tank build(){
        return this.tank;
    }
}
