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
public class Not implements Criterion {

    private Criterion x;

    public Not(Criterion x
    ) {

        this.x = x;
    }

    @Override
    public boolean complies(String line) {
        if (!this.x.complies(line)) {
            return line.contains("");
        }
        return false;
    }

}

