package Behavioral.Strategy;

public class BasicEnemy extends Enemy {

   BasicEnemy() {
       name = "Basic Enemy";
       damage = 10;
       attackType = new MeleeAttack();
   }

}
