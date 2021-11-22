package mainpackage;

public class SelectSort implements ILajittele {

    private static SelectSort instance;

    private SelectSort() {}

    public static SelectSort getInstance(){
        if(instance == null)
            instance = new SelectSort();
        return instance;
    }

    @Override
    public void sort(int[] tableToBeSorted) {
        final long startTime = System.currentTimeMillis();
        selectSort(tableToBeSorted);
        final long endTime = System.currentTimeMillis();

        Generator.printResults(tableToBeSorted);
        System.out.println("\n\nValinta lajittelun suorituksen aika: " + ((endTime - startTime) / 1000F) + " sekunttia");
    }

    public static void selectSort(int[] tableToBeSorted){
        int help;
        for (int i = 0; i < Main.MAX; i++) {
            int smallest = i;
            for (int j = i + 1; j < Main.MAX; j++) {
                if (tableToBeSorted[j] < tableToBeSorted[smallest]) {
                    smallest = j;
                }
            }
            if (smallest != i) {
                help = tableToBeSorted[smallest];
                tableToBeSorted[smallest] = tableToBeSorted[i];
                tableToBeSorted[i] = help;
            }
        }
    }
}
