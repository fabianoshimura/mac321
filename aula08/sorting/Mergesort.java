package sorting;


public class Mergesort {

    public void sort(int[] a) {
        mergesort (a, 0, a.length - 1);
    }
    
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

    public static void main(String[] args)
    {
        int[] inteiros = {34, 5, 3, 7, 2, 0, 6, 3, -10, 34, 5, 8};
        
        Mergesort sorter = new Mergesort();

        sorter.sort(inteiros);
        for (int elem : inteiros)
            System.out.print(elem + " ");

    }
}