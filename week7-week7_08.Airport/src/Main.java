
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        AirportPanelInterface api = new AirportPanelInterface(reader);

        api.startAPI();
        api.startFS();
        // Write your main program here. Implementing your own classes will be useful.
    }
}
