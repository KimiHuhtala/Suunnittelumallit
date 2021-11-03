package composite;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class EmolevyAsus implements KoneenOsat {

    private ArrayList<KoneenOsat> componentit = new ArrayList<>();

    @Override
    public double haeHinta() {
        double hinta = 529.90;
        for (KoneenOsat part : componentit)
            hinta += part.haeHinta();
        return BigDecimal.valueOf(hinta).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    @Override
    public String haeOsa() {
        String msg = "(Asus ROG MAXIMUS XIII HERO)";
        for (KoneenOsat part : componentit)
            msg += " " + part.haeOsa() + " ";
        return msg;
    }

    public void lisaaKomponentti(KoneenOsat component){
        componentit.add(component);
    }

    public boolean poistaKomponentti(KoneenOsat component){
        for(KoneenOsat osa : componentit){
            if(osa.haeOsa().equals(component.haeOsa())){
                componentit.remove(component);
                return true;
            }
        }
        return false;
    }

    public KoneenOsat haeComponentit(int index){
        return componentit.get(index);
    }

    public int haeKomponenttienMaara(){
        return componentit.size();
    }
}
