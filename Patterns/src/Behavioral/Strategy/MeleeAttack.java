package Behavioral.Strategy;

import java.util.Random;

public class MeleeAttack implements AttackStrategy {

    public static double multiplier = 1.0;
    public static String name = "Melee";
    @Override
    public void attack(Enemy enemy) {
        System.out.println("Melee attack!");
        System.out.println("Damaged for: " + (enemy.damage*multiplier));
    }

    @Override
    public boolean runAway(Enemy enemy) {
        int chance = (int) (new Random().nextDouble() * 100);
        System.out.println("chance = " + chance);
        if(chance%10==0) {
            System.out.println("Enemy ran away...");
            return true;
        }
        else return false;
    }
}
