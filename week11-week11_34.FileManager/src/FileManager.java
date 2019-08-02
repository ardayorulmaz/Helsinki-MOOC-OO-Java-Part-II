
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {

    public List<String> read(String file) throws FileNotFoundException {
        ArrayList<String> stringlist = new ArrayList<String>();

        File filereader = new File(file);
        Scanner reader = new Scanner(filereader);
        while (reader.hasNextLine()) {
            stringlist.add(reader.nextLine());
        }
        return stringlist;

    }

    public void save(String file, String text) throws IOException {
        FileWriter writer = new FileWriter(file);
        writer.write(text);
        writer.close();
    }

    public void save(String file, List<String> texts) throws IOException {

        FileWriter writer = new FileWriter(file);
        for (String string : texts) {
            writer.write(string + "\n");

        }
        writer.close();
    }

}
