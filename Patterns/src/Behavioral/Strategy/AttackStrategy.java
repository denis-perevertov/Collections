package Behavioral.Strategy;

public interface AttackStrategy {
    void attack(Enemy enemy);
    boolean runAway(Enemy enemy);

}
