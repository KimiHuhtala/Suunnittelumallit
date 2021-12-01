package Hesburger.parts;

public class Sämplyä implements IHampurilaisenOsa {

    private String name;
    private boolean top;

    public Sämplyä(String name, boolean top){
        this.name = name;
        this.top = top;
    }

    @Override
    public String toString(){
        return " " + this.name + " " + (top ? "päällä " : "pohjalla ");
    }

}
