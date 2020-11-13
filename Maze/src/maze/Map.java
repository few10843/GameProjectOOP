package maze;

import java.awt.Image;
import java.io.*;
import java.util.*;
import javax.swing.ImageIcon;
import java.net.URL;

/**
 *
 * @author few_1
 */
public class Map {

    private Scanner m;
    private String Map[] = new String[14];

    private Image grass;
    private Image wall;
    private Image door;
    private Image dooropen;
    private Image fragment;
    private Image trap;
    URL imageURL;

    public Map() {

        imageURL = this.getClass().getResource("grass.png");
        grass = new ImageIcon(imageURL).getImage();
        imageURL = this.getClass().getResource("wall.png");
        wall = new ImageIcon(imageURL).getImage();
        imageURL = this.getClass().getResource("door.png");
        door = new ImageIcon(imageURL).getImage();
        imageURL = this.getClass().getResource("dooropen.png");
        dooropen = new ImageIcon(imageURL).getImage();
        imageURL = this.getClass().getResource("f1.png");
        fragment = new ImageIcon(imageURL).getImage();
        imageURL = this.getClass().getResource("trap.png");
        trap = new ImageIcon(imageURL).getImage();

        openFile();
        readFile();
        closeFile();
    }

    public Image getGrass() {
        return grass;
    }

    public Image getWall() {
        return wall;
    }

    public Image getDoor() {
        return door;
    }
    public Image getDooropen(){
        return dooropen;
    }

    public Image getFragment() {
        return fragment;
    }

    public Image getTrap() {
        return trap;
    }

    public String getMap(int x, int y) {
        String index = Map[y].substring(x, x + 1);
        return index;
    }

    public void openFile() {

        try {
            m = new Scanner(new File("Map.txt"));
        } catch (Exception e) {
            System.out.println("Error loading map");
        }
    }

    public void readFile() {
        while (m.hasNext()) {
            for (int i = 0; i < 14; i++) {
                Map[i] = m.next();
            }
        }
    }

    public void closeFile() {
        m.close();

    }
}
