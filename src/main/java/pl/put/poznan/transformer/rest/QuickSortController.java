package pl.put.poznan.transformer.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.put.poznan.transformer.logic.QuickSort;

@RestController
public class QuickSortController {

    private final int[] arr_begin = {64,25,12,22,11};

    @GetMapping("/quicksort")
    public QuickSort bubble_sort(@RequestParam(value="direction", defaultValue = "normal")String direction) {
        return new QuickSort(arr_begin, direction);
    }
}