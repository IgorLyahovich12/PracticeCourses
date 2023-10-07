package org.example;
import java.util.Random;
public class BubbleAndQuickSort {
    public static void main(String[] args) {
        Random random = new Random(10000);
        int[] array1 = new int[10000];
        // Заповнюємо масив випадковими числами
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt();
        }

        // Вимірюємо час для довільного випадку BubbleSort
        long startTime = System.nanoTime();
        int iterations1 = bubbleSort(array1);
        long endTime = System.nanoTime();
        long executionTime1 = endTime - startTime;
        System.out.println("Час виконання для довільного випадку BubbleSort: " + executionTime1 + " наносекунд");
        System.out.println("Кількість ітерацій для довільного випадку BubbleSort: " + iterations1);
        // Вимірюємо час для найгіршого випадку (відсортований в зворотньому порядку)
        int[] arrayBack = ReverseSort(array1);
        startTime = System.nanoTime();
        int iterations2 = bubbleSort(arrayBack);
        endTime = System.nanoTime();
        long executionTime2 = endTime - startTime;
        System.out.println("Час виконання для найгіршого випадку BubbleSort: " + executionTime2 + " наносекунд");
        System.out.println("Кількість ітерацій для найгіршого випадку BubbleSort: " + iterations2);
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt();
        }
        // Вимірюємо час виконання  для O(n*log(n))
        long startTime1 = System.nanoTime();
        quickSort(array1, 0, array1.length - 1);
        long endTime1 = System.nanoTime();
        executionTime1 = endTime1 - startTime1;
        System.out.println("O(n*log(n)):");
        System.out.println("Час виконання для QuickSort: " + executionTime1 + " наносекунд");
        // Вимірюємо час виконання  для O(n^2)
        ReverseSort(array1);
        long startTime2 = System.nanoTime();
        quickSort(array1, 0, array1.length - 1);
        long endTime2 = System.nanoTime();
         executionTime2 = endTime2 - startTime2;
        System.out.println("\nO(n^2):");
        System.out.println("Час виконання для QuickSort найгірший випадок: " + executionTime2 + " наносекунд");
    }

    // Метод сортування бульбашкою
    private static int bubbleSort(int[] array) {
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
        return iterations;
    }

    // Метод оберненого сортування
    private static int[] ReverseSort(int[] array) {
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
        return array;
    }
    //рекурсивно розділяє масив на менші підмасиви та сортує їх.
    private static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }
    //розділення масиву array на дві частини навколо опорного елемента
    private static int partition(int[] array, int  low, int high) {
        int pivot = array[high];
        int i =  low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }
    
}
