package mainpackage;

import java.io.File;
import java.util.Scanner;

public class SalauksenPurku extends SalauksenKäsittelijä {
    public SalauksenPurku(ITiedostonKäsittelijä fileToBeCiphered) {
        super(fileToBeCiphered);
    }

    @Override
    public void read(){
        try {
            File file = new File("text.txt");
            String message = "";
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                message += data;
            }
            message = uncipher(message);
            reader.close();
            System.out.println("Purettu viesti: " + message);
        } catch (Exception e) {
            System.out.println("Jokin meni pieleen.");
            e.printStackTrace();
        }
    }

    private String uncipher(String message){
        message = message.replaceAll("[4]", "a");
        message = message.replaceAll("[8]", "b");
        message = message.replaceAll("[€]", "c");
        message = message.replaceAll("[ꓷ]", "d");
        message = message.replaceAll("[3]", "e");
        message = message.replaceAll("[Ⅎ]", "f");
        message = message.replaceAll("[6]", "g");
        message = message.replaceAll("[#]", "h");
        message = message.replaceAll("[1]", "i");
        message = message.replaceAll("[ɾ]", "j");
        message = message.replaceAll("[⋊]", "k");
        message = message.replaceAll("[˥]", "l");
        message = message.replaceAll("[m]", "m");
        message = message.replaceAll("[И]", "n");
        message = message.replaceAll("[0]", "o");
        message = message.replaceAll("[Գ]", "p");
        message = message.replaceAll("[Ϙ]", "q");
        message = message.replaceAll("[Я]", "r");
        message = message.replaceAll("[5]", "s");
        message = message.replaceAll("[7]", "t");
        message = message.replaceAll("[∩]", "u");
        message = message.replaceAll("[v]", "v");
        message = message.replaceAll("[w]", "w");
        message = message.replaceAll("[x]", "x");
        message = message.replaceAll("[⅄]", "y");
        message = message.replaceAll("[z]", "z");
        return message;
    }

    @Override
    public String getDescription(){
        return super.getDescription() + ", avaa salaus";
    }
}
