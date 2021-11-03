package composite;

public class NettikorttiPCIe implements KoneenOsat {

    @Override
    public double haeHinta() {
        return 56.50;
    }

    @Override
    public String haeOsa() {
        return "(PEXUSB312C3)";
    }
}
