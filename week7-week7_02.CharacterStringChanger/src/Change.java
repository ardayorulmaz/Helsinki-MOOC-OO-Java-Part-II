/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sparkcaster
 */
public class Change {

    private char firstchar;
    private char secondchar;

    public Change(char fromCharacter, char toCharacter) {
        this.firstchar = fromCharacter;
        this.secondchar = toCharacter;
    }

    public String change(String string) {
        
        String word= string.replace(this.firstchar, this.secondchar);
        
       return word;
        
        
    }
}
