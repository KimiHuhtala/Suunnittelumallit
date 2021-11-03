package composite;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class EmolevyMSI implements KoneenOsat {

    private ArrayList<KoneenOsat> componentit = new ArrayList<>();

    @Override
    public double haeHinta() {
        double hinta = 164.90;
        for (KoneenOsat part : componentit)
            hinta += part.haeHinta();
        return BigDecimal.valueOf(hinta).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    @Override
    public String haeOsa() {
        String msg = "(MSI MAG B550M Mortar)";
        for (KoneenOsat part : componentit)
            msg += " " + part.haeOsa() + " ";
        return msg;
    }

    public void lisaaKomponentti(KoneenOsat component){
        componentit.add(component);
    }

    public boolean removeComponent(KoneenOsat component){
        for(KoneenOsat part : componentit){
            if(part.haeOsa().equals(component.haeOsa())){
                componentit.remove(component);
                return true;
            }
        }
        return false;
    }

    public KoneenOsat haeKomponentti(int index){
        return componentit.get(index);
    }

    public int haeKomponenttienMaara(){
        return componentit.size();
    }
}
