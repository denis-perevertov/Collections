package Structural.Flyweight;

import java.util.Objects;

public class SportsFan {

    public int row;
    public int col;
    public PersonType type;

    public SportsFan(int row, int col, PersonType type) {
        this.row = row;
        this.col = col;
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SportsFan sportsFan = (SportsFan) o;
        return row == sportsFan.row && col == sportsFan.col && Objects.equals(type, sportsFan.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(row, col, type);
    }

    @Override
    public String toString() {
        return "SportsFan{" +
                "row=" + row +
                ", col=" + col +
                ", type=" + type +
                '}';
    }
}
