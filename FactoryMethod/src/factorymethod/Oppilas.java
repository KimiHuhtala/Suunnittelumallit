package factorymethod;

public class Oppilas extends AterioivaOtus {

    public Oppilas(){ setNimi("Oppilas Paavo"); }

    public Juoma luoJuoma() { return new Limu(); }

    public Ruoka luoRuoka(){ return new Makkara(); }

}
