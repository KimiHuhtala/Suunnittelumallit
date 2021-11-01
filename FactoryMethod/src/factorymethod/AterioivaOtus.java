package factorymethod;

public abstract class AterioivaOtus {

    Juoma juoma = null;
    Ruoka ruoka = null;
    String nimi = null;

    public abstract Juoma luoJuoma();
    public abstract Ruoka luoRuoka();

    public void haveMeal(){
        speaker();
        eat();
        juo();
    }

    public void speaker(){
        System.out.println("\n" + this.nimi + ":");
    }

    public void eat(){
        if(ruoka == null)
            ruoka = luoRuoka();
        System.out.println("Kylläpä " + ruoka + " maistuukin hyvältä!");
    }

    public void juo(){
        if (juoma == null)
            juoma = luoJuoma();
        System.out.println("Aterian jälkeen " + juoma + " tekee terää!");
    }

    public void setName(String name){
        this.nimi = nimi;
    }
}
