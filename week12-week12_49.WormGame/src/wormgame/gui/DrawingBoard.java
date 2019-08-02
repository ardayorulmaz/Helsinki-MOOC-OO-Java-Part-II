/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.gui;

import java.awt.Color;
import java.awt.Graphics;
import javafx.embed.swing.JFXPanel;
import javax.swing.JPanel;
import wormgame.domain.Apple;
import wormgame.domain.Piece;
import wormgame.game.WormGame;

/**
 *
 * @author Sparkcaster
 */
public class DrawingBoard extends JPanel implements Updatable {

    private int plength;
    private WormGame worm;

    public DrawingBoard(WormGame wormgame, int plength) {
        this.plength = plength;
        this.worm = wormgame;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.black);
        for (Piece p : this.worm.getWorm().getPieces()) {
            g.fill3DRect(p.getX() * this.plength, p.getY() * this.plength, this.plength, this.plength, true);

        }
        g.setColor(Color.RED);
        Apple ap = this.worm.getApple();
        g.fillOval(ap.getX() * this.plength, ap.getY() * this.plength, this.plength, this.plength);
    }

    @Override
    public void update() {

        super.repaint();

    }
}
