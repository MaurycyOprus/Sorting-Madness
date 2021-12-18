package pl.put.poznan.transformer.logic;

import java.util.Arrays;

public class BubbleSort {

    private final String direction;
    private final int[] arr;
    private static final int[] arr_beg = {64,25,12,22,11};
    private final double exe_time;
    private final int depth;

    int[] copy = Arrays.copyOf(arr_beg, arr_beg.length);

    public BubbleSort(String direction, int depth){
        this.arr = copy;
        this.direction = direction;
        this.depth = depth;
        long startTime = System.nanoTime();
        if(this.direction.equals("reverse")){
            if(this.depth == -1) {
                ReverseSort(copy.length);
            }
            else {
                ReverseSort(this.depth);
            }
        }
        if(this.direction.equals("normal")) {
            if(this.depth == -1) {
                sort(copy.length);
            }
            else {
                sort(this.depth);
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
    public int getDepth(){ return depth; }

    void sort(int depth)
    {
        for (int i = 0; i < depth-1; i++)
            for (int j = 0; j < depth-i-1; j++)
                if (this.arr[j] > this.arr[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = this.arr[j];
                    this.arr[j] = this.arr[j+1];
                    this.arr[j+1] = temp;
                }
    }
    void ReverseSort(int depth)
    {
        for (int i = 0; i < depth-1; i++)
            for (int j = 0; j < depth-i-1; j++)
                if (this.arr[j] < this.arr[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = this.arr[j];
                    this.arr[j] = this.arr[j+1];
                    this.arr[j+1] = temp;
                }
    }

}
