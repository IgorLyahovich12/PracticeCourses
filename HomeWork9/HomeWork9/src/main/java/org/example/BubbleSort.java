package org.example;
import java.util.Random;
public class BubbleSort {
    public static void main(String[] args) {
        Random random = new Random(10000);
        int[] array1 = new int[100000];
        // Заповнюємо масив випадковими числами
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt();
        }

        // Вимірюємо час для довільного випадку
        long startTime = System.nanoTime();
        int iterations1 = bubbleSort(array1);
        long endTime = System.nanoTime();
        long executionTime1 = endTime - startTime;
        System.out.println("Час виконання для довільного випадку: " + executionTime1 + " наносекунд");
        System.out.println("Кількість ітерацій для довільного випадку: " + iterations1);
        // Вимірюємо час для найгіршого випадку (відсортований в зворотньому порядку)
        int[] arrayBack = ReverseSort(array1);
        startTime = System.nanoTime();
        int iterations2 = bubbleSort(arrayBack);
        endTime = System.nanoTime();
        long executionTime2 = endTime - startTime;
        System.out.println("Час виконання для найгіршого випадку: " + executionTime2 + " наносекунд");
        System.out.println("Кількість ітерацій для найгіршого випадку: " + iterations2);
        // System.out.println("Відсортований масив для довільного випадку: " + Arrays.toString(array1));
        // System.out.println("Відсортований масив для найгіршого випадку: " + Arrays.toString(arrayBack));
    }

    // Метод сортування бульбашкою
    public static int bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        int iterations = 0; // Лічильник ітерацій
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (array[i - 1] > array[i]) {
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    swapped = true;
                }
                iterations++; // Збільшити лічильник ітерацій
            }
        } while (swapped);
        //System.out.println(Arrays.toString(array));
        return iterations;
    }

    // Метод оберненого сортування
    public static int[] ReverseSort(int[] array) {
        int n = array.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (array[i - 1] < array[i]) {
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
        // System.out.println(Arrays.toString(array));
        return array;
    }
}
