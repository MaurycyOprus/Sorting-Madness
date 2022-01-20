package pl.put.poznan.transformer.logic;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.put.poznan.transformer.logic.BubbleSort;

import java.util.Arrays;

class BubbleSortTest {

    private BubbleSort bubbleSort;


    @Test
    void testSort(){
        long[] arr_begin = {4, 3, 8, 1, 9, 5, 8, 2, 3, 0};
        String direction = "normal";
        int depth = -1;
        bubbleSort = new BubbleSort(arr_begin, arr_begin, direction, depth);
        bubbleSort.setArr(arr_begin);
        long[] arr_sorted = {0,1,2,3,3,4,5,8,8,9};
        bubbleSort.setDepth(-1);
        bubbleSort.sort(depth);
        assertArrayEquals(arr_sorted, bubbleSort.getArr_beg());
    }


    @Test
    void testDepth_3(){
        long[] arr_begin = {4, 3, 8, 1, 9, 5, 8, 2, 3, 0};
        String direction = "normal";
        int depth = 3;
        bubbleSort = new BubbleSort(arr_begin, arr_begin, direction, depth);
        bubbleSort.setArr(arr_begin);
        long[] arr_sorted = {3,4,8,1,9,5,8,2,3,0};
        bubbleSort.setDepth(3);
        bubbleSort.sort(depth);
        assertArrayEquals(arr_sorted, bubbleSort.getArr_beg());
    }

    @Test
    void testReverseSort(){
        long[] arr_begin = {4, 3, 8, 1, 9, 5, 8, 2, 3, 0};
        String direction = "reverse";
        int depth = -1;
        bubbleSort = new BubbleSort(arr_begin, arr_begin, direction, depth);
        bubbleSort.setArr(arr_begin);
        long[] arr_sorted = {9,8,8,5,4,3,3,2,1,0};
        bubbleSort.setDepth(-1);
        bubbleSort.ReverseSort(depth);
        assertArrayEquals(arr_sorted, bubbleSort.getArr_beg());
    }

    @Test
    void testDepth_4_reverse(){
        long[] arr_begin = {4, 3, 8, 1, 9, 5, 8, 2, 3, 0};
        String direction = "reverse";
        int depth = 4;
        bubbleSort = new BubbleSort(arr_begin, arr_begin, direction, depth);
        bubbleSort.setArr(arr_begin);
        long[] arr_sorted = {8,4,3,1,9,5,8,2,3,0};
        bubbleSort.setDepth(4);
        bubbleSort.ReverseSort(depth);
        assertArrayEquals(arr_sorted, bubbleSort.getArr_beg());
    }

    @Test
    void testSort_same(){
        long[] arr_begin = {1,1,1,1,1,1,1,1,1,1,1};
        String direction = "normal";
        int depth = -1;
        bubbleSort = new BubbleSort(arr_begin, arr_begin, direction, depth);
        bubbleSort.setArr(arr_begin);
        long[] arr_sorted = {1,1,1,1,1,1,1,1,1,1,1};
        bubbleSort.setDepth(-1);
        bubbleSort.sort(depth);
        assertArrayEquals(arr_sorted, bubbleSort.getArr_beg());
    }
}