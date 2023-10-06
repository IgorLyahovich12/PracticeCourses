public class Power {
    public static void main(String[] args) {
        int base = 2; // Основа
        int exponent = 3; // Показник ступеня
        long result = powerRecursive(base, exponent);
        System.out.println(base + "^" + exponent + " = " + result);
        long result2 = powerIterative(base, exponent);
        System.out.println(base + "^" + exponent + " = " + result2);
    }

    private static long powerRecursive(int base, int exponent) {
        if (exponent < 0) {
            return -1;
        }
        // if показник ступеня дорівнює 0, результат завжди 1.
        if (exponent == 0) {
            return 1;
        }
        // Рекурсивний випадок: зводимо число до показника ступеня на один менше і помножимо на базу.
        return base * powerRecursive(base, exponent - 1);
    }
    private static long powerIterative (int base, int exponent) {
        // Перевірка на позитивний показник ступеня
        if (exponent < 0) {
            return -1;
        }

        long result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}
