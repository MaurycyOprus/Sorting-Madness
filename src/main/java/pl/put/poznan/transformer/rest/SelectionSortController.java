package pl.put.poznan.transformer.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.put.poznan.transformer.logic.SelectionSort;

@RestController
public class SelectionSortController {

    private final int[] arr_begin = {64,25,12,22,11};

    @GetMapping("/selectionsort")
    public SelectionSort bubble_sort(@RequestParam(value="direction", defaultValue = "normal")String direction) {
        return new SelectionSort(arr_begin, direction);
    }
}