package singleton;

import java.util.ArrayList;

public class Rovio implements IPeliAla {

    private String name;
    private ArrayList<String> plannedGames;

    public Rovio(){
        name = "Rovio Entertainment";
        plannedGames = new ArrayList<>();
    }

    @Override
    public void sendGameToBeMarketed() {
        Pelit.getInstance().addGame(plannedGames.remove(0));
    }

    @Override
    public void cancelGame(String name) {
        if(Pelit.getInstance().deleteGame(name))
            System.out.println(this.name + " peruttiin " + name + ".");
        else
            System.out.println(this.name + " yritit peruutta olemattoman pelin.");
    }

    @Override
    public void planGames() {
        plannedGames.add("Angry Birds");
        plannedGames.add("Bad Piggies");
        plannedGames.add("Darkfire Heroes");
        plannedGames.add("SWAT Elite Troops");
        plannedGames.add("Dishonored");
        plannedGames.add("Angry Birds Star Wars");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
