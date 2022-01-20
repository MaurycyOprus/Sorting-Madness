package pl.put.poznan.transformer.logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {

    private InsertionSort insertionSort;



    @Test
    void testSort(){
        long[] arr_begin = {4, 3, 8, 1, 9, 5, 8, 2, 3, 0};
        String direction = "normal";
        int depth = -1;
        insertionSort = new InsertionSort(arr_begin, arr_begin, direction, depth);
        insertionSort.setArr(arr_begin);
        long[] arr_sorted = {0,1,2,3,3,4,5,8,8,9};
        insertionSort.setDepth(-1);
        insertionSort.sort(depth);
        assertArrayEquals(arr_sorted, insertionSort.getArr_beg());
    }


    @Test
    void testDepth_3(){
        long[] arr_begin = {4, 3, 8, 1, 9, 5, 8, 2, 3, 0};
        String direction = "normal";
        int depth = 3;
        insertionSort = new InsertionSort(arr_begin, arr_begin, direction, depth);
        insertionSort.setArr(arr_begin);
        long[] arr_sorted = {3,4,8,1,9,5,8,2,3,0};
        insertionSort.setDepth(3);
        insertionSort.sort(depth);
        assertArrayEquals(arr_sorted, insertionSort.getArr_beg());
    }

    @Test
    void testReverseSort(){
        long[] arr_begin = {4, 3, 8, 1, 9, 5, 8, 2, 3, 0};
        String direction = "reverse";
        int depth = -1;
        insertionSort = new InsertionSort(arr_begin, arr_begin, direction, depth);
        insertionSort.setArr(arr_begin);
        long[] arr_sorted = {9,8,8,5,4,3,3,2,1,0};
        insertionSort.setDepth(-1);
        insertionSort.ReverseSort(depth);
        assertArrayEquals(arr_sorted, insertionSort.getArr_beg());
    }

    @Test
    void testDepth_4_reverse(){
        long[] arr_begin = {4, 3, 8, 1, 9, 5, 8, 2, 3, 0};
        String direction = "reverse";
        int depth = 4;
        insertionSort = new InsertionSort(arr_begin, arr_begin, direction, depth);
        insertionSort.setArr(arr_begin);
        long[] arr_sorted = {8,4,3,1,9,5,8,2,3,0};
        insertionSort.setDepth(4);
        insertionSort.ReverseSort(depth);
        assertArrayEquals(arr_sorted, insertionSort.getArr_beg());
    }

    @Test
    void testSort_same(){
        long[] arr_begin = {1,1,1,1,1,1,1,1,1,1,1};
        String direction = "normal";
        int depth = -1;
        insertionSort = new InsertionSort(arr_begin, arr_begin, direction, depth);
        insertionSort.setArr(arr_begin);
        long[] arr_sorted = {1,1,1,1,1,1,1,1,1,1,1};
        insertionSort.setDepth(-1);
        insertionSort.sort(depth);
        assertArrayEquals(arr_sorted, insertionSort.getArr_beg());
    }

}