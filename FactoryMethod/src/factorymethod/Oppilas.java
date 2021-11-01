package factorymethod;

public class Oppilas extends AterioivaOtus {

    public Oppilas(){ setName("Student Sharon"); }

    public Juoma createDrink() { return new Limu(); }

    public Ruoka createFood(){ return new Makkara(); }

}
