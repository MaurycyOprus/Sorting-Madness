package pl.put.poznan.transformer.rest;


import org.springframework.web.bind.annotation.*;
import pl.put.poznan.transformer.logic.BubbleSort;
import pl.put.poznan.transformer.logic.DataToSort;
import pl.put.poznan.transformer.logic.ErrorMessage;

import java.util.Arrays;

@RestController
public class BubbleSortController {

    private static long[] arr_begin = {4, 3, 8, 1, 9, 5, 8, 2, 3, 0};
    private long[] copy = Arrays.copyOf(arr_begin, arr_begin.length);

    @GetMapping("/bubblesort")
    public Object bubble_sort(@RequestParam(value="depth", defaultValue = "-1")int depth) {
        String direction = "normal";
        if(arr_begin.length == 0){
            return new ErrorMessage("List is empty");
        }
        else {
            return new BubbleSort(Arrays.copyOf(arr_begin, arr_begin.length), copy, direction, depth);
        }
    }

    @GetMapping("/bubblesortreverse")
    public Object bubble_sort_rev(@RequestParam(value="depth", defaultValue = "-1")int depth) {
        String direction = "reverse";
        if(arr_begin.length == 0){
            return new ErrorMessage("List is empty");
        }
        else {
            return new BubbleSort(Arrays.copyOf(arr_begin, arr_begin.length), copy, direction, depth);
        }
    }

    @PostMapping("/addbubbledata")
    void addData(@RequestBody DataToSort newDataToSort){

        arr_begin = newDataToSort.getArr();
        copy = Arrays.copyOf(arr_begin, arr_begin.length);
    }
}