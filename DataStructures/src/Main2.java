import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class Main2 {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        Random rand = new Random();

        for(int i = 0; i < 10000; i++) {
            list.add(rand.nextInt(0,20000));
        }

        ListIterator<Integer> listIterator = list.listIterator();

        LinkedList<Integer> list2 = new LinkedList<>(list);

        long start_time = System.currentTimeMillis();

        sortSimple(list);

        long end_time = System.currentTimeMillis();

        System.out.println("Sort took " + (end_time - start_time) + " ms");

        start_time = System.currentTimeMillis();

        sortWithIterator(list2);

        end_time = System.currentTimeMillis();

        System.out.println("Sort with iterator took " + (end_time - start_time) + " ms");

    }

    public static void sortSimple(List<Integer> list) {
        for(int i = 0; i < list.size(); i++) {
            int current = list.get(i);
            int min = current;
            int minIndex = 1;

            for(int j = i; j < list.size(); j++) {
                if(list.get(j) < min){
                    min = list.get(j);
                    minIndex = j;
                }
            }

            list.set(i, min);
            list.set(minIndex, current);
        }
    }

    public static void sortWithIterator(List<Integer> list) {
        ListIterator<Integer> iterator = list.listIterator();
        while(iterator.hasNext()) {
            ListIterator<Integer> minimal = getMinIterator(list, list.listIterator(iterator.nextIndex()));
            int current = iterator.next();
            iterator.set(minimal.next());
            minimal.set(current);
        }
    }

    public static ListIterator<Integer> getMinIterator (List<Integer> list, ListIterator<Integer> iterator) {
        ListIterator<Integer> minPosition = list.listIterator(iterator.nextIndex());
        int min = iterator.next();
        while(iterator.hasNext()) {
            int current = iterator.next();
            if(current < min) {
                min = current;
                while(minPosition.nextIndex() < iterator.nextIndex() - 1) {
                    minPosition.next();
                }
            }
        }
        return minPosition;
    }

}
