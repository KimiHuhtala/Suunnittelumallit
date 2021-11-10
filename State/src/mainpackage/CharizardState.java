package mainpackage;

public class CharizardState implements IEvolutionState {

    private static CharizardState instance;

    private CharizardState() {}

    public static CharizardState getInstance(){
        if(instance == null)
            instance = new CharizardState();
        return instance;
    }

    @Override
    public void evolve(Pokemon pokemon) {
        System.out.println("Tämä pokemon ei voi kehittyä enempää, koska tämä on sen viimeinen muoto!");
    }

    @Override
    public Move move1() {
        return new Move("Tuli kierre", 500);
    }

    @Override
    public Move move2() {
        return new Move("Horna", 550);
    }

    @Override
    public Move move3() {
        return new Move("Pyörremyrsky", 680);
    }

    @Override
    public Move move4() {
        return new Move("Lohikäärmeen Lyönti", 640);
    }

    @Override
    public String evolutionName() {
        return "Charizard";
    }

    @Override
    public int evolutionStage() {
        return 3;
    }
}
