/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sparkcaster
 */
public class AtLeastOne implements Criterion {

    private List<Criterion> list;

    public AtLeastOne(Criterion... criterions) {
        this.list = new ArrayList<Criterion>();
        for (Criterion critty : criterions) {
            list.add(critty);
        }
    }

    @Override
    public boolean complies(String line) {
        for (Criterion crit : this.list) {
            if (crit.complies(line)) {
                return line.contains("");
            }
        }

        return false;
    }

}
