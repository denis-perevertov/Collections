package Creational.Prototype;

public class AgentBrown extends Agent {

    AgentBrown(AgentBrown agent) {
        super(agent);
        this.name = "Brown";
    }

    @Override
    public Agent clone() {
        return new AgentBrown(this);
    }
}
