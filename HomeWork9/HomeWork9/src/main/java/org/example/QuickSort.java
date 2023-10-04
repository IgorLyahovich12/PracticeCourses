package org.example;
import java.util.Random;
public class QuickSort {
    public static void main(String[] args) {
        Random random = new Random(10000);
        int[] array1 = new int[10000];
        // Заповнюємо масив випадковими числами
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt();
        }
        // Вимірюємо час виконання  для O(n*log(n))
        long startTime1 = System.nanoTime();
        quickSort(array1, 0, array1.length - 1);
        long endTime1 = System.nanoTime();
        long executionTime1 = endTime1 - startTime1;
        System.out.println("O(n*log(n)):");
        System.out.println("Час виконання для QuickSort: " + executionTime1 + " наносекунд");
        // Вимірюємо час виконання  для O(n^2)
        ReverseSort(array1);
        long startTime2 = System.nanoTime();
        quickSort(array1, 0, array1.length - 1);
        long endTime2 = System.nanoTime();
        long executionTime2 = endTime2 - startTime2;
        System.out.println("\nO(n^2):");
        System.out.println("Час виконання для QuickSort найгірший випадок: " + executionTime2 + " наносекунд");
    }
    //рекурсивно розділяє масив на менші підмасиви та сортує їх.
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }
    //розділення масиву array на дві частини навколо опорного елемента
    public static int partition(int[] array, int  low, int high) {
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
    // Метод оберненого сортування
    public static void  ReverseSort(int[] array) {
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

    }
}