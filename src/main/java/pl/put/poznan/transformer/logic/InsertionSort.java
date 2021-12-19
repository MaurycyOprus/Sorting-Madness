package pl.put.poznan.transformer.logic;
import pl.put.poznan.transformer.app.ReadingArrayFromJSON;

import java.util.Arrays;

public class InsertionSort {

//    ReadingArrayFromJSON json = new ReadingArrayFromJSON();
//    long[] copy = Arrays.copyOf(json.getArray(),json.getArray().length);

    private final String direction;
    private final long[] arr;
    private final long[] arr_beg;
    private final double exe_time;
    private final int depth;


    public InsertionSort(long[] arr, long[] arr2, String direction, int depth){
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

    void sort(int depth){
        for (int i = 1; i < depth; ++i) {
            long key = this.arr[i];
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

    void ReverseSort(int depth){
        for (int i = 1; i < depth; ++i) {
            long key = this.arr[i];
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

}
