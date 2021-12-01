package adapter;

import javax.swing.*;

/**
 * @author  Kimi Huhtala
 */

public abstract class Muoto {

    protected int x, y;

    public Muoto(int x, int y){
        this.x = x;
        this.y = y;
    }

    protected void generateView(JPanel panel, String title){
        JFrame frame = new JFrame();
        frame.setTitle("Piirretään " + title);
        frame.setSize(800, 800);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(panel);
    }

    public abstract void boundingBox();
    public abstract void draw();
}