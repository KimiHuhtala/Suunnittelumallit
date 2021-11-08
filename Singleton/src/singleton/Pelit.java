package singleton;

import java.util.ArrayList;

public class Pelit {
    private static final Pelit instance = new Pelit();
    private ArrayList<String> gameList = new ArrayList<>();

    private Pelit(){}

    public static Pelit getInstance(){
        return instance;
    }

    public void addGame(String game){
        gameList.add(game);
    }

    public boolean deleteGame(String name){
        if(gameList.isEmpty()){
            return false;
        }else{
            gameList.remove(name);
            return true;
        }
    }

    public String publishGame(){
        return gameList.remove(0);
    }

    public String setGame(int index, String game){
        return gameList.set(index, game);
    }
}
