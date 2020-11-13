package maze;

import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author few_1
 */
public class Maze {

    public static void main(String[] args) {

        new Maze();
    }

    public Maze() {
        JFrame f = new JFrame();
        f.setTitle("Get Me Out Of Here");
        f.add(new Board());
        f.setSize(464, 485);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBackground(Color.white);
    }
}
