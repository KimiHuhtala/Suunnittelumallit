package mainpackage;

public class Esimies extends PalkankorotusOikeus {

    protected static final double RAISABLE = BASE_RAISE;

    private String name;

    public Esimies(String name){
        this.name = name;
    }

    @Override
    public void processRequest(PalkkaPyyntö request){
        if(request.raisePercentage() < RAISABLE){
            System.out.println("Esimies " + name + " hyväksyy " + request.raisePercentage() + "% palkankorotuksen " + request.getWorker().getName()+"lle");
            request.getWorker().setSalary(request.getNewSalary());
        }else
            super.processRequest(request);
    }

}
