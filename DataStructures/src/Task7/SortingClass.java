package Task7;

import java.util.Collections;
import java.util.List;

public class SortingClass {


    public static void bubbleSort(int[] array) {


        /*

        замена местами двух переменных
        сложность N

         */

        boolean isSorted = false;

        while(!isSorted) {

            isSorted = true;

            for (int i = 0; i < array.length - 1; i++) {

                if(array[i] > array[i+1]) {

                    swap(array, i, i+1);
                    isSorted = false;

                }
            }
        }



    }

    public static void selectionSort(int[] array) {

        int pos = 0;
        int temp = 0;

        /*

        два цикла, внешний и внутренний
        внутренний цикл находит индекс минимального элемента в массиве
        внешний цикл меняет местами текущий элемент и найденный вн.циклом минимальный элемент и движется дальше

        сложность n^2  (2 вложенных цикла величиной в N элементов)

         */

        for(int i = 0; i < array.length; i++) {   // внешний цикл
            pos = i;
            for(int j = i+1; j < array.length; j++) {  // внутренний цикл
                if(array[j] < array[pos]) {
                    pos = j;
                }
            }

            swap(array, pos, i);

        }

    }

    public static void insertionSort(int[] array, int n) {

        if(n <= 1) {
            return;
        }

        insertionSort(array, n-1);

        int last = array[n-1];
        int j = n-2;

        while(j >= 0 && array[j] > last) {
            array[j+1] = array[j];
            j--;
        }
        array[j+1] = last;

    }
    public static void mergeSort(int[] array) {

        int arrayLength = array.length;
        int midPoint = arrayLength/2;

        if(arrayLength == 1) return;

        //массив делится на две половины
        int[] leftHalf = new int[midPoint];
        int[] rightHalf = new int[arrayLength - midPoint];


        //две половины заполянются
        for(int i = 0; i < midPoint; i++) {
            leftHalf[i] = array[i];
        }

        System.out.println(" ");

        for(int j = midPoint; j < arrayLength; j++) {
            rightHalf[j - midPoint] = array[j];
        }

        //---Деление--- (рекурсия)
        mergeSort(leftHalf);
        mergeSort(rightHalf);


        //---Слияние----

        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;


        //i - итератор левой половины, j - правой, k - исходного массива
        int i = 0, j = 0, k = 0;

		/*
		 Элемент левой половины по номеру i сравнивается с элементом правой половины по номеру j
		 Меньшее число добавляется в исходный массив в позицию k, номер соотв.половины увел. на 1
		 Номер позиции k увеличивается на 1
		 Продолжается это до тех пор, пока в левой ИЛИ в правой половине не закончатся элементы
		 */

        while(i < leftSize && j < rightSize) {

            if(leftHalf[i] < rightHalf[j]) {

                array[k] = leftHalf[i];
                i++;

            }

            else if(rightHalf[j] < leftHalf[i]) {

                array[k] = rightHalf[j];
                j++;

            }

            k++;

        }

		/*
		 Написанный выше цикл оставляет небольшой "хвостик" - одна из половин не полностью проверена.
		 Нижние два цикла проверяют каждую из половин - если одна из них пройдена не полностью,
		 то её элементы (отсортированные между собой в прошлых рекурсиях) по порядку добавляются
		 в исходный массив с соотв.увеличением итераторов.

		 */

        while(i < leftSize) {
            array[k] = leftHalf[i];
            i++;
            k++;
        }

        while(j < rightSize) {
            array[k] = rightHalf[j];
            j++;
            k++;
        }

		/*
		 Сортировка завершена
		 */

    }

    public static void quickSort(int[] array, int lowIndex, int highIndex) {

		/*
		Выход из метода для массивов с размером 1 (верхний и нижний индекс равны)
		 */
        if(lowIndex >= highIndex) return;


		/*
		 QUICK SORT

		 Суть: Установка точки поворота (pivot), определение её места в массиве
		 и разделение общего массива на две части, где в одной будут цифры меньше
		 точки поворота, а в другой больше.
		 Затем рекурсией сортируется каждая из этих частей, которая делится на две части,
		 которые делятся на две части, ... , до появления частей с размером 1.

		 Один из самых быстрых сортировочных алгоритмов
		 */

        int pivot = array[highIndex];
        int leftPointer = lowIndex;
        int rightPointer = highIndex;


        //пока указатель справа не пересекся с указателем слева
        while(rightPointer > leftPointer) {

            //указатель слева ищет элемент, который будет БОЛЬШЕ точки поворота.
            while(array[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }

            //указатель справа ищет элемент, который будет МЕНЬШЕ точки поворота.
            while(leftPointer < rightPointer && array[rightPointer] >= pivot) {
                rightPointer--;
            }

            //Когда два указателя остановились, найдя нужные им элементы, происходит свап
            swap(array, leftPointer, rightPointer);

        }

		/*
		 Когда указатели слева и справа пересеклись, значение точки поворота переносится
		 в точку пересечения указателей, тем самым занимая своё окончательное место
		 в финальном массиве. Слева этого значения теперь находятся только числа
		 меньше него, а справа - больше.
		 */
        swap(array, leftPointer, highIndex);

        //Рекурсивно сортируются две указанные выше половины
        quickSort(array, lowIndex, rightPointer - 1);
        quickSort(array, rightPointer + 1, highIndex);

    }

    public static void randomSort(List<Integer> array) {

        int count = 0;
        long start_time = System.currentTimeMillis();

        //мой любимый

        while(!isSorted(array)) {
            Collections.shuffle(array);
            count++;
        }
        long spent_time = System.currentTimeMillis() - start_time;

        System.out.println("Shuffled " + count + " times and spent " + spent_time + " ms.");

    }

    private static boolean isSorted(List<Integer> array) {

        //для randomSort

        for(int i = 0; i < array.size() - 1; ++i) {
            if(array.get(i) > array.get(i+1)) return false;
        }
        return true;
    }

    private static void swap (int[] array, int index1, int index2) {

        //отдельный метод для свапа двух значений местами для удобства

        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }


}
