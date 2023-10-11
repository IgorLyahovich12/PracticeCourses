public class IgnoreString {
    public static void main(String[] args) {
        String string1 = "Stephen Edwin King";
        String string2 = "Walter Winchell";
        String string3 = "stephen edwin king";

        boolean containsString2 = checkIfContainsNoRegister(string1, string2);
        boolean containsString3 = checkIfContainsNoRegister(string1, string3);

        System.out.println(string1 + " містить " + string2 + "? " + containsString2);
        System.out.println(string1 + " містить " + string3 + "? " +containsString3);
    }

    public static boolean checkIfContainsNoRegister(String string1, String string2) {

        return string1.toLowerCase().contains(string2.toLowerCase());
    }
}

