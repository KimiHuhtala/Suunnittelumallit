package abstractmethod;

public class AdidasTehdas implements Tehdas {

    @Override
    public String createHattu() {
        return new AdidasHattu().toString();
    }

    @Override
    public String createPaita() {
        return new AdidasPaita().toString();
    }

    @Override
    public String createHousut() {
        return new AdidasHousut().toString();
    }

    @Override
    public String createKengät() {
        return new AdidasKengät().toString();
    }
}
