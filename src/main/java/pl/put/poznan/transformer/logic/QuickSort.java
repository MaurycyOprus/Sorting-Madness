package pl.put.poznan.transformer.logic;

import java.util.Arrays;

public class QuickSort {
    private final String direction;
    private final int[] arr;
    private static final int[] arr_beg = {64,25,12,22,11};
    private final double exe_time;

    int[] copy = Arrays.copyOf(arr_beg, arr_beg.length);

    public QuickSort(String direction, int depth){
        int n = copy.length;
        this.arr = copy;
        this.direction = direction;
        long startTime = System.nanoTime();
        if(this.direction.equals("reverse")){
            if(depth == -1) {
                ReverseSort(0, n-1);
            }
            else {
                ReverseSort(0, depth -1);
            }
        }
        if(this.direction.equals("normal")) {
            if(depth == -1) {
                sort(0, n-1);
            }
            else {
                sort(0, depth -1);
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
    // A utility function to swap two elements
    void swap(int i, int j)
    {
        int temp = this.arr[i];
        this.arr[i] = this.arr[j];
        this.arr[j] = temp;
    }

    /* This function takes last element as pivot, places
       the pivot element at its correct position in sorted
       array, and places all smaller (smaller than pivot)
       to left of pivot and all greater elements to right
       of pivot */
    int partition(int low, int high)
    {

        // pivot
        int pivot = this.arr[high];

        // Index of smaller element and
        // indicates the right position
        // of pivot found so far
        int i = (low - 1);

        for(int j = low; j <= high - 1; j++)
        {

            // If current element is smaller
            // than the pivot
            if (this.arr[j] < pivot)
            {

                // Increment index of
                // smaller element
                i++;
                swap(i, j);
            }
        }
        swap(i + 1, high);
        return (i + 1);
    }
    /* The main function that implements QuickSort
          arr[] --> Array to be sorted,
          low --> Starting index,
          high --> Ending index
 */
    public void sort(int low, int high)
    {
        if (low < high)
        {

            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partition(low, high);

            // Separately sort elements before
            // partition and after partition
            sort(low, pi - 1);
            sort(pi + 1, high);
        }
    }

    public int RevPartition(int left, int right){
        int pivot = this.arr[left];
        int i = left;
        for(int j = left + 1; j <= right; j++){
            if (this.arr[j] > pivot){
                i = i + 1;
                int temp = this.arr[i];
                this.arr[i]= this.arr[j];
                this.arr[j]= temp;
            }
        }

        int temp = this.arr[i];
        this.arr[i] = this.arr[left];
        this.arr[left] = temp;

        return i;

    }

    public void ReverseSort(int left, int right){
        if(left < right)
        {
            int q = RevPartition(left, right);
            ReverseSort(left, q);
            ReverseSort(q + 1, right);
        }
    }

}
