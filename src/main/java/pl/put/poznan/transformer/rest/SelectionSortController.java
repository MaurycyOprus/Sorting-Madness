package pl.put.poznan.transformer.rest;


import org.springframework.web.bind.annotation.*;
import pl.put.poznan.transformer.logic.DataToSort;
import pl.put.poznan.transformer.logic.ErrorMessage;
import pl.put.poznan.transformer.logic.SelectionSort;

import java.util.Arrays;

@RestController
public class SelectionSortController {

    private long[] arr_begin = {4, 3, 8, 1, 9, 5, 8, 2, 3, 0};
    private long[] copy = Arrays.copyOf(arr_begin, arr_begin.length);

    @GetMapping("/selectionsort")
    public Object selection_sort(@RequestParam(value="depth", defaultValue = "-1")int depth) {
        String direction = "normal";
        if(arr_begin.length == 0){
            return new ErrorMessage("List is empty");
        }
        else{
            return new SelectionSort(Arrays.copyOf(arr_begin, arr_begin.length),copy, direction, depth);
        }
    }

    @GetMapping("/selectionsortreverse")
    public Object selection_sort_rev(@RequestParam(value="depth", defaultValue = "-1")int depth) {
        String direction = "reverse";
        if(arr_begin.length == 0){
            return new ErrorMessage("List is empty");
        }
        else{
            return new SelectionSort(Arrays.copyOf(arr_begin, arr_begin.length),copy, direction, depth);
        }
    }

    @PostMapping("/addselectiondata")
    void addData(@RequestBody DataToSort newDataToSort){

        arr_begin = newDataToSort.getArr();
        copy = Arrays.copyOf(arr_begin, arr_begin.length);
    }
}