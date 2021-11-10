package mainpackage;

import java.io.*;
import java.util.Scanner;

public class TiedostonKäsittelijä implements ITiedostonKäsittelijä {
    @Override
    public void write(String message) {
        try {
            FileWriter writer = new FileWriter("text.txt");
            writer.write(message);
            writer.close();
            System.out.println("Onnistuneesti lisättiin teksti tiedostoon.");
        } catch (IOException e) {
            System.out.println("Jokin meni pieleen.");
            e.printStackTrace();
        }
    }

    @Override
    public void read() {
        try {
            File file = new File("text.txt");
            String message = "";
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                message += data;
            }
            reader.close();
            System.out.println("Lue salattu viesti: " + message);
        } catch (FileNotFoundException e) {
            System.out.println("Jokin meni pieleen.");
            e.printStackTrace();
        }
    }

    @Override
    public String getDescription() {
        return "Tiedoston Hallitsija";
    }
}
