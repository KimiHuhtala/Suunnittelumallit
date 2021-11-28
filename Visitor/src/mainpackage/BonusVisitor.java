package mainpackage;

import mainpackage.bulbasaurLinja.*;
import mainpackage.squirtleLinja.*;

public class BonusVisitor implements IVisitor{

    @Override
    public int visit(BulbasaurState bulbasaurState) {
        System.out.println("Annetaan " + bulbasaurState.evolutionName() + " " + bulbasaurState.evolutionStage() * 110 +
                " lisä kokemusta!");
        return bulbasaurState.evolutionStage() * 110;
    }

    @Override
    public int visit(IvysaurState ivysaurState) {
        System.out.println("Annetaan " + ivysaurState.evolutionName() + " " + ivysaurState.evolutionStage() * 140 +
                " lisä kokemusta!");
        return ivysaurState.evolutionStage() * 140;
    }

    @Override
    public int visit(VenusaurState venusaurState) {
        System.out.println("Annetaan " + venusaurState.evolutionName() + " " + venusaurState.evolutionStage() * 200 +
                " lisä kokemusta!");
        return venusaurState.evolutionStage() * 200;
    }

    @Override
    public int visit(SquirtleState squirtleState) {
        System.out.println("Annetaan " + squirtleState.evolutionName() + " " + squirtleState.evolutionStage() * 120 +
                " lisä kokemusta!");
        return squirtleState.evolutionStage() * 120;
    }

    @Override
    public int visit(WartortleState wartortleState) {
        System.out.println("Annetaan " + wartortleState.evolutionName() + " " + wartortleState.evolutionStage() * 130 +
                " lisä kokemusta!");
        return wartortleState.evolutionStage() * 130;
    }

    @Override
    public int visit(BlastoiseState blastoiseState) {
        System.out.println("Annetaan " + blastoiseState.evolutionName() + " " + blastoiseState.evolutionStage() * 190 +
                " lisä kokemusta!");
        return blastoiseState.evolutionStage() * 190;
    }
}