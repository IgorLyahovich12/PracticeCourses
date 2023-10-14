package org.example;

import java.util.Scanner;

public class StepHorse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть поточне положення коня (x y):");
        System.out.println("Введіть значення x:");
        int currentX = scanner.nextInt();
        System.out.println("Введіть значення y:");
        int currentY = scanner.nextInt();
        System.out.println("Введіть клітку, в яку намагаються його пересунути (x y):");
        System.out.println("Введіть значення x:");
        int targetX = scanner.nextInt();
        System.out.println("Введіть значення y:");
        int targetY = scanner.nextInt();
        if (isHorseMoveValid(currentX, currentY, targetX, targetY)) {
            System.out.println("Хід коня дійсний.");
        } else {
            System.out.println("Хід коня не дійсний.");
        }
    }
    public static boolean isHorseMoveValid(int currentX, int currentY, int targetX, int targetY) {
        int dx = Math.abs(targetX - currentX);
        int dy = Math.abs(targetY - currentY);
        return (dx == 1 && dy == 2) || (dx == 2 && dy == 1);
    }
}