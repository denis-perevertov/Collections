package Behavioral.Strategy;

public class NoAttack implements AttackStrategy {

    public static double multiplier = 0.0;
    public static String name = "none";
    @Override
    public void attack(Enemy enemy) {
        System.out.println("No attack...");
    }

    @Override
    public boolean runAway(Enemy enemy) {
        System.out.println("-- Enemy runs away. --");
        return true;
    }
}
