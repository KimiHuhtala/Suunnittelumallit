package mainpackage;

public class CharmanderState implements IEvolutionState {

    private static CharmanderState instance;

    private CharmanderState() {}

    public static CharmanderState getInstance(){
        if(instance == null)
            instance = new CharmanderState();
        return instance;
    }

    @Override
    public void evolve(Pokemon pokemon) {
        System.out.println("\u001B[33m Onnittelut! " + evolutionName() + " on kehittynyt " +
                CharmeleonState.getInstance().evolutionName()+"iksi" + "! \u001B[0m");
        pokemon.setEvolutionState(CharmeleonState.getInstance());
    }

    @Override
    public Move move1() {
        return new Move("Murina", 200);
    }

    @Override
    public Move move2() {
        return new Move("Raapaisu", 220);
    }

    @Override
    public Move move3() {
        return new Move("Hiillos", 210);
    }

    @Override
    public Move move4() {
        return new Move("Lohikäärmeen hönkäys", 250);
    }

    @Override
    public String evolutionName() {
        return "Charmander";
    }

    @Override
    public int evolutionStage() {
        return 1;
    }
}
