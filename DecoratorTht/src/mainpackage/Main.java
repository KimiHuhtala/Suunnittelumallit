package mainpackage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kirjoita teksti joka salataan:");
        String text = scanner.nextLine();

        ITiedostonKäsittelijä tiedostonKäsittelijä = new TiedostonKäsittelijä();
        tiedostonKäsittelijä.write(text);
        tiedostonKäsittelijä.read();

        tiedostonKäsittelijä = new Salaus(new TiedostonKäsittelijä());
        tiedostonKäsittelijä.write(text);
        tiedostonKäsittelijä.read();

        tiedostonKäsittelijä = new SalauksenPurku(new TiedostonKäsittelijä());
        tiedostonKäsittelijä.read();
    }
}
