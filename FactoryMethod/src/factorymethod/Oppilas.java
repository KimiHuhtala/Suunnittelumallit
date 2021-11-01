package factorymethod;

public class Oppilas extends AterioivaOtus {

    public Oppilas(){ setName("Oppilas Paavo"); }

    public Juoma luoJuoma() { return new Limu(); }

    public Ruoka luoRuoka(){ return new Makkara(); }

}
