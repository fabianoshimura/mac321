package sorting;

public class GenericQuicksort <T extends Comparable<T>> {

    public void sort(T[] a) {
        quickSort (a, 0, a.length - 1);
    }
    
    private void quickSort(T[] a, int i, int j) {
        if (i>=j) return;

        int pivot = partition(a, i, j);

        quickSort(a, i, pivot-1);
        quickSort(a, pivot+1, j);
    }
    
    private int partition(T[] array, int start, int end) {
        T pivot = array[end];
        int balancePoint = start; 

        for (int i = start; i < end; i++) 
            if(array[i].compareTo(pivot) <=0) {
                T tmp = array[i];
                array[i] = array[balancePoint];
                array[balancePoint] = tmp;
                balancePoint++;
        }

        T tmp = array[end];
        array[end] = array[balancePoint];
        array[balancePoint] = tmp;

        return balancePoint;
    }

    public static void main(String[] args)
    throws ZeroDenominatorException 
    {
        String[] strings = {"Esse", "é", "um", "lindo", "caso", "de", "teste"};
        Integer[] inteiros = {34, 5, 3, 7, 2, 0, 6, 3, -10, 34, 5, 8};
        Double[] doubles = {23.5, 0.0, 3.7, -3.14159};      
        Racional[] racionais = {
            new Racional(1,3),
            new Racional(2,4),
            new Racional(47,2),
            new Racional(0),
            new Racional(-355,113),
        };

        GenericQuicksort<String> strSorter = new GenericQuicksort<>();
        GenericQuicksort<Integer> intSorter = new GenericQuicksort<>();
        GenericQuicksort<Double> dblSorter = new GenericQuicksort<>();
        GenericQuicksort<Racional> racSorter = new GenericQuicksort<>();

        strSorter.sort(strings);
        for (String elem : strings)
            System.out.print(elem + " ");

        System.out.println();

        intSorter.sort(inteiros);
        for (Integer elem : inteiros)
            System.out.print(elem + " ");

        System.out.println();

        dblSorter.sort(doubles);
        for (Double elem : doubles)
            System.out.print(elem + " ");

        System.out.println();

        racSorter.sort(racionais);
        for (Racional elem : racionais)
            System.out.print(elem + " ");

        System.out.println();        
    }
}