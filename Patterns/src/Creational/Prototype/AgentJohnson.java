package Creational.Prototype;

public class AgentJohnson extends Agent {

    AgentJohnson(AgentJohnson agent) {
        super(agent);
        this.name = "Smith";
    }

    @Override
    public Agent clone() {
        return new AgentJohnson(this);
    }
}
