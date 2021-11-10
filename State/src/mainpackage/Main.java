package mainpackage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.println("POKEMON PELI!");

        System.out.println("Kirjoita nimesi: ");
        String name = reader.nextLine();

        Pokemon pokemon = new Pokemon();
        System.out.println("Tervettuloa pokemonkouluttaja " + name + "!\nSinun aloitus pokemonisi on " + pokemon.getEvolutionName() +
                "! Kouluta pokemoniasi, jotta se kehittyy!");

        char select;
        do {
            System.out.println("\n\t\t\t1. Käytä " + pokemon.getEvolutionName() + " ensimmäistä liikettä");
            System.out.println("\t\t\t2. Käytä " + pokemon.getEvolutionName() + " toista liikettä");
            System.out.println("\t\t\t3. Käytä " + pokemon.getEvolutionName() + " kolmatta liikettä");
            System.out.println("\t\t\t4. Käytä " + pokemon.getEvolutionName() + " neljättä liikettä");
            System.out.println("\t\t\t5. Poistu ");
            System.out.print("\n\n");
            try{
                select = reader.nextLine().charAt(0);
            }catch (Exception e){
                select = '6';
            }
            switch (select) {
                case '1':
                    pokemon.move1();
                    break;
                case '2':
                    pokemon.move2();
                    break;
                case '3':
                    pokemon.move3();
                    break;
                case '4':
                    pokemon.move4();
                    break;
                case '5':
                    System.out.println("Kiitos pelaamisesta, tuloksesi oli: " + pokemon.getExperience() + "!");
                    break;
                case '6':
                    break;
            }
        }while(select != '5');
    }
}
