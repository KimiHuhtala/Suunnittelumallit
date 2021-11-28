package mainpackage.squirtleLinja;

import mainpackage.*;

public class SquirtleState implements IIEvolutionState {

    private static SquirtleState instance;

    private SquirtleState() {}

    public static SquirtleState getInstance(){
        if(instance == null)
            instance = new SquirtleState();
        return instance;
    }

    @Override
    public void evolve(Pokemon pokemon) {
        System.out.println("\u001B[33m Onnittelut! " + evolutionName() + " on kehittynyt " +
                WartortleState.getInstance().evolutionName() + "iksi! \u001B[0m");
        pokemon.setEvolutionState(WartortleState.getInstance());
    }

    @Override
    public Move move1() {
        return new Move("Tackle", 110);
    }

    @Override
    public Move move2() {
        return new Move("Tail Whip", 180);
    }

    @Override
    public Move move3() {
        return new Move("Water Gun", 130);
    }

    @Override
    public Move move4() {
        return new Move("Water Pulse", 150);
    }

    @Override
    public String evolutionName() {
        return "Squirtle";
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
