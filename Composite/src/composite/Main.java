package composite;

class Main {
    public static void main(String[] args){
        Tietokone tietokone = new Tietokone();

        Tehdas tehdas = new HalpaKone();
        tietokone.setKone(tehdas.luoTietokone());
        System.out.println("--Edullisin kone--");
        System.out.println("Tietokoneen hinta: " + tietokone.getKone().haeHinta() + "€");
        System.out.println("Tietokoneen osat: " + tietokone.getKone().haeOsa());
        System.out.println("---");

        tehdas = new KeskivertoKone();
        tietokone.setKone(tehdas.luoTietokone());
        System.out.println("--Keskihintainen kone--");
        System.out.println("Tietokoneen hinta: " + tietokone.getKone().haeHinta() + "€");
        System.out.println("Tietokoneen osat: " + tietokone.getKone().haeOsa());
        System.out.println("---");

        tehdas = new KallisKone();
        tietokone.setKone(tehdas.luoTietokone());
        System.out.println("--Kallein kone--");
        System.out.println("Tietokoneen hinta: " + tietokone.getKone().haeHinta() + "€");
        System.out.println("Tietokoneen osat: " + tietokone.getKone().haeOsa());
        System.out.println("---");
    }
}
