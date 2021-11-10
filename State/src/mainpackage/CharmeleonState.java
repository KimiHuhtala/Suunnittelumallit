package mainpackage;

public class CharmeleonState implements IEvolutionState {

    private static CharmeleonState instance;

    private CharmeleonState() {}

    public static CharmeleonState getInstance(){
        if(instance == null)
            instance = new CharmeleonState();
        return instance;
    }

    @Override
    public void evolve(Pokemon pokemon) {
        System.out.println("\u001B[33m Onnittelut! " + evolutionName() + " on kehittynyt " +
                CharizardState.getInstance().evolutionName()+"iksi" + "! \u001B[0m");
        pokemon.setEvolutionState(CharizardState.getInstance());
    }

    @Override
    public Move move1() {
        return new Move("Tuli hammas", 250);
    }

    @Override
    public Move move2() {
        return new Move("Isku", 250);
    }

    @Override
    public Move move3() {
        return new Move("Liekinheitin", 350);
    }

    @Override
    public Move move4() {
        return new Move("Lohikäärme kierre",350);
    }

    @Override
    public String evolutionName() {
        return "Charmeleon";
    }

    @Override
    public int evolutionStage() {
        return 2;
    }
}
