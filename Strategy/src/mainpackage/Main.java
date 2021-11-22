package mainpackage;

import java.util.Scanner;

public class Main {
    public static final int MAX = 100000;

    public static void main(String[] args){

        Lajittelija sorter = null;
        System.out.println("Valitse metodi!");
        Scanner reader = new Scanner(System.in);
        char select;
        do{
            System.out.println("\n\t\t\t1. Valinta lajittelu");
            System.out.println("\t\t\t2. Lomitus lajittelu");
            System.out.println("\t\t\t3. Pika lajittelu");
            System.out.println("\t\t\t4. Sulje");
            System.out.print("\n\n");
            try{
                select = reader.nextLine().charAt(0);
            }catch (Exception e){
                select = '5';
            }
            int[] table = null;
            switch (select) {
                case '1':
                    table = Generator.generateNumbers();
                    if(sorter == null)
                        sorter = new Lajittelija(SelectSort.getInstance());
                    else
                        sorter.setStrategy(SelectSort.getInstance());
                    break;
                case '2':
                    table = Generator.generateNumbers();
                    if(sorter == null)
                        sorter = new Lajittelija(MergeSort.getInstance());
                    else
                        sorter.setStrategy(SelectSort.getInstance());
                    break;
                case '3':
                    table = Generator.generateNumbers();
                    if(sorter == null)
                        sorter = new Lajittelija(QuickSort.getInstance());
                    else
                        sorter.setStrategy(SelectSort.getInstance());
                    break;
                case '4':
                    break;
            }
            if(select != '4')
                sorter.executeStrategy(table);
        }while (select != '4');
    }
}
