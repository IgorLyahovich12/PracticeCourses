public class StartsWithAnotherString {
    public static void main(String[] args) {
        String mainString1 = "Red is favorite color.";
        String mainString2 = "Orange is also my favorite color.";
        String searchString = "Red";

        boolean startsWith1 = checkIfStartsWith(mainString1, searchString);
        boolean startsWith2 = checkIfStartsWith(mainString2, searchString);

        System.out.println(mainString1 + " починається із " + searchString + "? " + startsWith1);
        System.out.println(mainString2 + " починається із \"" + searchString + "? " + startsWith2);
    }

    public static boolean checkIfStartsWith(String mainString, String searchString) {

        return mainString.startsWith(searchString);
    }
}
