public class Main {
    public static void main(String[] args) {
        String mainString = "Python Exercises";
        String subString = "se";

        boolean endsWith = checkIfEndsWith(mainString, subString);

        if (endsWith) {
            System.out.println("\"" + mainString + "\" закінчується на \"" + subString + "\" // true");
        } else {
            System.out.println("\"" + mainString + "\" закінчується на \"" + subString + "\" // false");
        }
    }

    public static boolean checkIfEndsWith(String mainString, String subString) {
        // Використовуємо метод endsWith для перевірки закінчення строки підстрокою
        return mainString.endsWith(subString);
    }
}