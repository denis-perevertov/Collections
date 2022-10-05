package Structural.Facade;

public class PartyPreparationFacade {

    House house;
    PS4 ps4;
    PopcornMachine machine;
    Salad salad;
    Fries fries;
    CocaCola cola;

    PartyPreparationFacade(House house,
                           PS4 ps4,
                           PopcornMachine machine,
                           Salad salad,
                           Fries fries,
                           CocaCola cola) {
        this.house = house;
        this.ps4 = ps4;
        this.machine = machine;
        this.salad = salad;
        this.fries = fries;
        this.cola = cola;
    }


    public void prepare() {
        house.clean();
        ps4.power();
        machine.preparePopcorn();
        salad.prepareSalad();
        fries.prepareFries();
        cola.open();
        cola.pour(5);
    }

    public void play() {
        ps4.play();
    }

    public void clean() {
        ps4.power();
        cola.close();
        house.clean();
        house.takeOutGarbage();
    }


}
