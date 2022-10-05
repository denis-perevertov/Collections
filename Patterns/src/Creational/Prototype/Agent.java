package Creational.Prototype;

public abstract class Agent {

    public String name;
    public int age;

    Agent() {

    }

    Agent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Agent(Agent agent) {
        this(agent.name, agent.age);
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract Agent clone();

    public void hello() {

    }

}
