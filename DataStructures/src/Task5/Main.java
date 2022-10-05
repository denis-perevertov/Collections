package Task5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        List<Integer> array_list = new ArrayList<>();
        List<Integer> linked_list = new LinkedList<>();

        fillRandom(array_list, 1000000);
        fillRandom(linked_list, 1000000);

        System.out.println("Add element to the end of array list");
        measureTime(() -> {
            array_list.add(123);
        });

        System.out.println("Add element to the end of linked list");
        measureTime(() -> {
            linked_list.add(123);
        });

        System.out.println("Add element to the middle of array list");
        measureTime(() -> {
            array_list.add(500000, 134);
        });

        System.out.println("Add element to the middle of linked list");
        measureTime(() -> {
            linked_list.add(500000, 134);
        });

        System.out.println("Get element from the end of array list");
        measureTime(() -> {
            array_list.get(array_list.size()-1);
        });

        System.out.println("Get element from the end of linked list");
        measureTime(() -> {
            linked_list.get(linked_list.size()-1);
        });

        System.out.println("Get element from the middle of array list");
        measureTime(() -> {
            array_list.get(500000);
        });

        System.out.println("Get element from the middle of linked list");
        measureTime(() -> {
            linked_list.get(500000);
        });

        System.out.println("Delete element from the end of array list");
        measureTime(() -> {
            array_list.remove(array_list.size()-1);
        });

        System.out.println("Delete element from the end of linked list");
        measureTime(() -> {
            linked_list.remove(linked_list.size()-1);
        });

        System.out.println("Delete element from the middle of array list");
        measureTime(() -> {
            array_list.remove(500000);
        });

        System.out.println("Delete element from the middle of linked list");
        measureTime(() -> {
            linked_list.remove(500000);
        });

    }

    public static void fillRandom(List<Integer> list, int amountOfElements){

        Random rand = new Random();

        for(int i = 0; i < amountOfElements; i++){
            list.add(rand.nextInt(0,123456));
        }

    }

    public static void measureTime(Runnable task) {

        long start_time = System.currentTimeMillis();
        task.run();
        long spent_time = System.currentTimeMillis() - start_time;
        System.out.println("Spent time: " + spent_time + " ms");

    }

}
