package pl.put.poznan.transformer.logic;

import java.util.Arrays;

public class SelectionSort {
    private String direction;
    private int arr[];
    private int arr_beg[];
    private double exe_time;

    public SelectionSort(int arr[], String direction){
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
    void sort()
    {
        int n = this.arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (this.arr[j] < this.arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = this.arr[min_idx];
            this.arr[min_idx] = this.arr[i];
            this.arr[i] = temp;
        }
    }

    void ReverseSort()
    {
        int n = this.arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int max_idx = i;
            for (int j = i+1; j < n; j++)
                if (this.arr[j] > this.arr[max_idx])
                    max_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = this.arr[max_idx];
            this.arr[max_idx] = this.arr[i];
            this.arr[i] = temp;
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
