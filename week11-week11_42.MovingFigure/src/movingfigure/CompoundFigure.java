/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;

import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author Sparkcaster
 */
public class CompoundFigure extends Figure {

    ArrayList<Figure> figlist = new ArrayList<Figure>();

    public CompoundFigure() {
        super(0 , 0);
    }

    

    public void add(Figure f) {
        this.figlist.add(f);
    }

    public void move(int x, int y) {
        for (Figure fig : this.figlist) {
            fig.move(x, y);
        }
    }

    public void draw(Graphics graphics) {
        for (Figure fig : this.figlist) {
            fig.draw(graphics);
        }
    }

}
