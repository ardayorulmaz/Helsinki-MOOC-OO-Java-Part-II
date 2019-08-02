/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;

/**
 *
 * @author Sparkcaster
 */
public class LengthAtLeast implements Criterion {

    private int y;

    public LengthAtLeast(int y) {
        this.y = y;
    }

    @Override
    public boolean complies(String line) {
        if (line.length() >= this.y) {
            return line.contains("");
        } else {
            return false;
        }
    }

}
