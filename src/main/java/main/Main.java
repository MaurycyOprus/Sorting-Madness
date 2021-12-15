package main;
import static java.lang.System.*;
import static java.lang.System.out;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner myInput = new Scanner( System.in );

        int arr[] = {64,25,12,22,11};
        int n = arr.length;

        System.out.println("Wybierz algorytm z listy:");
        System.out.println("1. Selection Sort");
        System.out.println("2. Bubble Sort");
        System.out.println("3. Insertion Sort");
        System.out.println("4. Quick Sort");
        int algorytm = myInput.nextInt();
        System.out.println("Wybierz kierunek sortowania:");
        System.out.println("1. Rosnaco");
        System.out.println("2. Malejaco");
        int kierunek = myInput.nextInt();

        if(algorytm == 1 && kierunek == 1){
            SelectionSort ss = new SelectionSort();
            ss.sort(arr);
            ss.printArray(arr);
        }

        if(algorytm == 1 && kierunek == 2){
            SelectionSort ss = new SelectionSort();
            ss.ReverseSort(arr);
            ss.printArray(arr);
        }

        if(algorytm == 2 && kierunek == 1){
            BubbleSort bs = new BubbleSort();
            bs.sort(arr);
            bs.printArray(arr);
        }

        if(algorytm == 2 && kierunek == 2){
            BubbleSort bs = new BubbleSort();
            bs.ReverseSort(arr);
            bs.printArray(arr);
        }
        if(algorytm == 3 && kierunek == 1){
            InsertionSort is = new InsertionSort();
            is.sort(arr);
            is.printArray(arr);
        }

        if(algorytm == 3 && kierunek == 2){
            InsertionSort is = new InsertionSort();
            is.ReverseSort(arr);
            is.printArray(arr);
        }
        if(algorytm == 4 && kierunek == 1){
            QuickSort qs = new QuickSort();
            qs.sort(arr, 0, n-1);
            qs.printArray(arr);
        }

        if(algorytm == 4 && kierunek == 2){
            QuickSort qs = new QuickSort();
            qs.ReverseSort(arr, 0, n-1);
            qs.printArray(arr);
        }
    }
}
