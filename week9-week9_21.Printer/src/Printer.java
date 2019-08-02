/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sparkcaster
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Printer {

    private String filename;
    private Scanner filereader;
    private File file;

    public Printer(String fileName) throws Exception {
        this.file = new File(fileName);
        this.filename = fileName;
        
    }

    public void printLinesWhichContain(String word) throws FileNotFoundException {
        filereader = new Scanner(this.file);
        while (this.filereader.hasNext()) {
            String line = this.filereader.nextLine();
            if (line.contains(word)) {
                System.out.println(line);

            } else if (word.equals("")) {
                System.out.println(line);
            }
        }
    }

}
