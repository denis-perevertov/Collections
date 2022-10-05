package Behavioral.Memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {

    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento memento) {
        mementoList.add(memento);
    }

    public void remove(Memento memento) {
        mementoList.remove(memento);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }

    public List<Memento> getMementoList() {
        return mementoList;
    }

}
