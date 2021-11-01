package factorymethod;

public class Siivooja extends AterioivaOtus {

    public Siivooja(){ setName("Janitor Jan"); }

    public Juoma createDrink(){ return new Tee(); }

    public Ruoka createFood(){ return new Donitsi(); }

}
