package Behavioral.ChainOfResponsibility;

public class CEO extends RequestHandler {


    public CEO(RequestHandler nextHandler) {
        super(nextHandler);
    }

    public void process (Complaint complaint) {

        if(complaint.level == 3) System.out.println("CEO handles a very serious complaint");
        if(complaint.level > 3 || complaint.description.equals("FBI Inspection")) System.out.println("Can't handle that");

        else super.process(complaint);

    }
}
