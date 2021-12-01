package Hesburger.parts;

public class Extrat implements IHampurilaisenOsa {

    private String name;

    public Extrat(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return " " + this.name + " ";
    }

}
