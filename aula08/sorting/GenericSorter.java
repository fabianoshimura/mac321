package sorting;

public class GenericSorter <T extends Comparable<T>> {

    public static final int QUICKSORT = 1;
    public static final int MERGESORT = 2;
    public static final int INSERTIONSORT = 3;

    private int method; // algoritmo de ordenação

    public GenericSorter(int method) {
        this.method = method;
    }

    public void sort(T a[]) {
        switch (method) {
            case Sorter.QUICKSORT: 
                GenericQuicksort<T> quicksorter = new GenericQuicksort<>();
                quicksorter.sort(a);
                break;
            case Sorter.MERGESORT: 
                GenericMergesort<T> mergesorter = new GenericMergesort<T>();
                mergesorter.sort(a);
                break;
            case Sorter.INSERTIONSORT:
                // GenericInsertionsort<T> isorter = new GenericInsertionsort<>();
                // isorter.sort(a);
                // break;
        }
    }
 
    // Main
    public static void main(String[] args)
    //throws ZeroDenominatorException 
    {
        Integer[] inteiros = {34, 5, 3, 7, 2, 0, 6, 3, -10, 34, 5, 8};
        String[] strings = {"Esse", "é", "um", "lindo", "caso", "de", "teste"};
        Double[] doubles = {23.5, 0.0, 3.7, -3.14159};      
        // Racional[] racionais = {
        //     new Racional(1,3),
        //     new Racional(2,4),
        //     new Racional(47,2),
        //     new Racional(0),
        //     new Racional(-355,113),
        // };

        GenericSorter<Integer> quicksort = new GenericSorter<>(GenericSorter.QUICKSORT);
        GenericSorter<String> mergesort = new GenericSorter<>(GenericSorter.MERGESORT);
        GenericSorter<Double> insertionsort = new GenericSorter<>(GenericSorter.INSERTIONSORT);

        System.out.println("Quicksort");
        quicksort.sort(inteiros);
        for (Integer elem : inteiros)
            System.out.print(elem + " ");
        System.out.println();

        System.out.println("Mergesort");
        mergesort.sort(strings);
        for (String elem : strings)
            System.out.print(elem + " ");
        System.out.println();

        System.out.println("Insertionsort");
        insertionsort.sort(doubles);
        for (Double elem : doubles)
            System.out.print(elem + " ");
        System.out.println();
    }    
}