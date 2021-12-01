package Hesburger.parts;

public class Salaatti implements IHampurilaisenOsa {

    private String name;

    public Salaatti(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return " " + this.name + " ";
    }

}
