package factorymethod;

public class Opettaja extends AterioivaOtus {

    public Opettaja(){ setNimi("Opettaja Pekka"); }

    public Juoma luoJuoma(){ return new Vesi(); }

    public Ruoka luoRuoka(){ return new Salaatti(); }

}
