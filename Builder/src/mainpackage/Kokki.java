package mainpackage;

public class Kokki {

    private IHampurilaisenRakentaja hamburgerBuilder;
    private String name;

    public Kokki(String name){
        this.name = name;
    }

    public void setHamburgerBuilder(IHampurilaisenRakentaja hamburgerBuilder) {
        this.hamburgerBuilder = hamburgerBuilder;
    }

    public void prepareHamburger(){
        hamburgerBuilder.createNewHamburger();
        hamburgerBuilder.buildBun(true);
        hamburgerBuilder.buildSalad();
        hamburgerBuilder.buildExtra();
        hamburgerBuilder.buildPatty();
        hamburgerBuilder.buildMayonnaise();
        hamburgerBuilder.buildBun(false);
    }

    @Override
    public String toString(){
        return this.name;
    }
}
