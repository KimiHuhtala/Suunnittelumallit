package factorymethod;

public abstract class AterioivaOtus {

    Juoma juoma = null;
    Ruoka ruoka = null;
    String nimi = null;

    public abstract Juoma luoJuoma();
    public abstract Ruoka luoRuoka();

    public void syöAteria(){
        tulosta();
        syö();
        juo();
    }

    public void tulosta(){
        System.out.println("\n" + this.nimi + ":");
    }

    public void syö(){
        if(ruoka == null)
            ruoka = luoRuoka();
        System.out.println("Kylläpä " + ruoka + " maistuukin hyvältä!");
    }

    public void juo(){
        if (juoma == null)
            juoma = luoJuoma();
        System.out.println("Aterian jälkeen " + juoma + " tekee terää!");
    }

    public void setNimi(String nimi){
        this.nimi = nimi;
    }
}
