package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // test your code here

        File file = new File("src/shortList.txt");
        WordInspection newinspector = new WordInspection(file);
        System.out.println(newinspector.wordCount());
        
        
        // all words are in file src/wordList.txt

    }
}
