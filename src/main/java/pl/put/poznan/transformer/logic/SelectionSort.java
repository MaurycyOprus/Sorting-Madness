package pl.put.poznan.transformer.logic;

import pl.put.poznan.transformer.app.ReadingArrayFromJSON;

import java.util.Arrays;

public class SelectionSort {

    ReadingArrayFromJSON json = new ReadingArrayFromJSON();
    long[] copy = Arrays.copyOf(json.getArray(),json.getArray().length);

    private final String direction;
    private final long[] arr;
    private final long[] arr_beg = json.getArray();
    private final double exe_time;
    private final int depth;

    public SelectionSort(String direction, int depth){
        this.arr = copy;
        this.direction = direction;
        this.depth = depth;
        long startTime = System.nanoTime();
        if(this.direction.equals("reverse")){
            if(depth == -1) {
                ReverseSort(copy.length);
            }
            ReverseSort(Math.min(this.depth, copy.length));
        }
        if(this.direction.equals("normal")) {
            if(depth == -1) {
                sort(copy.length);
            }
            sort(Math.min(this.depth, copy.length));
        }
        long endTime = System.nanoTime();
        this.exe_time = (endTime-startTime)/1000000000.0;
    }

    public long[] getArr() {
        return Arrays.copyOf(arr, arr.length);
    }
    public long[] getArr_beg() {
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
            long temp = this.arr[min_idx];
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
            long temp = this.arr[max_idx];
            this.arr[max_idx] = this.arr[i];
            this.arr[i] = temp;
        }
    }

}
