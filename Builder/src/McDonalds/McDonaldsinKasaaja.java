package McDonalds;

import mainpackage.IHampurilaisenRakentaja;

public class McDonaldsinKasaaja implements IHampurilaisenRakentaja {

    private McDonaldsinHampurilainen hamburger;

    @Override
    public void createNewHamburger() {
        hamburger = new McDonaldsinHampurilainen();
    }

    @Override
    public void buildBun(boolean top) {
        hamburger.addHamburgerPart(" Perus sämpylä, " + (top ? "päällä " : "pohjalla ") + "\n");
    }

    @Override
    public void buildPatty() {
        hamburger.addHamburgerPart(" Medium pihvi \n");
    }

    @Override
    public void buildSalad() {
        hamburger.addHamburgerPart(" Salaatti, sipuli ja suolakurkku \n");
    }

    @Override
    public void buildMayonnaise() {
        hamburger.addHamburgerPart(" Herkullista majoneesia \n");
    }

    @Override
    public void buildExtra() {
        hamburger.addHamburgerPart(" Pekoni siivuja \n");
    }

    @Override
    public McDonaldsinHampurilainen getHamburger() {
        return hamburger;
    }
}
