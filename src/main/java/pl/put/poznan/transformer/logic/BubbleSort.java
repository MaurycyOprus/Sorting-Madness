package pl.put.poznan.transformer.logic;

import java.util.Arrays;

public class BubbleSort {

    private String direction;
    private int arr[];
    private int arr_beg[];
    private double exe_time;

    public BubbleSort(int arr[], String direction){
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
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (this.arr[j] > this.arr[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = this.arr[j];
                    this.arr[j] = this.arr[j+1];
                    this.arr[j+1] = temp;
                }
    }
    void ReverseSort()
    {
        int n = this.arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (this.arr[j] < this.arr[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = this.arr[j];
                    this.arr[j] = this.arr[j+1];
                    this.arr[j+1] = temp;
                }
    }

}
