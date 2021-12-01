package mainpackage;

import Hesburger.*;
import McDonalds.*;

public class Main {
    public static void main(String[] args){

        Kokki chef = new Kokki("Erkki");

        IHampurilaisenRakentaja builder = new HesburgerKasaaja();
        chef.setHamburgerBuilder(builder);

        chef.prepareHamburger();
        System.out.println("\n" + chef + " on tehny sinulle hampurilaisen!\n");
        IHampurilainen hesburger = builder.getHamburger();
        hesburger.describeHamburger();

        builder = new McDonaldsinKasaaja();
        chef.setHamburgerBuilder(builder);

        chef.prepareHamburger();
        System.out.println("\n" + chef + " on tehnyt uuden hampurilaisen sinulle!\n");
        IHampurilainen mcburger = builder.getHamburger();
        mcburger.describeHamburger();
    }
}
