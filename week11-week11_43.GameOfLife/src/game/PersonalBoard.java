/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import gameoflife.GameOfLifeBoard;
import java.util.Random;

/**
 *
 * @author Sparkcaster
 */
public class PersonalBoard extends GameOfLifeBoard {

    public PersonalBoard(int width, int height) {
        super(width, height);

    }

    @Override
    public void initiateRandomCells(double d) {
        Random random = new Random();

        for (int i = 0; i < super.getWidth(); i++) {
            for (int y = 0; y < super.getHeight(); y++) {
                double r = random.nextDouble();
                if (r <= d) {
                    turnToLiving(i, y);
                }
            }
        }

    }

    @Override
    public boolean isAlive(int i, int i1) {
        if ((i <= (super.getWidth() - 1) && i1 <= (super.getHeight() - 1)) && (0 <= i && 0 <= i1)) {
            return getBoard()[i][i1];
        } else {
            return false;
        }
    }

    @Override
    public void turnToLiving(int i, int i1) {
        if ((i <= (super.getWidth() - 1) && i1 <= (super.getHeight() - 1)) && (0 <= i && 0 <= i1)) {
            getBoard()[i][i1] = true;
        }

    }

    @Override
    public void turnToDead(int i, int i1) {
        if ((i <= super.getWidth() && i1 <= super.getHeight()) && (0 <= i && 0 <= i1)) {
            getBoard()[i][i1] = false;
        }
    }

    @Override
    public int getNumberOfLivingNeighbours(int i, int i1) {
        int total = 0;
        for (int x = -1; x < 2; x++) {
            for (int y = -1; y < 2; y++) {

                if (((i + x) <= (super.getWidth() - 1) && (i1 + y) <= (super.getHeight() - 1)) && (0 <= (i + x) && 0 <= (i1 + y))) {
                    if (isAlive(i + x, i1 + y)) {
                        total++;
                    }
                }
            }
        }
        if (isAlive(i, i1)) {
            total--;

        }
        return total;
    }

    @Override
    public void manageCell(int i, int i1, int i2) {
        if (i2 < 2) {
            turnToDead(i, i1);
        } else if ((i2 == 2 || i2 == 3) && isAlive(i, i1)) {
            turnToLiving(i, i1);
        } else if (i2 > 3) {
            turnToDead(i, i1);
        } else if (!isAlive(i, i1) && i2 == 3) {
            turnToLiving(i, i1);
        }
    }

}
