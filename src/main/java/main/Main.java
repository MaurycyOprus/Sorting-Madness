package main;
import static java.lang.System.*;
import static java.lang.System.out;

public class Main {

    public static void main(String args[]) {
        int arr1[] = {64,25,12,22,11};
        int arr2[] = {64,25,12,22,11};
        int arr3[] = {64,25,12,22,11};
        int arr4[] = {64,25,12,22,11};
        int n = arr4.length;

        SelectionSort ss = new SelectionSort();
        BubbleSort bs = new BubbleSort();
        InsertionSort is = new InsertionSort();
        QuickSort qs = new QuickSort();

        ss.ReverseSort(arr1);
        bs.ReverseSort(arr2);
        is.ReverseSort(arr3);
        qs.ReverseSort(arr4, 0, n-1);

        System.out.println("SelectionSort:");
        ss.printArray(arr1);
        System.out.println("BubbleSort:");
        bs.printArray(arr2);
        System.out.println("InsertionSort:");
        is.printArray(arr3);
        System.out.println("QuickSort :");
        qs.printArray(arr4);
    }
}
