package sorting;

public class Sorter {

    public static final int QUICKSORT = 1;
    public static final int MERGESORT = 2;
    public static final int INSERTIONSORT = 3;

    private int method; // algoritmo de ordenação

    public Sorter(int method) {
        this.method = method;
    }

    public void sort(int a[]) {
        switch (method) {
            case Sorter.QUICKSORT: 
                quicksort(a, 0, a.length-1);
                break;
            case Sorter.MERGESORT: 
                mergesort(a, 0, a.length-1);
                break;
            case Sorter.INSERTIONSORT:
                insertionsort(a);
                break;
        }
    }

    // Quicksort
    private void quicksort(int[] a, int i, int j) {
        if (i>=j) return;

        int pivot = partition(a, i, j);

        quicksort(a, i, pivot-1);
        quicksort(a, pivot+1, j);
    }
    
    private int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int balancePoint = start; 

        for (int i = start; i < end; i++) 
            if(array[i] <= pivot) {
                int tmp = array[i];
                array[i] = array[balancePoint];
                array[balancePoint] = tmp;
                balancePoint++;
        }

        int tmp = array[end];
        array[end] = array[balancePoint];
        array[balancePoint] = tmp;

        return balancePoint;
    }    

    // Mergesort
    private void mergesort(int[] a, int i, int j) {
        if (j <= i) return; /* already sorted */ 
        int midpoint = (i+j)/2;
        mergesort(a, i, midpoint);
        mergesort(a, midpoint+1, j);
        merge(a, i, midpoint, j);
    }
    
    private void merge(int[] a, int start, int mid, int end) {
        int[] aux = new int[end-start+1];
        int i = start, j = mid+1, k = 0;
        while (i <= mid && j <= end) {
            if (a[i] <= a[j]) {
                aux[k++] = a[i++];
            } else {
                aux[k++] = a[j++];
            }
        }
        while (i <= mid) {
            aux[k++] = a[i++];
        }
        while (j <= end) {
            aux[k++] = a[j++];
        }
        for (i = start; i <= end; i++)
            a[i] = aux[i-start];
    }

    // Insertion sort
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
    
    // Main
    public static void main(String[] args)
    {
        int[] inteiros1 = {34, 5, 3, 7, 2, 0, 6, 3, -10, 34, 5, 8};
        int[] inteiros2 = {34, 5, 3, 7, 2, 0, 6, 3, -10, 34, 5, 8};
        int[] inteiros3 = {34, 5, 3, 7, 2, 0, 6, 3, -10, 34, 5, 8};
        
        Sorter quicksort = new Sorter(Sorter.QUICKSORT);
        Sorter mergesort = new Sorter(Sorter.MERGESORT);
        Sorter insertionsort = new Sorter(Sorter.INSERTIONSORT);

        System.out.println("Quicksort");
        quicksort.sort(inteiros1);
        for (int elem : inteiros1)
            System.out.print(elem + " ");
        System.out.println();

        System.out.println("Mergesort");
        mergesort.sort(inteiros2);
        for (int elem : inteiros2)
            System.out.print(elem + " ");
        System.out.println();

        System.out.println("Insertionsort");
        insertionsort.sort(inteiros3);
        for (int elem : inteiros3)
            System.out.print(elem + " ");
        System.out.println();

    }    
}