package Structural.Facade;

public class Demo {


    public static void main(String[] args) {

        House house = new House();
        PS4 ps4 = new PS4(3);
        PopcornMachine machine = new PopcornMachine();
        Salad salad = new Salad();
        Fries fries = new Fries();
        CocaCola cola = new CocaCola(500);

        PartyPreparationFacade facade = new PartyPreparationFacade(house, ps4, machine, salad, fries, cola);
        facade.prepare();
        facade.play();
        facade.clean();

    }



}
