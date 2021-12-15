package main;
import java.util.Scanner;

public class Main {



    public static void main(String args[]) {


        ReadJSON.readFile("list.json");

        Scanner myInput = new Scanner( System.in );

        int arr[] = {64,25,12,22,11};
        int n = arr.length;

        System.out.println("Choose algorithm:");
        System.out.println("1. Selection Sort");
        System.out.println("2. Bubble Sort");
        System.out.println("3. Insertion Sort");
        System.out.println("4. Quick Sort");
        int algorithm = myInput.nextInt();
        System.out.println("Choose sorting direction:");
        System.out.println("1. Ascending");
        System.out.println("2. Descending");
        int direction = myInput.nextInt();

        long startTime = System.nanoTime();
        if(algorithm == 1 && direction == 1){
            SelectionSort ss = new SelectionSort();
            ss.sort(arr);
            ss.printArray(arr);
        }

        if(algorithm == 1 && direction == 2){
            SelectionSort ss = new SelectionSort();
            ss.ReverseSort(arr);
            ss.printArray(arr);
        }

        if(algorithm == 2 && direction == 1){
            BubbleSort bs = new BubbleSort();
            bs.sort(arr);
            bs.printArray(arr);
        }

        if(algorithm == 2 && direction == 2){
            BubbleSort bs = new BubbleSort();
            bs.ReverseSort(arr);
            bs.printArray(arr);
        }
        if(algorithm == 3 && direction == 1){
            InsertionSort is = new InsertionSort();
            is.sort(arr);
            is.printArray(arr);
        }

        if(algorithm == 3 && direction == 2){
            InsertionSort is = new InsertionSort();
            is.ReverseSort(arr);
            is.printArray(arr);
        }
        if(algorithm == 4 && direction == 1){
            QuickSort qs = new QuickSort();
            qs.sort(arr, 0, n-1);
            qs.printArray(arr);
        }

        if(algorithm == 4 && direction == 2){
            QuickSort qs = new QuickSort();
            qs.ReverseSort(arr, 0, n-1);
            qs.printArray(arr);
        }
        long endTime = System.nanoTime();
        System.out.println("Execution time:");
        System.out.print((endTime-startTime)/1000000000.0);
        System.out.println(" s");
    }
}