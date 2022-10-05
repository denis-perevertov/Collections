import java.util.ArrayList;
import java.util.List;

public class Generics {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();   // -- List<Integer> это дженерик , список объектов типа Integer

        ArrayList<Object> objectList = new ArrayList<>();

        objectList.add(12);
        objectList.add(234);
        objectList.add("Бу");
        objectList.add(true);

        int sum = 0;

        for(Object o : objectList) {
            //sum += (int) o;
        }


        /*

        Ковариантность — это сохранение иерархии наследования исходных типов в производных типах в том же порядке.
        Например, если Кошка — это подтип Животные, то Множество<Кошки> — это подтип Множество<Животные>

        Контравариантность — это обращение иерархии исходных типов на противоположную в производных типах.
        Например, если Кошка — это подтип Животные, то Множество<Животные> — это подтип Множество<Кошки>

        Инвариантность — отсутствие наследования между производными типами. Если Кошка — это подтип Животные,
        то Множество<Кошки> не является подтипом Множество<Животные> и Множество<Животные> не является подтипом Множество<Кошки>

         */

        //Массивы ковариантны
        String[] strings = new String[10];
        Object[] arr = strings;

        //Дженерики инвариантны

        //Integer - подкласс Number
        Number number = 12381;
        Integer integer = (Integer) number;
        System.out.println(integer instanceof Number);

        //Но List<Integer> - не подкласс List<Number>
        List<Integer> list2 = new ArrayList<>();
        //List<Number> list3 = list2;

        //Можно это поменять с wildcard
        List<Integer> ints = new ArrayList<Integer>();
        List<? extends Number> nums = ints;

        //Пример контравариантности
        List<Number> nums2 = new ArrayList<>();
        List<? super Integer> ints2 = nums2;

        /*

        при <? extends number> нельзя добавлять новые элементы в список
        при <? super number> - можно

         */

        Integer[] intArray = {1,2,3,4,5};
        Double[] doubleArray = {1.1,2.2,3.3,4.4,5.5};
        String[] strArray = {"1", "2", "3", "4", "5"};
        Boolean[] boolArray = {true, true, true, true, true};

        printArray(intArray);

        printArray(doubleArray);

        printArray(strArray);

        printArray(boolArray);

        MyGenericClass<Integer> def = new MyGenericClass<>();

        def.add(2);
        def.add(3);

        System.out.println(def.getList());
    }

    public static <T> void printArray(T[] inputArray) {
        for(T t : inputArray) {
            System.out.println(t);
        }
    }

}
