package factorymethod;

public class Main {
    public static void main(String[] args) {
        AterioivaOtus teacher = new Opettaja();
        AterioivaOtus student = new Oppilas();
        AterioivaOtus janitor = new Siivooja();

        teacher.haveMeal();
        student.haveMeal();
        janitor.haveMeal();
    }
}
