package abstractmethod;

public class BossTehdas implements Tehdas {

    @Override
    public String createHattu() {
        return new BossHattu().toString();
    }

    @Override
    public String createPaita() {
        return new BossPaita().toString();
    }

    @Override
    public String createHousut() {
        return new BossHousut().toString();
    }

    @Override
    public String createKengät() {
        return new BossKenät().toString();
    }
}
