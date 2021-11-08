package singleton;

public class Main {
    public static void main(String[] args){
        IPeliAla supercell = new Supercell();
        IPeliAla rovio = new Rovio();

        IPeliKauppa appstore = new Appstore();
        IPeliKauppa gigantti = new Gigantti();

        System.out.println("\nPeli alan esimerkki singletonista:");

        supercell.planGames();
        rovio.planGames();

        System.out.printf("\n%silla oli hyviä ideoita, joten he tekivät 3 peliä...\n", supercell.getName());

        for(int i = 0; i < 3; i++)
            supercell.sendGameToBeMarketed();

        System.out.printf("\n%s sopivat että %s marketoi heidän kolmea peliään.\n", supercell.getName(), appstore.getName());

        for(int i = 0; i < 3; i++)
            appstore.marketGame();

        System.out.printf("\nMolemmilla %silla ja %silla on ollut putki hyvä ideoita, he ovat kumpikin tehneet 2 peliä...\n",
                supercell.getName(), rovio.getName());

        for(int i = 0; i < 2; i++)
            supercell.sendGameToBeMarketed();

        for(int i = 0; i < 2; i++)
            rovio.sendGameToBeMarketed();

        System.out.printf("\n%s halusi, että %s marketoi yhtä heidän peleistään ja %s markkinoi toista. " +
                            "%s on sopinut että %s marketoi kaikkia heidän pelejään.\n", supercell.getName(), appstore.getName(),
                gigantti.getName(), rovio.getName(), gigantti.getName());

        appstore.marketGame();
        for(int i = 0; i < 3; i++)
            gigantti.marketGame();

        System.out.printf("\n%sillä ei ole ideoita. %s on tehny jo 4 peliä!\n",
                supercell.getName(), rovio.getName());

        for(int i = 0; i < 4; i++)
            rovio.sendGameToBeMarketed();

        System.out.printf("\n%s haluaa %sssa markkinoida 3 heidän 4 pelistään ja %s marketoi heidän viimeisintä.\n",
                rovio.getName(), appstore.getName(), gigantti.getName());

        for(int i = 0; i < 3; i++)
            appstore.marketGame();

        gigantti.marketGame();
    }
}
