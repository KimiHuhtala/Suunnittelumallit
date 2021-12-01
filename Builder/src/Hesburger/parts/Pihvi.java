package Hesburger.parts;

public class Pihvi implements IHampurilaisenOsa {

    private String name;

    public Pihvi(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return " " + this.name + " ";
    }

}
