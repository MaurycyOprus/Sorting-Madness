package pl.put.poznan.transformer.logic;
import java.util.Arrays;

public class InsertionSort {

    private String direction;
    private int arr[];
    private int arr_beg[];
    private double exe_time;

    public InsertionSort(int arr[], String direction){
        this.arr_beg = Arrays.copyOf(arr, arr.length);
        this.arr = arr;
        this.direction = direction;
        long startTime = System.nanoTime();
        if(this.direction.equals("reverse")){
            ReverseSort();
        }
        if(this.direction.equals("normal")) {
            sort();
        }
        long endTime = System.nanoTime();
        this.exe_time = (endTime-startTime)/1000000000.0;
    }

    public int[] getArr() {
        return Arrays.copyOf(arr, arr.length);
    }
    public int[] getArr_beg() {
        return Arrays.copyOf(arr_beg, arr_beg.length);
    }
    public String getDirection() {
        return direction;
    }
    public double getExe_time(){
        return exe_time;
    }

    void sort(){
        int n = this.arr.length;
        for (int i = 1; i < n; ++i) {
            int key = this.arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && this.arr[j] > key) {
                this.arr[j + 1] = this.arr[j];
                j = j - 1;
            }
            this.arr[j + 1] = key;
        }
    }

    void ReverseSort(){
        int n = this.arr.length;
        for (int i = 1; i < n; ++i) {
            int key = this.arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && this.arr[j] < key) {
                this.arr[j + 1] = this.arr[j];
                j = j - 1;
            }
            this.arr[j + 1] = key;
        }
    }

    // Prints the array
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

}
