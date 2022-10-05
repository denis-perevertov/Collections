package Behavioral.Strategy;

import java.util.Random;

public class Enemy {

    public String name;
    public int damage;
    public AttackStrategy attackType;

    Enemy() {
        name = "Default";
        damage = 10;
        attackType = new MeleeAttack();
    }

    Enemy(String name, int damage) {
        this.name = name;
        this.damage = damage;
        attackType = new MeleeAttack();
    }

    public void attack() {
        if(attackType.runAway(this)) return;
        double delta = new Random().nextDouble()*3;
        this.damage -= delta;
        attackType.attack(this);
        this.damage += delta;
    }

    public void setAttackType(AttackStrategy attackType){
        this.attackType = attackType;
        System.out.println("Attack Type changed to: " + attackType.getClass().getName());
    }
}
