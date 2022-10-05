import java.util.ArrayList;
import java.util.List;

public class MyGenericClass<T> {

    private List<T> myList;

    MyGenericClass() {
        myList = new ArrayList<>();
    }

    public void add(T t) {
        myList.add(t);
    }

    public List<T> getList() {
        return myList;
    }

}
