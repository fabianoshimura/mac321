package sorting;

public class Insertionsort {
    public void sort(int[] a) {
        insertionsort(a);
    }

    private void insertionsort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int x = a[i];
            int j = i - 1;
            for (; j >= 0 && a[j] > x; j--) {
                a[j+1] = a[j];
            }
            a[j+1] = x;
        }
    }

    public static void main(String[] args)
    {
        int[] inteiros = {34, 5, 3, 7, 2, 0, 6, 3, -10, 34, 5, 8};
        
        Insertionsort sorter = new Insertionsort();

        sorter.sort(inteiros);
        for (int elem : inteiros)
            System.out.print(elem + " ");

    }
}
