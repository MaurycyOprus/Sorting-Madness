package pl.put.poznan.transformer.logic;
import java.util.Arrays;

public class InsertionSort {

    private final String direction;
    private final int[] arr;
    private static final int[] arr_beg = {64,25,12,22,11};
    private final double exe_time;
    private final int depth;

    int[] copy = Arrays.copyOf(arr_beg, arr_beg.length);

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

    void sort(int depth){
        for (int i = 1; i < depth; ++i) {
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

    void ReverseSort(int depth){
        for (int i = 1; i < depth; ++i) {
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

}
