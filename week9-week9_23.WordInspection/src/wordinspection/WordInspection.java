/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sparkcaster
 */
public class WordInspection {

    private File file;
    private ArrayList<String> wordlist;

    public WordInspection(File file) throws FileNotFoundException {
        this.file = file;
        this.wordlist = new ArrayList<String>();
        this.readFile();
    }

    public int wordCount() throws FileNotFoundException {

        return this.wordlist.size();
    }

    public void readFile() throws FileNotFoundException {
        Scanner reader = new Scanner(this.file, "UTF-8");

        while (reader.hasNextLine()) {
            wordlist.add(reader.nextLine());

        }
    }

    public List<String> wordsContainingZ() {
        List<String> containingz = new ArrayList<String>();
        for (String string : this.wordlist) {
            if (string.contains("z")) {
                containingz.add(string);

            }
        }
        return containingz;
    }

    public List<String> wordsEndingInL() {
        List<String> endingwithl = new ArrayList<String>();
        for (String string : this.wordlist) {
            if (string.charAt(string.length() - 1) == 'l') {
                endingwithl.add(string);
            }
        }
        return endingwithl;
    }

    public List<String> palindromes() {
        List<String> palindrome = new ArrayList<String>();
        for (String string : this.wordlist) {
            String wordy = "";
            for (int i = 0; i < string.length(); i++) {
                wordy += string.charAt(string.length() - i - 1);

            }
            if (wordy.equals(string)) {
                palindrome.add(string);
            }

        }
        return palindrome;
    }

    public boolean charCompare(String string) {
        String vowels = "aeiouyäö";

        for (char vowel : vowels.toCharArray()) {

            if (!string.contains("" + vowel)) {
                return false;
            }
        }
        return true;
    }

    public List<String> wordsWhichContainAllVowels() {
        List<String> allvowel = new ArrayList<String>();
        for (String string : this.wordlist) {
            if (charCompare(string)) {
                allvowel.add(string);
            }
        }

        return allvowel;
    }
}
