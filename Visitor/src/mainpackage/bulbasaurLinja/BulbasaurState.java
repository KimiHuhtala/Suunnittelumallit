package mainpackage.bulbasaurLinja;

import mainpackage.*;

public class BulbasaurState implements IIEvolutionState {

    private static BulbasaurState instance;

    private BulbasaurState() {}

    public static BulbasaurState getInstance(){
        if(instance == null)
            instance = new BulbasaurState();
        return instance;
    }

    @Override
    public void evolve(Pokemon pokemon) {
        System.out.println("\u001B[33m Onnittelut! " + evolutionName() + " on kehittynyt " +
                IvysaurState.getInstance().evolutionName() + "iksi! \u001B[0m");
        pokemon.setEvolutionState(IvysaurState.getInstance());
    }

    @Override
    public Move move1() {
        return new Move("Tackle", 110);
    }

    @Override
    public Move move2() {
        return new Move("Vine Whip", 170);
    }

    @Override
    public Move move3() {
        return new Move("Growth", 90);
    }

    @Override
    public Move move4() {
        return new Move("Leech Seed", 120);
    }

    @Override
    public String evolutionName() {
        return "Bulbasaur";
    }

    @Override
    public int evolutionStage() {
        return 1;
    }

    @Override
    public int accept(IVisitor visitor){
        return visitor.visit(this);
    }
}
