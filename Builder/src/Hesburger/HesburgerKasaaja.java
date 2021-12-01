package Hesburger;

import Hesburger.parts.*;
import mainpackage.IHampurilaisenRakentaja;

public class HesburgerKasaaja implements IHampurilaisenRakentaja {

    private HesburgerinHampurilainen hamburger;

    @Override
    public void createNewHamburger() {
        hamburger = new HesburgerinHampurilainen();
    }

    @Override
    public void buildBun(boolean top) {
        hamburger.addHamburgerPart(new Sämplyä("Sämpylä seessamin siemenillä,", top));
    }

    @Override
    public void buildPatty() {
        hamburger.addHamburgerPart(new Pihvi("Medium pihvi"));
    }

    @Override
    public void buildSalad() {
        hamburger.addHamburgerPart(new Salaatti("Salaatti, kurrkku ja tomaatti"));
    }

    @Override
    public void buildMayonnaise() {
        hamburger.addHamburgerPart(new Majoneesi("Kevyt majoneesi"));
    }

    @Override
    public void buildExtra() {
        hamburger.addHamburgerPart(new Extrat("Cheddar juustoa"));
    }

    @Override
    public HesburgerinHampurilainen getHamburger() {
        return hamburger;
    }
}
