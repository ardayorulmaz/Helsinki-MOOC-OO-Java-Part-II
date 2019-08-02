
import java.util.HashMap;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Sparkcaster
 */
public class Dictionary {

    private HashMap<String, String> dictionarylist;


    public Dictionary() {
        this.dictionarylist = new HashMap<String, String>();

    }

    public String translate(String word) {
        if (this.dictionarylist.containsKey(word)) {
            return this.dictionarylist.get(word);
        }
        return null;
    }

    public void add(String word, String translation) {
        this.dictionarylist.put(word, translation);
    }

    public int amountOfWords() {
        return this.dictionarylist.size();
    }

    public ArrayList<String> translationList() {
        ArrayList<String> wordlist = new ArrayList<String>();
        String line = "";

        for (String key : this.dictionarylist.keySet()) {
            line = key + " = " + this.dictionarylist.get(key);
            wordlist.add(line);
        }

        return wordlist;
    }

}
