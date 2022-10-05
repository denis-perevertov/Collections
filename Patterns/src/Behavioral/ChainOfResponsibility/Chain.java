package Behavioral.ChainOfResponsibility;

public class Chain {

    RequestHandler handler;

    public Chain() {
        handler = new Cashier(new Manager(new CEO(null)));
    }

    public void process(Complaint complaint) {
        handler.process(complaint);
    }

}
