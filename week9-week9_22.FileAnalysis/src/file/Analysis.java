/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Sparkcaster
 */
public class Analysis {

    private File file;
    private ArrayList<String> linelist;

    public Analysis(File file) throws FileNotFoundException {
        this.file = file;
        this.linelist = new ArrayList<String>();
        Scanner scanner = new Scanner(this.file);

        while (scanner.hasNext()) {
            String linea = "";
            linea += scanner.nextLine();
            this.linelist.add(linea);

        }

    }

    public int lines() {
        int no = 0;
        for (String string : this.linelist) {
            no++;
        }
        return no;
    }

    public int characters() {
        int charno = 0;
        for (String string : this.linelist) {
            charno += string.trim().length()+1;
            
        }
        return charno;
    }
}
