package mainpackage;

public class Pomo extends PalkankorotusOikeus {

    protected static final double RAISABLE = BASE_RAISE * 2.5;

    private String name;

    public Pomo(String name){
        this.name = name;
    }

    @Override
    public void processRequest(PalkkaPyyntö request){
        if(request.raisePercentage() > Esimies.RAISABLE && request.raisePercentage() < RAISABLE){
            System.out.println("Pomo " + name + " hyväksyy " + request.raisePercentage() + "% palkankorotuksen " + request.getWorker().getName()+"lle");
            request.getWorker().setSalary(request.getNewSalary());
        }else
            super.processRequest(request);
    }
}
