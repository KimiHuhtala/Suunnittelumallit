package mainpackage;

public class Main {
    public static void main(String[] args){
        Worker worker1 = new Worker("Esa", 1962.31);
        Worker worker2 = new Worker("Matti", 2000.73);
        Worker worker3 = new Worker("Petri", 1299.40);
        Esimies superior = new Esimies("Mikko");
        Pomo boss = new Pomo("Seppo");
        Johtaja ceo = new Johtaja("Pete");

        superior.setSuccessor(boss);
        boss.setSuccessor(ceo);

        System.out.println("\n");

        System.out.println(worker1.getName() + " on todistanut olevansa hyvä työntekijä. " + worker1.getName() +
                " pyytää palkan korotusta " + worker1.getSalary() + "€, uuteen 1969.31€ palkkaan");
        superior.processRequest(new PalkkaPyyntö(worker1, worker1.getSalary(), 1969.31));

        System.out.println("\n");

        System.out.println(worker1.getName() + " on työskennellyt kovasti, ja kokee ansaitsevansa vielä enemmän palkkaa. " + worker1.getName() +
                  " pyytää palkan korotusta " + worker1.getSalary() + "€, uuteen 2000.32€ palkkaan");
        superior.processRequest(new PalkkaPyyntö(worker1, worker1.getSalary(), 2000.32));

        System.out.println("\n");

        System.out.println(worker2.getName() + " on tehny erittäin paljon töitä ahkerasti. " + worker2.getName() +
                " pyytää palkan korotusta " + worker2.getSalary() + "€, uuteen 2046.42€  palkkaan");
        superior.processRequest(new PalkkaPyyntö(worker2, worker2.getSalary(), 2046.42));

        System.out.println("\n");

        System.out.println(worker3.getName() + " on ylennetty koska hän on tehny erittäin paljon töitä ja " +
                "tuottanut rahaa yhtiölle. " + worker3.getName() + " pyytää palkan korotusta " + worker3.getSalary() + "€, uuteen 1400.45€ palkkaan");
        superior.processRequest(new PalkkaPyyntö(worker3, worker3.getSalary(), 1400.45));

        System.out.println("\n");

        System.out.println(worker1.getName() + " on ollut erittäin ahkera ja kokee ansaitsevansa merkittävän palkankorotuksen. " +
                worker1.getName() + " pyytää palkan korotusta " + worker1.getSalary() + "€, uuteen 2090.50€ palkkaan");
        superior.processRequest(new PalkkaPyyntö(worker1, worker1.getSalary(), 2590.50));

    }
}
