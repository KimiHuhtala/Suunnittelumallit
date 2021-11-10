package mainpackage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kirjoita teksti joka salataan:");
        String text = scanner.nextLine();

        ITiedostonKäsittelijä fileHandler = new TiedostonKäsittelijä();
        fileHandler.write(text);
        fileHandler.read();

        fileHandler = new Salaus(new TiedostonKäsittelijä());
        fileHandler.write(text);
        fileHandler.read();

        fileHandler = new SalauksenPurku(new TiedostonKäsittelijä());
        fileHandler.read();
    }
}
