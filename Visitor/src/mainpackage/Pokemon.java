package mainpackage;

public class Pokemon {

    private IIEvolutionState evolutionState;
    private int experience;

    public Pokemon(IIEvolutionState state){
        evolutionState = state;
        experience = 0;
    }

    private void evolve(){
        evolutionState.evolve(this);
    }

    public void move1(){
        System.out.println(evolutionState.evolutionName() + " käytti liikkeen 1: " + evolutionState.move1().getMoveName() + "!");
        System.out.println(evolutionState.evolutionName() + " kerrytit " + evolutionState.move1().getExperienceGain() +
                " kokemus pistettä!");

        experience += evolutionState.move1().getExperienceGain();
        System.out.println(evolutionState.evolutionName() + " on nyt " + experience + " pistettä yhteensä!");
        checkForEvolution();
    }

    public void move2(){
        System.out.println(evolutionState.evolutionName() + " käytti liikkeen 2: " + evolutionState.move2().getMoveName() + "!");
        System.out.println(evolutionState.evolutionName() + " kerrytti " + evolutionState.move2().getExperienceGain() +
                "  kokemus pistettä!");

        experience += evolutionState.move2().getExperienceGain();
        System.out.println(evolutionState.evolutionName() + " on nyt " + experience + " pistettä yhteensä!");
        checkForEvolution();
    }

    public void move3(){
        System.out.println(evolutionState.evolutionName() + " käytti liikkeen 3: " + evolutionState.move3().getMoveName() + "!");
        System.out.println(evolutionState.evolutionName() + " kerrytti " + evolutionState.move3().getExperienceGain() +
                " kokemus pistettä!");

        experience += evolutionState.move3().getExperienceGain();
        System.out.println(evolutionState.evolutionName() + " on nyt " + experience + " pistettä yhteensä!");
        checkForEvolution();
    }

    public void move4(){
        System.out.println(evolutionState.evolutionName() + " käytti liikkeen 4: " + evolutionState.move4().getMoveName() + "!");
        System.out.println(evolutionState.evolutionName() + " kerrytti " + evolutionState.move4().getExperienceGain() +
                " kokemus pistettä!");

        experience += evolutionState.move4().getExperienceGain();
        System.out.println(evolutionState.evolutionName() + " on nyt " + experience + " pistettä yhteensä!");
        checkForEvolution();
    }

    private void checkForEvolution(){
        switch (evolutionState.evolutionStage()){
            case 1:
                if(experience >= 1000)
                    evolve();
                break;
            case 2:
                if(experience >= 5000)
                    evolve();
                break;
            case 3:
                if(experience >= 15000)
                    evolve();
                break;
        }
    }

    public String getEvolutionName() {
        return evolutionState.evolutionName();
    }

    public int getExperience(){
        return experience;
    }

    public void bonusExperience() {
        experience += evolutionState.accept(new BonusVisitor());

        System.out.println(evolutionState.evolutionName() + " on nyt " + experience + " pistettä yhteensä!");
        checkForEvolution();
    }

    public void setEvolutionState(IIEvolutionState evolutionState) {
        this.evolutionState = evolutionState;
    }

    public IIEvolutionState getEvolutionState() {
        return this.evolutionState;
    }
}