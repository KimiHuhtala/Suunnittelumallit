package mainpackage;

import mainpackage.bulbasaurLinja.BulbasaurState;
import mainpackage.squirtleLinja.SquirtleState;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.println("Syötä nimesi: ");
        String name = reader.nextLine();

        Pokemon pokemon1 = new Pokemon(SquirtleState.getInstance());
        Pokemon pokemon2 = new Pokemon(BulbasaurState.getInstance());
        Pokemon currentPokemon = pokemon1;
        System.out.println("Tervettuloa " + name + ".\nSinun aloitus pokemonisi ovat " + pokemon1.getEvolutionName() +
                " ja " + pokemon2.getEvolutionName() + "! Kouluta pokemonisi käyttämällä liikkeitä!");
        char select;
        do {
            System.out.println("\n\t\t\t1. Käytä " + currentPokemon.getEvolutionName()+ "n" + " eka liike");
            System.out.println("\t\t\t2. Käytä " + currentPokemon.getEvolutionName() + "n" + " toinen liike");
            System.out.println("\t\t\t3. Käytä " + currentPokemon.getEvolutionName() + "n" + " kolmas liike");
            System.out.println("\t\t\t4. Käytä " + currentPokemon.getEvolutionName() + "n" + " neljäs liike");

            System.out.println("\n\t\t\t5. Tämän hetkinen pokemon");
            System.out.println("\t\t\t6. Vaihda pokemonisi");
            System.out.println("\t\t\t7. Anna extra pisteitä");
            System.out.println("\t\t\t8. Poistu. ");

            try{
                select = reader.nextLine().charAt(0);
            }catch (Exception e){
                select = '0';
            }
            switch (select) {
                case '1':
                    currentPokemon.move1();
                    break;
                case '2':
                    currentPokemon.move2();
                    break;
                case '3':
                    currentPokemon.move3();
                    break;
                case '4':
                    currentPokemon.move4();
                    break;
                case '5':
                    System.out.println(currentPokemon.getEvolutionName());
                    break;
                case '6':
                    if(currentPokemon.equals(pokemon1))
                        currentPokemon = pokemon2;
                    else
                        currentPokemon = pokemon1;
                    System.out.println("Vaihdoit pokemonisi " + currentPokemon.getEvolutionName()+"iksi");
                    break;
                case '7':
                    pokemon1.bonusExperience();
                    pokemon2.bonusExperience();
                    break;
                case '8':
                    System.out.println("Kiitos että peläsit, löoppu pisteesi olivat: " +
                                       (pokemon1.getExperience() + pokemon2.getExperience()) + "!");
                    break;
                case '0':
                    break;
            }
        }while(select != '8');
    }
}