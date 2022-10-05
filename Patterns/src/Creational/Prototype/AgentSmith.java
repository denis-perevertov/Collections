package Creational.Prototype;

public class AgentSmith extends Agent {

    AgentSmith() {
        super();
    }

    AgentSmith(AgentSmith agent) {
        super(agent);
        this.name = "Smith";
    }

    @Override
    public Agent clone() {
        return new AgentSmith(this);
    }

    public void hello(){
        System.out.println("Hello Mr Anderson");
    }
}
