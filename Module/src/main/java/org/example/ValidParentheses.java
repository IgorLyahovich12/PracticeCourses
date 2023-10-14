package org.example;

public class ValidParentheses {
    public static void main(String[] args) {
        String input1 = "([{}])";
        String input2 = "([)]";
        String input3 = "{[()]}";
        String input4 = "Bracers example"; // Приклад з порожнім рядком

        System.out.println(isValid(input1)); // Виведе true
        System.out.println(isValid(input2)); // Виведе false
        System.out.println(isValid(input3)); // Виведе true
        System.out.println(isValid(input4)); // Виведе true
    }

    public static boolean isValid(String s) {
        int n = s.length();
        char[] stack = new char[n]; // Масив
        int top = 0;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                stack[top] = c; // Додаємо відкриту дужку до масиву
                top++;
            } else if (c == ')' || c == '}' || c == ']') {
                if (top == 0) {
                    return false; // Відсутня відкрита дужка для закритої
                }
                char openBracket = stack[top - 1]; // Беремо останню відкриту дужку
                top--;
                if ((c == ')' && openBracket != '(') ||
                        (c == '}' && openBracket != '{') ||
                        (c == ']' && openBracket != '[')) {
                    return false; // Неправильний порядок дужок
                }
            }
        }

        return top == 0; // Всі відкриті дужки були закриті правильно, якщо стек пустий
    }
}