package singleton;

public class Appstore implements IPeliKauppa {

    private String name;

    public Appstore(){
        name = "Apple appstore";
    }

    @Override
    public void marketGame() {
        System.out.println(name + " markkinoi peliä nimeltä " + Pelit.getInstance().publishGame());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
