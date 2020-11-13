package maze;

import java.awt.*;
import java.io.*;
import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author few_1
 */
public class Player {

    private int tileX, tileY;

    private Image player;
    URL imageURL;

    public Player() {

        imageURL = this.getClass().getResource("player11.png");
        player = new ImageIcon(imageURL).getImage();

        tileX = 1;
        tileY = 1;

    }

    public Image getPlayer() {
        return player;
    }

    public int getTileX() {
        return tileX;
    }

    public int getTileY() {
        return tileY;
    }

    public void move(double dx, double dy) {

        tileX += dx;
        tileY += dy;

    }

}
