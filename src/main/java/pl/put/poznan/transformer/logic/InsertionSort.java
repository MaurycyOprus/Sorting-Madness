package pl.put.poznan.transformer.logic;
import pl.put.poznan.transformer.app.ReadingArrayFromJSON;

import java.util.Arrays;

public class InsertionSort {

    ReadingArrayFromJSON json = new ReadingArrayFromJSON();
    long[] copy = Arrays.copyOf(json.getArray(),json.getArray().length);

    private final String direction;
    private final long[] arr;
    private final long[] arr_beg = json.getArray();
    private final double exe_time;
    private final int depth;


    public InsertionSort(String direction, int depth){
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
