package mainpackage;

public class Main {
    public static void main(String[] args){

        Screen screen = new Screen();
        Command toggleScreen = new ToggleScreenCommand(screen);
        WallButton button = new WallButton(toggleScreen);

        System.out.println("Valkokangas on nyt ylhäällä, koska teatteri ei ole käytössä...");
        System.out.println();
        button.push();
        System.out.println("Asiakkaat tulivat, joten Valkokangas on nyt alhaalla elokuvia varten...");
        System.out.println();
        button.push();
        System.out.println("Valkokangas on nyt ylhäällä, koska elokuva loppui...");
        System.out.println();
    }
}