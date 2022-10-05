package Structural.Adapter;

public class PlaygroundDemo {

    public static void main(String[] args) throws InterruptedException{

        Phone realme6Pro = new Smartphone();

        Computer hppavillion13 = new Laptop();

        Phone adapter = new PhoneAdapter(hppavillion13);

        System.out.println("Calling from a mobile phone\n");
        realme6Pro.call();
        Thread.sleep(2000);
        System.out.println("\nVideocall from a computer");
        hppavillion13.telegramCall();
        Thread.sleep(2000);
        System.out.println("\nCalling from adapter");
        adapter.call();
        System.out.println("\n");
        Thread.sleep(2000);

//        realme6Pro.unlock();
//        System.out.println("");
//        Thread.sleep(2000);
//
//        adapter.unlock();

    }

}
