package Hesburger.parts;

public class Majoneesi implements IHampurilaisenOsa {

    private String name;

    public Majoneesi(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return " " + this.name + " ";
    }

}
