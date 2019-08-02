/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Sparkcaster
 */
public class MindfulDictionary {

    private Map<String, String> mindful = new HashMap<String, String>();
    private String file;

    public MindfulDictionary() {

    }

    public MindfulDictionary(String file) {

        this.file = file;

    }

    public boolean load() {

        try {
            File f = new File(this.file);

            Scanner fileReader = new Scanner(f);

            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");
                if (!this.mindful.keySet().contains(parts[0])) {
                    this.mindful.put(parts[0], parts[1]);
                }
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean save() {
        try {
            FileWriter writer = new FileWriter(this.file);
            for (Map.Entry<String, String> item : this.mindful.entrySet()) {
                writer.write(item.getKey() + ":" + item.getValue() + "\n");
            }
            writer.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void add(String word, String translation) {
        if (!this.mindful.keySet().contains(word)) {
            this.mindful.put(word, translation);
        }
    }

    public String translate(String word) {
        String trans = "";
        if (!this.mindful.keySet().contains(word) && !this.mindful.values().contains(word)) {
            trans = null;

        }
        if (this.mindful.keySet().contains(word)) {
            trans = this.mindful.get(word);
        }
        if (this.mindful.values().contains(word)) {
            for (Map.Entry<String, String> item : this.mindful.entrySet()) {
                if (item.getValue().equals(word)) {
                    trans = item.getKey();
                }
            }

        }
        return trans;
    }

    public void remove(String word) {
        List<String> removed = new ArrayList<String>();
        if (this.mindful.keySet().contains(word)) {
            this.mindful.remove(word);
        }
        if (this.mindful.values().contains(word)) {
            for (Map.Entry<String, String> item : this.mindful.entrySet()) {
                if (item.getValue().equals(word)) {
                    removed.add(item.getKey());
                }
            }

        }
        for (String string : removed) {
            this.mindful.remove(string);
        }
    }

    @Override
    public String toString() {
        return this.mindful.toString();
    }
}
