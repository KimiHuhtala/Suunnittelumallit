package composite;

class Main {
    public static void main(String[] args){
        Tietokone computer = new Tietokone();

        Tehdas factory = new HalpaKone();
        computer.setComputer(factory.createComputer());
        System.out.println(" --- Edullisin kone --- ");
        System.out.println("Tietokoneen hinta: " + computer.getComputer().haeHinta() + "€");
        System.out.println("Tietokoneen osat: " + computer.getComputer().haeOsa());

        factory = new KeskivertoKone();
        computer.setComputer(factory.createComputer());
        System.out.println("\n --- Keskihintainen kone --- \n");
        System.out.println("Tietokoneen hinta: " + computer.getComputer().haeHinta() + "€");
        System.out.println("Tietokoneen osat: " + computer.getComputer().haeOsa());

        factory = new KallisKone();
        computer.setComputer(factory.createComputer());
        System.out.println("\n --- Kallein kone --- \n");
        System.out.println("Tietokoneen hinta: " + computer.getComputer().haeHinta() + "€");
        System.out.println("Tietokoneen osat: " + computer.getComputer().haeOsa());
    }
}
