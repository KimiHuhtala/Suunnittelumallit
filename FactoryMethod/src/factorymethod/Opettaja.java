package factorymethod;

public class Opettaja extends AterioivaOtus {

    public Opettaja(){ setName("Opettaja Pekka"); }

    public Juoma luoJuoma(){ return new Vesi(); }

    public Ruoka luoRuoka(){ return new Salaatti(); }

}
