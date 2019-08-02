
import java.io.IOException;
import java.io.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileManager f = new FileManager();

        for (String line : f.read("src/testinput1.txt")) {
            System.out.println(line);
        }
    }
}
