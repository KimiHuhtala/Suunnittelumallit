package abstractmethod;

public class Main {
    public static void main(String[] args){

        Koodaaja koodaaja = new Koodaaja("Jasper", "Koodaaja");
        // Adidas tehdas
        ITehdas tehdas = new AdidasTehdas();

        koodaaja.setHattu(tehdas.createHattu());
        koodaaja.setPaita(tehdas.createPaita());
        koodaaja.setHousut(tehdas.createHousut());
        koodaaja.setKengät(tehdas.createKengät());

        System.out.println("\n\n" + koodaaja.getNimi() + " " + koodaaja.getAmmatti() + " on opiskelija jolla on päällään: \n" +
        koodaaja.getHattu() + ", \n" + koodaaja.getPaita() + ", \n" + koodaaja.getHousut() + ", \n" + koodaaja.getKengät());

        System.out.println("\n\n mutta kolmen vuoden jälkeen...");
        // Boss tehdas
        tehdas = new BossTehdas();

        koodaaja.setHattu(tehdas.createHattu());
        koodaaja.setPaita(tehdas.createPaita());
        koodaaja.setHousut(tehdas.createHousut());
        koodaaja.setKengät(tehdas.createKengät());
        
        System.out.println("\n\n" + koodaaja.getNimi() + "-" + koodaaja.getAmmatti() + " On töissä ja hänellä on päällään: \n" +
        koodaaja.getHattu() + ", \n" + koodaaja.getPaita() + ", \n" + koodaaja.getHousut() + ", \n" + koodaaja.getKengät());
    }
}
