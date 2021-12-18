package pl.put.poznan.transformer.logic;

import java.util.Arrays;

public class SelectionSort {
    private final String direction;
    private final int[] arr;
    private static final int[] arr_beg = {64,25,12,22,11};
    private final double exe_time;

    int[] copy = Arrays.copyOf(arr_beg, arr_beg.length);

    public SelectionSort(String direction, int depth){
        this.arr = copy;
        this.direction = direction;
        long startTime = System.nanoTime();
        if(this.direction.equals("reverse")){
            if(depth == -1) {
                ReverseSort(copy.length);
            }
            else {
                ReverseSort(depth);
            }
        }
        if(this.direction.equals("normal")) {
            if(depth == -1) {
                sort(copy.length);
            }
            else {
                sort(depth);
            }
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
    void sort(int depth)
    {

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < depth-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < depth; j++)
                if (this.arr[j] < this.arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = this.arr[min_idx];
            this.arr[min_idx] = this.arr[i];
            this.arr[i] = temp;
        }
    }

    void ReverseSort(int depth)
    {

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < depth-1; i++)
        {
            // Find the minimum element in unsorted array
            int max_idx = i;
            for (int j = i+1; j < depth; j++)
                if (this.arr[j] > this.arr[max_idx])
                    max_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = this.arr[max_idx];
            this.arr[max_idx] = this.arr[i];
            this.arr[i] = temp;
        }
    }

}
