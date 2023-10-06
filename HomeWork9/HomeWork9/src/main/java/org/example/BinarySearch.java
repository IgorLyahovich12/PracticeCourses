package org.example;
import java.util.Random;

public class BinarySearch {
    public static void main(String[] args) {
        Random random = new Random(10000);
        int[] array = new int[100000];
        // Заповнюємо масив відсортованими значеннями
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        int target1 = 50000; // Шукане значення, довільний випадок
        int target2 = 100001; // Шукане значення, найгірший випадок

        // Вимірюємо час для довільного випадку
        long startTime1 = System.nanoTime();
        int result1 = binarySearch(array, target1);
        long endTime1 = System.nanoTime();
        long executionTime1 = endTime1 - startTime1;

        // Вимірюємо час для найгіршого випадку
        long startTime2 = System.nanoTime();
        int result2 = binarySearch(array, target2);
        long endTime2 = System.nanoTime();
        long executionTime2 = endTime2 - startTime2;

        System.out.println("Результат (довільний випадок): " + result1);
        System.out.println("Час виконання (довільний випадок): " + executionTime1 + " наносекунд");

        System.out.println("\nРезультат (найгірший випадок): " + result2);
        System.out.println("Час виконання (найгірший випадок): " + executionTime2 + " наносекунд");
    }

   private static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
} //Бінарний пошук швидше лінійного