package factorymethod;

public class Opettaja extends AterioivaOtus {

    public Opettaja(){ setName("Teacher Trudy"); }

    public Juoma createDrink(){ return new Vesi(); }

    public Ruoka createFood(){ return new Salaatti(); }

}
