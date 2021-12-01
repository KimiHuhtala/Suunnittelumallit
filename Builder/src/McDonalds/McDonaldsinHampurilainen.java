package McDonalds;

import mainpackage.IHampurilainen;

public class McDonaldsinHampurilainen implements IHampurilainen {

    private StringBuilder hamburger;

    public McDonaldsinHampurilainen(){
        hamburger = new StringBuilder();
    }

    public void addHamburgerPart(String part){
        hamburger.append(part);
    }

    @Override
    public void describeHamburger(){
        System.out.println("McDonaldsin hampurilainen:");
        System.out.println(hamburger);
    }

}
