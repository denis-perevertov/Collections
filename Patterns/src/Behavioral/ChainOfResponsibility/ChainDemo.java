package Behavioral.ChainOfResponsibility;

public class ChainDemo {

    public static void main(String[] args) {

        Chain chain = new Chain();

        Complaint complaint = new Complaint("None", 0);

        chain.process(complaint);

        complaint = new Complaint("Wrong change", 1);

        chain.process(complaint);

        complaint = new Complaint("Poor service", 2);

        chain.process(complaint);

        complaint = new Complaint("Accusation of fraud", 3);

        chain.process(complaint);

        complaint = new Complaint("FBI Inspection", 4);

        chain.process(complaint);
    }
}
