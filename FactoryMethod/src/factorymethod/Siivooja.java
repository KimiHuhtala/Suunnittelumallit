package factorymethod;

public class Siivooja extends AterioivaOtus {

    public Siivooja(){ setName("Siivooja Masi"); }

    public Juoma luoJuoma(){ return new Tee(); }

    public Ruoka luoRuoka(){ return new Donitsi(); }

}
