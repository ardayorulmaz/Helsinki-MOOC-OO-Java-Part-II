/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;

import java.awt.Graphics;

/**
 *
 * @author Sparkcaster
 */
public class Circle extends Figure {

    private int diameter;


    public Circle(int x, int y, int diameter) {
        super(x, y);
        this.diameter = diameter;
    }

    public int getdia() {
        return this.diameter;
    }

   
    @Override
    public void draw(Graphics graphics) {
        graphics.fillOval(super.getX() , super.getY(), getdia(), getdia());
    }

}
