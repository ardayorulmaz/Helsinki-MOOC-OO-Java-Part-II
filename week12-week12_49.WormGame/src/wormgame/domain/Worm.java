/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.domain;

import java.util.*;
import wormgame.Direction;

/**
 *
 * @author Sparkcaster
 */
public class Worm {

    private int orgX;
    private int orgY;
    private Direction orgDirection;
    private List<Piece> wormpieces;
    private Boolean grow;

    public Worm(int originalX, int originalY, Direction originalDirection) {
        this.orgX = originalX;
        this.orgY = originalY;
        this.orgDirection = originalDirection;
        this.wormpieces = new ArrayList<Piece>();
        Piece firstpiece = new Piece(originalX, originalY);
        this.wormpieces.add(firstpiece);
        this.grow = false;
    }

    public Direction getDirection() {
        return this.orgDirection;
    }

    public void setDirection(Direction dir) {
        this.orgDirection = dir;
    }

    public int getLength() {
        return this.wormpieces.size();
    }

    public List<Piece> getPieces() {
        return this.wormpieces;
    }

    public int getlocx() {
        return this.wormpieces.get(this.wormpieces.size() - 1).getX();
    }

    public int getlocy() {
        return this.wormpieces.get(this.wormpieces.size() - 1).getY();
    }

    public void move() {

        if (getLength() < 3) {
            if (null != getDirection()) {
                switch (getDirection()) {
                    case RIGHT:
                        this.wormpieces.add(new Piece(getlocx() + 1, getlocy()));
                        break;
                    case LEFT:
                        this.wormpieces.add(new Piece(getlocx() - 1, getlocy()));
                        break;
                    case UP:
                        this.wormpieces.add(new Piece(getlocx(), getlocy() - 1));
                        break;
                    case DOWN:
                        this.wormpieces.add(new Piece(getlocx(), getlocy() + 1));
                        break;
                    default:
                        break;
                }
            }

        } else if (this.wormpieces.size() >= 3) {
            if (null != getDirection()) {
                switch (getDirection()) {
                    case RIGHT:
                        this.wormpieces.add(new Piece(getlocx() + 1, getlocy()));

                        break;
                    case LEFT:
                        this.wormpieces.add(new Piece(getlocx() - 1, getlocy()));

                        break;
                    case UP:
                        this.wormpieces.add(new Piece(getlocx(), getlocy() - 1));

                        break;
                    case DOWN:
                        this.wormpieces.add(new Piece(getlocx(), getlocy() + 1));

                        break;
                    default:
                        break;
                }
            }
        }
        if (this.grow && this.wormpieces.size() >= 4) {
            this.grow = false;
        } else if (!this.grow && this.wormpieces.size() >= 4) {
            this.wormpieces.remove(0);
        }
    }

    public void grow() {
        if (this.wormpieces.size() >= 3) {
            this.grow = true;
        }

    }

    public boolean runsInto(Piece piece) {
        Iterator<Piece> itc = this.wormpieces.iterator();
        while (itc.hasNext()) {
            Piece piecex = itc.next();
            {
                if ((piece.getX() == piecex.getX()) && (piece.getY() == piecex.getY())) {

                    return true;
                }
            }
        }
        return false;
    }

    public boolean runsIntoItself() {
        Iterator<Piece> itc = this.wormpieces.iterator();
        while (itc.hasNext()) {
            Piece piece = itc.next();
            if (piece != this.wormpieces.get(this.wormpieces.size() - 1)) {
                if ((piece.getX() == getlocx()) && (piece.getY() == getlocy())) {

                    return true;
                }
            }
        }
        return false;
    }
}
