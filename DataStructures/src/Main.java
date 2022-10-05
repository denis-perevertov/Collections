import com.sun.source.tree.Tree;

import java.util.*;

public class Main {




    public static void main(String[] args) {

        //----------------------
        // equals, hashcode

        MyObject object1 = new MyObject("Denis", 16);
        MyObject object2 = new MyObject("Denis", 16, "Odesa", true, false, true);
        MyObject object3 = new MyObject("Alena", 18);

        System.out.println(object1.equals(object2));
        System.out.println(object2.equals(object3));
        System.out.println(object1.equals(object3));

        System.out.println(object1.hashCode());
        System.out.println(object2.hashCode());
        System.out.println(object3.hashCode());

        //-----------------------

        //-----------------------
        // collections, unmodifiable/immutable collections
        List<String> array_list = new ArrayList<>();
        List<String> linked_list = new LinkedList<>();

        Set<String> hash_set = new HashSet<>();
        Set<String> tree_set = new TreeSet<>();
        Set<String> linked_hash_set = new LinkedHashSet<>();

        Map<Integer, String> hash_map = new HashMap<>();
        Map<Integer, String> tree_map = new TreeMap<>();
        Map<Integer, String> linked_hash_map = new LinkedHashMap<>();

        Stack<String> stack = new Stack<>();
        Queue<String> queue = new PriorityQueue<>();

        List<String> immutable_list = List.of("1", "2", "3");
        List<String> immutable_list_2 = Arrays.asList("1", "2", "3");
        List<String> unmodifiable_list = Collections.unmodifiableList(array_list);

        //set

        //map

        //-----------------------

        //-----------------------
        // compareTo

        List<MyObject> myObjectList = new ArrayList<>();
        myObjectList.add(object1);
        myObjectList.add(object2);
        myObjectList.add(object3);
        myObjectList.add(new MyObject("Baran", 25));
        myObjectList.add(new MyObject("Nikita", 45));
        myObjectList.add(new MyObject("Valeria", 18));

        Collections.sort(myObjectList);   // <- if implements Comparable

        Collections.sort(myObjectList, (o1, o2) -> o1.name.compareTo(o2.name));   // <- Comparator w/ lambda

        Comparator<MyObject> comparatorByAge = new Comparator<MyObject>() {
            @Override
            public int compare(MyObject o1, MyObject o2) {
                return o1.age - o2.age;
            }
        };

        Comparator<MyObject> comparatorByName = new Comparator<MyObject>() {
            @Override
            public int compare(MyObject o1, MyObject o2) {
                return o1.name.compareTo(o2.name);
            }
        };

        Collections.sort(myObjectList, comparatorByAge);
        Collections.sort(myObjectList, comparatorByName);

        Collections.sort(myObjectList, Comparator.comparingInt(o -> o.age));

        for(MyObject o : myObjectList) {
            System.out.println(o);
        }

        System.out.println("\n\n");

        Collections.sort(myObjectList, Comparator.comparing(o -> o.name));

        for(MyObject o : myObjectList) {
            System.out.println(o);
        }



    }


}
