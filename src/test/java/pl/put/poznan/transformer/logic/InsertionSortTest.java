package pl.put.poznan.transformer.logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.*;

import org.mockito.junit.jupiter.MockitoExtension;

class InsertionSortTest {

    private InsertionSort insertionSort;

    // mock
    @Test
    public void testMethod(){
        String direction = "normal";
        long[] arr_begin = {4, 3, 8, 1, 9, 5, 8, 2, 3, 0};
        InsertionSort mockObject = mock(InsertionSort.class);
        int depth = -1;
        long[] arr_sorted = {0,1,2,3,3,4,5,8,8,9};
        mockObject.setArr(arr_begin);
        mockObject.setDepth(-1);
        mockObject.sort(depth);
        when(mockObject.getArr_beg()).thenReturn(arr_sorted);
        long [] table = mockObject.getArr_beg();
        BubbleSort testedObject = new BubbleSort(arr_begin, arr_begin, direction, depth);
        long[] result = testedObject.getArr_beg();
        verify(mockObject).getArr_beg();
        assertArrayEquals(table, result);
    }

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