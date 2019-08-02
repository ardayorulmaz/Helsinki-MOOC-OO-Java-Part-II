
import java.util.Scanner;

public class Main {

    Scanner reader = new Scanner(System.in);

    public static boolean isAWeekDay(String string) {

        if (string.matches("mon|tue|wed|thu|fri|sat|sun")) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean allVowels(String string) {

        if (string.matches("[aeiouäö]*")) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        // write test code here

    }

    public static boolean clockTime(String string) {

        if (string.length() < 8) {
            return false;
        }

        Character c = string.charAt(0);
        

            if (string.matches("([01][0-9]|[2][0-3]):[0-5][0-9]:[0-5][0-9]")) {
                return true;
            } else {
                return false;
            }
      

    }
}
