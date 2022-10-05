package Behavioral.ChainOfResponsibility;

public class Manager extends RequestHandler{

    public Manager(RequestHandler nextHandler) {
        super(nextHandler);
    }

    public void process (Complaint complaint) {

        if(complaint.level == 2) {
            System.out.println("Manager handles a difficult complaint");
        }
        else super.process(complaint);

    }

}
