package Behavioral.Strategy;

import java.util.Random;

public class RangedAttack implements AttackStrategy {

    public static double multiplier = 0.75;
    public static String name = "Ranged";
    @Override
    public void attack(Enemy enemy) {
        System.out.println("Ranged attack!");
        System.out.println("Damaged for: " + (enemy.damage*multiplier));
    }

    @Override
    public boolean runAway(Enemy enemy) {
        int chance = (int) (new Random().nextDouble() * 100);
        if(chance%2==0) {
            System.out.println("Enemy ran away...");
            return true;
        }
        else return false;
    }
}
