package singleton;

public class Gigantti implements IPeliKauppa {

    private String name;

    public Gigantti(){
        name = "Gigantti";
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
