package factorymethod;

public class Main {
    public static void main(String[] args) {
        AterioivaOtus opettja = new Opettaja();
        AterioivaOtus oppilas = new Oppilas();
        AterioivaOtus siivooja = new Siivooja();

        opettja.haveMeal();
        oppilas.haveMeal();
        siivooja.haveMeal();
    }
}
