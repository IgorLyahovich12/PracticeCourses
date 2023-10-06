public class PrintStars {
    public static void main(String[] args) {
        int n = 3; // Задана кількість '*'

        System.out.println("Використання рекурсії:");
        printStarsRecursively(n);
        System.out.println("Використання ітерації:");
        printStarsIteratively(n);
    }
    // Метод рекурсивного виведення '*' n разів
   private static void printStarsRecursively(int n) {
        if (n > 0) {
            printStarsRecursively(n - 1); // Викликаємо метод з меншим значенням n
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println(); // Перехід на новий рядок після  '*'
        }
    }

    // Метод ітеративного виведення '*' n разів
    private  static void printStarsIteratively(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Перехід на новий рядок після '*'
        }
    }


}