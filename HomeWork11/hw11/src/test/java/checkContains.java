

public class checkContains {
    public static void main(String[] args) {
        String string1 = "Stephen Edwin King";
        String string2 = "Walter Winchell";
        String string3 = "Edwin";

        boolean containsString2 = checkIfContains(string1, string2);
        boolean containsString3 = checkIfContains(string1, string3);

        System.out.println(string1 + " містить " + string2 + "? " + containsString2);
        System.out.println(string1 + " містить " + string3 + "? " +containsString3);
    }

    public static boolean checkIfContains(String string1, String string2) {
        // Використовуємо метод contains для перевірки, чи містить один рядок інший
        return string1.contains(string2);
}
}
