package Behavioral.Memento;

public class Memento {

    private String color;
    private String originMove;
    private String destinationMove;
    private int moveNumber;

    public Memento(String color, String originMove, String destinationMove, int moveNumber) {
        this.color = color;
        this.originMove = originMove;
        this.destinationMove = destinationMove;
        this.moveNumber = moveNumber;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOriginMove() {
        return originMove;
    }

    public String getDestinationMove() {
        return destinationMove;
    }

    public int getMoveNumber() {
        return moveNumber;
    }
}
