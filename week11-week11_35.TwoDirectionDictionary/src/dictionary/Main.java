package dictionary;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        MindfulDictionary dict = new MindfulDictionary("src/words.txt");
        dict.load();

        System.out.println(dict.translate("monkey"));
       System.out.print(dict);
    }
}
