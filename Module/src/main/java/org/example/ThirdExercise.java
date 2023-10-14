package org.example;

import java.util.Scanner;

public class ThirdExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть координати точки A:");
        System.out.println("Введіть значення x: ");
        double xA = scanner.nextDouble();
        System.out.println("Введіть значення y: ");
        double yA = scanner.nextDouble();
        System.out.println("Введіть координати точки B:");
        System.out.println("Введіть значення x: ");
        double xB = scanner.nextDouble();
        System.out.println("Введіть значення y: ");
        double yB = scanner.nextDouble();
        System.out.println("Введіть координати точки C:");
        System.out.println("Введіть значення x: ");
        double xC = scanner.nextDouble();
        System.out.println("Введіть значення y: ");
        double yC = scanner.nextDouble();
        double sideAB = calculateDistance(xA, yA, xB, yB);
        double sideBC = calculateDistance(xB, yB, xC, yC);
        double sideCA = calculateDistance(xC, yC, xA, yA);
        if (checking(sideAB, sideBC, sideCA)) {
            double semiPerimeter = (sideAB + sideBC + sideCA) / 2.0;
            double area = Math.sqrt(semiPerimeter * (semiPerimeter - sideAB) * (semiPerimeter - sideBC) * (semiPerimeter - sideCA));
            System.out.println("Площа трикутника ABC дорівнює: " + area);
        }
        else
            System.out.println("Такого трикутника не існує " );
    }
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    public static boolean checking(double sideAB ,double sideBC, double sideCA  ){
        if(sideAB<=0||sideBC<=0||sideCA<=0){
            return false;
        }
        if((sideAB==sideBC||sideAB>sideCA)&&(sideAB==sideCA||sideAB>sideBC)&&(sideCA==sideBC||sideCA>sideAB)){
            return false;
        }
        return !(sideAB + sideBC > sideCA) && !(sideAB + sideCA > sideBC) && !(sideBC + sideCA > sideAB);
    }
}