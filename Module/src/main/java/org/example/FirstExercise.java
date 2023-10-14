package org.example;

public class FirstExercise {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 5, 1, 1, 3};
        int[] newNumbers = new int[numbers.length];
        int uniqueCount = 0;
        for (int number : numbers) {
            boolean isUnique = true;
            // Перевірка, чи поточне число є унікальним у новому масиві
            for (int j = 0; j < uniqueCount; j++) {
                if (number == newNumbers[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                newNumbers[uniqueCount] = number;
                uniqueCount++;
            }
        }
        // Виведення унікальних чисел у новому масиві
        for (int i = 0; i < uniqueCount; i++) {
            System.out.println(newNumbers[i]);
        }
        System.out.println("Кількість унікальних цифр в масиві ="+uniqueCount);
    }
}