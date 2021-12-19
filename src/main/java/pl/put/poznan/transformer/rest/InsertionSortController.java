package pl.put.poznan.transformer.rest;


import org.springframework.web.bind.annotation.*;
import pl.put.poznan.transformer.logic.DataToSort;
import pl.put.poznan.transformer.logic.InsertionSort;

import java.util.Arrays;

@RestController
public class InsertionSortController {

    private long[] arr_begin = {4, 3, 8, 1, 9, 5, 8, 2, 3, 0};
    private long[] copy = Arrays.copyOf(arr_begin, arr_begin.length);

    @GetMapping("/insertionsort")
    public InsertionSort insertion_sort(@RequestParam(value="depth", defaultValue = "-1")int depth) {
        String direction = "normal";
        return new InsertionSort(arr_begin, copy, direction, depth);
    }

    @GetMapping("/insertionsortreverse")
    public InsertionSort insertion_sort_rev(@RequestParam(value="depth", defaultValue = "-1")int depth) {
        String direction = "reverse";
        return new InsertionSort(arr_begin, copy, direction, depth);
    }

    @PostMapping("/addinsertiondata")
    void addData(@RequestBody DataToSort newDataToSort){

        arr_begin = newDataToSort.getArr();
        copy = Arrays.copyOf(arr_begin, arr_begin.length);
    }
}