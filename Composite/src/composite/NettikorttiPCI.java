package composite;

public class NettikorttiPCI implements KoneenOsat {
    @Override
    public double haeHinta() {
        return 50.00;
    }

    @Override
    public String haeOsa() {
        return "(PCI-E 10)";
    }
}
