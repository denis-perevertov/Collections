package Behavioral.Memento;

import java.util.Scanner;

public class MovesOriginator {

    private String state;

    private int moveNumber = 0;

    private String originMove;

    private String destinationMove;

    private String color;

    Caretaker caretaker;

    MovesOriginator(String color, Caretaker caretaker) {
        this.color = color;
        this.caretaker = caretaker;
    }

    public String getColor() {
        return color;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return color.toUpperCase() + " moved from "+originMove+" to "+destinationMove + " on move " + moveNumber;
    }

    public Memento save() {
        return new Memento(color, originMove, destinationMove, moveNumber);
    }

    public void getStateFromMemento(Memento memento) {
        color = memento.getColor();
        originMove = memento.getOriginMove();
        destinationMove = memento.getDestinationMove();
        moveNumber = memento.getMoveNumber();
    }

    public void move() {
        moveNumber++;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Move #"+moveNumber+" for "+this.getColor().toUpperCase());
        System.out.print("Move from: ");
        originMove = scanner.nextLine();
        System.out.print("Move to: ");
        destinationMove = scanner.nextLine();
        caretaker.add(this.save());

        System.out.println("\n"+this.getState()+"\n");
    }

    public void undoMove() {
        this.getStateFromMemento(caretaker.get(moveNumber-2));
        caretaker.remove(caretaker.get(moveNumber-1));
    }

    public void returnToCurrent() {
        this.getStateFromMemento(caretaker.get(caretaker.getMementoList().size()-1));
    }

}
