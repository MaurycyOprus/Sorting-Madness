package pl.put.poznan.transformer.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.put.poznan.transformer.logic.QuickSort;

@RestController
public class QuickSortController {

    @GetMapping("/quicksort")
    public QuickSort quick_sort(@RequestParam(value="depth", defaultValue = "-1")int depth) {
        String direction = "normal";
        return new QuickSort(direction, depth);
    }
    @GetMapping("/quicksortreverse")
    public QuickSort quick_sort_rev(@RequestParam(value="depth", defaultValue = "-1")int depth) {
        String direction = "reverse";
        return new QuickSort(direction, depth);
    }
}