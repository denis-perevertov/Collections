package Behavioral.ChainOfResponsibility;

public class Cashier extends RequestHandler {


    public Cashier(RequestHandler nextHandler) {
        super(nextHandler);
    }

    public void process (Complaint complaint) {

        if(complaint.level == 0) {
            System.out.println("No complaints, all is good");
        }
        else if (complaint.level == 1) {
            System.out.println("Cashier handles basic complaint");
        }
        else super.process(complaint);

    }
}
