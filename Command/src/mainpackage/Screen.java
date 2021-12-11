package mainpackage;

public class Screen {

    private boolean isScreenUp = true;

    public void toggleScreen(){
        isScreenUp = !isScreenUp;
        System.out.println("Valkokangas on nyt " + (isScreenUp ? "ylhäällä" : "alhaalla"));
        System.out.println();
    }
}
