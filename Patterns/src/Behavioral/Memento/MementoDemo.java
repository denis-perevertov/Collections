package Behavioral.Memento;

public class MementoDemo {

    public static void main(String[] args) {


        Caretaker caretaker1 = new Caretaker();

        MovesOriginator originator1 = new MovesOriginator("White", caretaker1);

        Caretaker caretaker2 = new Caretaker();

        MovesOriginator originator2 = new MovesOriginator("Black", caretaker2);

        for(int i = 0; i < 2; i++) {

            originator1.move();

            originator2.move();

        }

        System.out.println("Current state for " + originator1.getColor() + ": " + originator1.getState());

        System.out.println("Current state for " + originator2.getColor() + ": " + originator2.getState());

        originator1.getStateFromMemento(caretaker1.get(0));

        System.out.println("First saved state for " + originator1.getColor() + ": " + originator1.getState());

        originator1.returnToCurrent();

        System.out.println("Current state for " + originator1.getColor() + ": " + originator1.getState());

        originator1.undoMove();
        originator2.undoMove();

        System.out.println("MOVE UNDONE");

        System.out.println("Current state for " + originator1.getColor() + ": " + originator1.getState());


    }

}
