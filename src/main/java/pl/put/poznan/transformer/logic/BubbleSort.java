package pl.put.poznan.transformer.logic;

import pl.put.poznan.transformer.app.ReadingArrayFromJSON;
import pl.put.poznan.transformer.logic.DataToSort;

import java.util.Arrays;

public class BubbleSort {

//    ReadingArrayFromJSON json = new ReadingArrayFromJSON();
//    long[] copy = Arrays.copyOf(json.getArray(),json.getArray().length);

    private final String direction;
    private final long[] arr;
    private final long[] arr_beg;
    private final double exe_time;
    private final int depth;



    public BubbleSort(long[] arr, long[] arr2,  String direction, int depth){
        this.arr_beg = arr2;
        this.arr = arr;
        this.direction = direction;
        this.depth = depth;
        long startTime = System.nanoTime();
        if(this.direction.equals("reverse")){
            if(this.depth <= 0) {
                ReverseSort(this.arr.length);
            }
            ReverseSort(Math.min(this.depth, this.arr.length));
        }
        if(this.direction.equals("normal")) {
            if(this.depth <= 0) {
                sort(this.arr.length);
            }
            sort(Math.min(this.depth, this.arr.length));
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
    public int getDepth(){ return depth; }

    void sort(int depth)
    {
        for (int i = 0; i < depth-1; i++)
            for (int j = 0; j < depth-i-1; j++)
                if (this.arr[j] > this.arr[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    long temp = this.arr[j];
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
                    long temp = this.arr[j];
                    this.arr[j] = this.arr[j+1];
                    this.arr[j+1] = temp;
                }
    }

}
