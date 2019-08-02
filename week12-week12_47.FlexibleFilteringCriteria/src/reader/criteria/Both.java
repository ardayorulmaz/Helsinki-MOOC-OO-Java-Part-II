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
public class Both implements Criterion {

    private Criterion x;
    private Criterion y;

    public Both(Criterion x, Criterion y
    ) {
        this.y = y;
        this.x = x;
    }

    @Override
    public boolean complies(String line) {
        if (this.y.complies(line) && this.x.complies(line)) {
            return line.contains("");
        }
        return false;
    }

}

