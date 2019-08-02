/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sparkcaster
 */
public class PersonalDuplicateRemover implements DuplicateRemover {

    private ArrayList<String> stringlist;

    public PersonalDuplicateRemover() {
        this.stringlist = new ArrayList<String>();
    }

    @Override
    public void add(String characterString) {
        this.stringlist.add(characterString);
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        
        return this.stringlist.size()-getUniqueCharacterStrings().size();
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        Set<String> uniques = new HashSet<String>();
        for (String string : this.stringlist) {
            uniques.add(string);
        }
        return uniques;
    }

    @Override
    public void empty() {
        this.stringlist.clear();
        getNumberOfDetectedDuplicates();
    }

}
