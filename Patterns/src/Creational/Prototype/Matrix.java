package Creational.Prototype;

public class Matrix {

    public static void main(String[] args) {

        Agent smith = new AgentSmith();
        smith.setName("Smith");

        CloneCreator cloneCreator = new CloneCreator();

        Agent[] agentPile = cloneCreator.multiply(smith, 10);

        for(int i = 0; i < agentPile.length; i++){
            agentPile[i].hello();
        }
    }

}
