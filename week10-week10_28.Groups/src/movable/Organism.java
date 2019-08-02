/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

/**
 *
 * @author Sparkcaster
 */
public class Organism implements Movable {

    private int posx;
    private int posy;

    public Organism(int x, int y) {
        this.posx = x;
        this.posy = y;
    }

    public int getDimX() {
        return this.posx;
    }

    public int getDimY() {
        return this.posy;
    }

    public void move(int dx, int dy) {
        this.posx += dx;
        this.posy += dy;
    }

    @Override
    public String toString() {
        return "x: " + this.getDimX() + "; y: " + this.getDimY();
    }

}
