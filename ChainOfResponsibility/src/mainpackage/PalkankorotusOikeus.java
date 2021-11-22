package mainpackage;

public abstract class PalkankorotusOikeus {

    protected static final double BASE_RAISE = 2; // Percentage
    private PalkankorotusOikeus successor;

    public void setSuccessor(PalkankorotusOikeus successor) {
        this.successor = successor;
    }
    public void processRequest(PalkkaPyyntö request){
        if (successor != null)
            successor.processRequest(request);
    }

}
