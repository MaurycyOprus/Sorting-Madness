package pl.put.poznan.transformer.rest;


import org.springframework.web.bind.annotation.*;
import pl.put.poznan.transformer.logic.BubbleSort;
import pl.put.poznan.transformer.logic.DataToSort;

import java.util.Arrays;

@RestController
public class BubbleSortController {

    private long[] arr_begin = {4, 3, 8, 1, 9, 5, 8, 2, 3, 0};
    private long[] copy = Arrays.copyOf(arr_begin, arr_begin.length);

    @GetMapping("/bubblesort")
    public BubbleSort bubble_sort(@RequestParam(value="depth", defaultValue = "-1")int depth) {
        String direction = "normal";
        return new BubbleSort(arr_begin,copy, direction, depth);
    }
    @GetMapping("/bubblesortreverse")
    public BubbleSort bubble_sort_rev(@RequestParam(value="depth", defaultValue = "-1")int depth) {
        String direction = "reverse";
        return new BubbleSort(arr_begin,copy, direction, depth);
    }

    @PostMapping("/addbubbledata")
    void addData(@RequestBody DataToSort newDataToSort){

        arr_begin = newDataToSort.getArr();
        copy = Arrays.copyOf(arr_begin, arr_begin.length);
    }
}