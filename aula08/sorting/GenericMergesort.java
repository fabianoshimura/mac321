package sorting;

import java.util.ArrayList;

public class GenericMergesort <T extends Comparable<T>> {

    public void sort(T[] a) {
        mergesort (a, 0, a.length - 1);
    }
    
    private void mergesort(T[] a, int i, int j) {
        if (j <= i) return; /* already sorted */ 
        int midpoint = (i+j)/2;
        mergesort(a, i, midpoint);
        mergesort(a, midpoint+1, j);
        merge2(a, i, midpoint, j);
    }
    
    private void merge(T[] a, int start, int mid, int end) {
        // isso não funciona (não podemos criar vetor de tipos genéricos em Java):
        // T[] aux = new T[end-start+1]; 
        ArrayList<T> aux = new ArrayList<T>();
        
        int i = start, j = mid+1;
        T smallest;
        while (i <= mid && j <= end) {
            if (a[i].compareTo(a[j]) <= 0) {
                smallest = a[i++];
            } else {
                smallest = a[j++];
            }
            aux.add(smallest);
        }
        while (i <= mid) {
            aux.add(a[i++]);
        }
        while (j <= end) {
            aux.add(a[j++]);
        }
        for (i = start; i <= end; i++)
            a[i] = (T)aux.get(i-start);
    }

    @SuppressWarnings("unchecked")
    // Alternativa sem ArrayList, garante que tipagem é correta 
    // (embora o verificador de tipos do Java não consiga notar isso)
    private void merge2(T[] a, int start, int mid, int end) {
        // isso não funciona (não podemos criar vetor de tipos genéricos em Java):
        // T[] aux = new T[end-start+1]; 
        T[] aux  = (T[]) new Comparable[end - start + 1];
        
        int i = start, j = mid+1, k = 0;
        while (i <= mid && j <= end) {
            if (a[i].compareTo(a[j]) <= 0) {
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
        Integer[] inteiros = {34, 5, 3, 7, 2, 0, 6, 3, -10, 34, 5, 8};
        
        GenericMergesort<Integer> sorter = new GenericMergesort<>();

        sorter.sort(inteiros);
        for (int elem : inteiros)
            System.out.print(elem + " ");

    }
}