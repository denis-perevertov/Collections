package Creational.Prototype;

public class CloneCreator {

    public Agent[] multiply(Agent agent, int amount) {
        Agent[] array = new Agent[amount];
        for(int i = 0; i < array.length; i++) {
            array[i] = agent.clone();
        }
        System.out.println("Made "+amount+" clones");
        return array;
    }

}
