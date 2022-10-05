package Task7;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        int[] array = new int[10];

        fill(array);

        System.out.println("Before sort: ");
        print(array);

        SortingClass.bubbleSort(array);
//        SortingClass.selectionSort(array);
//        SortingClass.insertionSort(array, array.length);
//        SortingClass.mergeSort(array);
//        SortingClass.quickSort(array, 0, array.length);

        System.out.println("\n---------------------\n");
        System.out.println("After sort: ");
        print(array);

//        System.out.println("");
//        List<Integer> randomList = Arrays.stream(array).boxed().collect(Collectors.toList());
//        Collections.shuffle(randomList);
//
//        SortingClass.randomSort(randomList);


    }

    public static void fill(int[] array) {

        Random rand = new Random();

        for(int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(0,1000);
        }

    }

    public static void print(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
