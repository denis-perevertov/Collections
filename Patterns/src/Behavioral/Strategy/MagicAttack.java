package Behavioral.Strategy;

import java.util.Random;

public class MagicAttack implements AttackStrategy {

    public static double multiplier = 2.0;
    public static String name = "Magic";
    @Override
    public void attack(Enemy enemy) {
        System.out.println("Magic attack");
        System.out.println("Damaged for: " + (enemy.damage*multiplier));
    }

    @Override
    public boolean runAway(Enemy enemy) {
        int chance = (int) (new Random().nextDouble() * 100);
        if(chance%4==0) {
            System.out.println("Enemy ran away...");
            return true;
        }
        else return false;
    }
}
