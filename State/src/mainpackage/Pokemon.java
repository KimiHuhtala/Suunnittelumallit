package mainpackage;

public class Pokemon {

    private IEvolutionState evolutionState;
    private int experience;

    public Pokemon(){
        evolutionState = CharmanderState.getInstance();
        experience = 0;
    }

    private void evolve(){
        evolutionState.evolve(this);
    }

    public void move1(){
        System.out.println(evolutionState.evolutionName() + " käytti liikettä 1: " + evolutionState.move1().getMoveName() + "!");
        System.out.println(evolutionState.evolutionName() + " sai " + evolutionState.move1().getExperienceGain() +
                " kokemus pisteittä!");

        experience += evolutionState.move1().getExperienceGain();
        System.out.println(evolutionState.evolutionName()+"illa" + " on nyt " + experience + " kokemus pisteittä yhteensä!");
        checkForEvolution();
    }

    public void move2(){
        System.out.println(evolutionState.evolutionName() + " käytti liikettä 2: " + evolutionState.move2().getMoveName() + "!");
        System.out.println(evolutionState.evolutionName() + " sai " + evolutionState.move2().getExperienceGain() +
                " kokemus pisteittä!");

        experience += evolutionState.move2().getExperienceGain();
        System.out.println(evolutionState.evolutionName()+"illa" + " on nyt " + experience + " kokemus pisteittä yhteensä!");
        checkForEvolution();
    }

    public void move3(){
        System.out.println(evolutionState.evolutionName() + " käytti liikettä 3: " + evolutionState.move3().getMoveName() + "!");
        System.out.println(evolutionState.evolutionName() + " sai " + evolutionState.move3().getExperienceGain() +
                " kokemus pisteittä!");

        experience += evolutionState.move3().getExperienceGain();
        System.out.println(evolutionState.evolutionName()+"illa" + " on nyt " + experience + " kokemus pisteittä yhteensä!");
        checkForEvolution();
    }

    public void move4(){
        System.out.println(evolutionState.evolutionName() + " käytti liikettä 4: " + evolutionState.move4().getMoveName() + "!");
        System.out.println(evolutionState.evolutionName() + " sai " + evolutionState.move4().getExperienceGain() +
                " kokemus pisteittä!");

        experience += evolutionState.move4().getExperienceGain();
        System.out.println(evolutionState.evolutionName()+"illa" + " on nyt " + experience + " kokemus pisteittä yhteensä!");
        checkForEvolution();
    }

    private void checkForEvolution(){
        switch (evolutionState.evolutionStage()){
            case 1:
                if(experience >= 500)
                    evolve();
                break;
            case 2:
                if(experience >= 1000)
                    evolve();
                break;
            case 3:
                if(experience >= 1500)
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

    public void setEvolutionState(IEvolutionState evolutionState) {
        this.evolutionState = evolutionState;
    }
}
