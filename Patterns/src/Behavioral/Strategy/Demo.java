package Behavioral.Strategy;

public class Demo {

    public static void main(String[] args) {

        Enemy enemy = new BasicEnemy();

        enemy.attack();

        enemy.setAttackType(new RangedAttack());

        enemy.attack();

        enemy.setAttackType(new MagicAttack());

        enemy.attack();

        enemy.setAttackType(new NoAttack());

        enemy.attack();

    }

}
