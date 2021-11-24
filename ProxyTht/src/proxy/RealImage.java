package proxy;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class RealImage implements IImage {

    private final String fileName;
    private final String name;
    private BufferedImage image;
    private boolean loaded = false;

    public RealImage(String fileName, String name){
        this.fileName = fileName;
        this.name = name;
    }

    private void loadImageFromDisk(){

        System.out.println("Ladataan " + fileName);

        try{
            final long startTime = System.currentTimeMillis();
            image = ImageIO.read(new File(fileName));
            final long endTime = System.currentTimeMillis();

            System.out.println("Ladattiin: " + ((endTime - startTime) / 1000F) + " sekunnissa");
            loaded = true;
        }catch (Exception e){
            e.printStackTrace();
            loaded = false;
        }
    }

    @Override
    public void displayImage() {
        if(!loaded)
        loadImageFromDisk();
        JLabel label = new JLabel(new ImageIcon(image));
        JPanel panel = new JPanel();
        panel.add(label);
        JFrame frame = new JFrame();
        frame.setSize(new Dimension(image.getWidth(), image.getHeight()));
        frame.add(panel);
        frame.setVisible(true);
        System.out.println("Näytetään " + fileName);
    }

    @Override
    public void showData() {
        System.out.printf("Name: %32s, path: %100s \n", name, fileName);
    }

    @Override
    public String getName(){
        return this.name;
    }
}
