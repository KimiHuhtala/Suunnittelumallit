package mainpackage;

public class Johtaja extends PalkankorotusOikeus {

    private String name;

    public Johtaja(String name){
        this.name = name;
    }

    @Override
    public void processRequest(PalkkaPyyntö request){
        if(request.raisePercentage() > Pomo.RAISABLE){
            System.out.println("Toimitusjohtaja " + name + " hyväksyy " + request.raisePercentage() + "% palkankorotuksen " + request.getWorker().getName()+"lle");
            request.getWorker().setSalary(request.getNewSalary());
        }else
            System.out.println("Tässä pyynnössä on jotain vialla.");
    }
}
