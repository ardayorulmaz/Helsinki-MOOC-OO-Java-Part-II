/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.ArrayList;

import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;

/**
 *
 * @author Sparkcaster
 */
public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {

    private Map<String, Set<String>> dictionarylist;

    public PersonalMultipleEntryDictionary() {
        this.dictionarylist = new HashMap<String, Set<String>>();
    }

    @Override

    public void add(String word, String entry) {
        if (!this.dictionarylist.containsKey(word)) {
            this.dictionarylist.put(word, new HashSet<String>());
        }
        
      this.dictionarylist.get(word).add(entry);
    }

    @Override
    public Set<String> translate(String word) {
        if (!this.dictionarylist.containsKey(word)) {
            return null;
        }
        return this.dictionarylist.get(word);
    }

    @Override
    public void remove(String word) {
        this.dictionarylist.remove(word);
    }

}
