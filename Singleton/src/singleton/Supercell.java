package singleton;

import java.util.ArrayList;

public class Supercell implements IPeliAla {

    private String name;
    private ArrayList<String> plannedGames;

    public Supercell(){
        name = "Supercell";
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
        plannedGames.add("Clash of clans");
        plannedGames.add("Hay Day");
        plannedGames.add("Boom Beach");
        plannedGames.add("Clash Royale");
        plannedGames.add("Brawl Stars");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
