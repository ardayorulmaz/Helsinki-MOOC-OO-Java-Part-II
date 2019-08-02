
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Dictionary dict = new Dictionary();

        TextUserInterface ui = new TextUserInterface(reader, dict);
        ui.start();
    }
}
