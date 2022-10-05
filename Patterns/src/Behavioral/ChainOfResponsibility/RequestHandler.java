package Behavioral.ChainOfResponsibility;

public abstract class RequestHandler {

    public RequestHandler nextHandler;

    public RequestHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void process (Complaint complaint) {
        if(nextHandler != null) {
            nextHandler.process(complaint);
        }
    }

}
