package Hesburger;

import Hesburger.parts.IHampurilaisenOsa;
import mainpackage.IHampurilainen;

import java.util.ArrayList;
import java.util.List;

public class HesburgerinHampurilainen implements IHampurilainen {

    private List<IHampurilaisenOsa> hamburger;

    public HesburgerinHampurilainen(){
        hamburger = new ArrayList<>();
    }

    public void addHamburgerPart(IHampurilaisenOsa part){
        hamburger.add(part);
    }

    @Override
    public void describeHamburger(){
        System.out.println("Hesburgerin hampurilainen:");
        for (IHampurilaisenOsa hamburger : hamburger)
            System.out.println(hamburger);
    }

}
