package mainpackage;

public abstract class SalauksenKäsittelijä implements ITiedostonKäsittelijä {
    private final ITiedostonKäsittelijä handlerToBeDecorated;

    public SalauksenKäsittelijä(ITiedostonKäsittelijä handlerToBeDecorated){
        this.handlerToBeDecorated = handlerToBeDecorated;
    }

    @Override
    public void write(String message) {
        handlerToBeDecorated.write(message);
    }

    @Override
    public void read() {
        handlerToBeDecorated.read();
    }

    @Override
    public String getDescription() {
        return handlerToBeDecorated.getDescription();
    }
}
