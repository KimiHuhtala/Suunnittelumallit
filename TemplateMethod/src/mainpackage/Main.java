package mainpackage;

public class Main {
    public static void main(String[] args){
        System.out.println("Tervettuloa pelaamaan. Valitse kahdesta pelistä mitä haluat pelata!");

        Peli peli = null;
        char select;

        do{
            System.out.println("Pelit:");
            System.out.println("\n\t\t\t1. Kivi, paperi, sakset");
            System.out.println("\t\t\t2. Arvaa numero");
            System.out.println("\t\t\t3. Lopeta pelaaminen");
            System.out.print("\n\n");
            select = Lue.character();
            switch (select) {
                case '1':
                    peli = new KiviPaperiSakset();
                    break;
                case '2':
                    peli = new ArvaaNumero();
                    break;
                case '3':
                    break;
            }
            if(select != 3)
                peli.playOneGame(2);
        }while (select != '3');
    }
}
