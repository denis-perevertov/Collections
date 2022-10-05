package Behavioral.State;

public class StateDemo {

    public static void main(String[] args) {

        Human dima = new Human(new HomoSapiens(), "Dima");

        dima.getState();

        dima.devolve();
        dima.devolve();
        dima.devolve();

        dima.getState();

        dima.evolve();
        dima.evolve();
        dima.evolve();
        dima.evolve();
        dima.evolve();

        dima.getState();

    }

}

interface State {

    void evolve(Human human);
    void devolve(Human human);
    void getStatus();

}

class Dryopithecus implements State {


    @Override
    public void evolve(Human human) {
        human.setState(new Ramapithecus());
    }

    @Override
    public void devolve(Human human) {
        System.out.println("This is the most primitive stage of the human");
    }

    @Override
    public void getStatus() {
        System.out.println("Stage of evolution: Dryopithecus");
    }
}

class Ramapithecus implements State {


    @Override
    public void evolve(Human human) {
        human.setState(new Australopithecus());
    }

    @Override
    public void devolve(Human human) {
        human.setState(new Dryopithecus());
    }

    @Override
    public void getStatus() {
        System.out.println("Stage of evolution: Ramapithecus");
    }
}

class Australopithecus implements State {


    @Override
    public void evolve(Human human) {
        human.setState(new HomoErectus());
    }

    @Override
    public void devolve(Human human) {
        human.setState(new Ramapithecus());
    }

    @Override
    public void getStatus() {
        System.out.println("Stage of evolution: Australopithecus");
    }
}

class HomoErectus implements State {


    @Override
    public void evolve(Human human) {
        human.setState(new Neanderthal());
    }

    @Override
    public void devolve(Human human) {
        human.setState(new Australopithecus());
    }

    @Override
    public void getStatus() {
        System.out.println("Stage of evolution: Homo Erectus");
    }
}

class Neanderthal implements State {


    @Override
    public void evolve(Human human) {
        human.setState(new HomoSapiens());
    }

    @Override
    public void devolve(Human human) {
        human.setState(new HomoErectus());
    }

    @Override
    public void getStatus() {
        System.out.println("Stage of evolution: Neanderthal");
    }
}

class HomoSapiens implements State {


    @Override
    public void evolve(Human human) {
        human.setState(new SuperHuman());
    }

    @Override
    public void devolve(Human human) {
        human.setState(new Neanderthal());
    }

    @Override
    public void getStatus() {
        System.out.println("Stage of evolution: Homo Sapiens");
    }
}

class SuperHuman implements State {


    @Override
    public void evolve(Human human) {
        System.out.println("This is the most advanced stage of the human");
    }

    @Override
    public void devolve(Human human) {
        human.setState(new HomoSapiens());
    }

    @Override
    public void getStatus() {
        System.out.println("Stage of evolution: Super Human");
    }
}

class Human {

    private State state;

    private String name;

    Human(State state, String name) {
        this.state = state;
        this.name = name;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void devolve() {
        System.out.println("DE-EVOLUTION");
        state.devolve(this);
    }

    public void evolve() {
        System.out.println("EVOLUTION");
        state.evolve(this);
    }

    public void getState() {
        System.out.println("Info on " + this.name + ":");
        state.getStatus();
    }

}
