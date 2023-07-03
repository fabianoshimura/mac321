package sorting;

public class GenericInsertionsort <T extends Comparable<T>> {
    public void sort(T[] a) {
        insertionsort(a);
    }

    private void insertionsort(T[] a) {
        for (int i = 1; i < a.length; i++) {
            T x = a[i];
            int j = i - 1;
            for (; j >= 0 && a[j].compareTo(x) > 0; j--) {
                a[j+1] = a[j];
            }
            a[j+1] = x;
        }
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

        GenericInsertionsort<String> strSorter = new GenericInsertionsort<>();
        GenericInsertionsort<Integer> intSorter = new GenericInsertionsort<>();
        GenericInsertionsort<Double> dblSorter = new GenericInsertionsort<>();
        GenericInsertionsort<Racional> racSorter = new GenericInsertionsort<>();

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
