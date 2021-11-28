package mainpackage.bulbasaurLinja;

import mainpackage.*;

public class IvysaurState implements IIEvolutionState {

    private static IvysaurState instance;

    private IvysaurState() {}

    public static IvysaurState getInstance(){
        if(instance == null)
            instance = new IvysaurState();
        return instance;
    }

    @Override
    public void evolve(Pokemon pokemon) {
        System.out.println("\u001B[33m Onnittelut! " + evolutionName() + " on kehittynyt " +
                VenusaurState.getInstance().evolutionName() + "iksi! \u001B[0m");
        pokemon.setEvolutionState(VenusaurState.getInstance());
    }

    @Override
    public Move move1() {
        return new Move("Poison powder", 270);
    }

    @Override
    public Move move2() {
        return new Move("Sleep Powder", 190);
    }

    @Override
    public Move move3() {
        return new Move("Seed Bomb", 420);
    }

    @Override
    public Move move4() {
        return new Move("Razor Leaf",400);
    }

    @Override
    public String evolutionName() {
        return "Ivysaur";
    }

    @Override
    public int evolutionStage() {
        return 2;
    }

    @Override
    public int accept(IVisitor visitor){
        return visitor.visit(this);
    }
}
