package pl.put.poznan.transformer.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.put.poznan.transformer.logic.SelectionSort;

@RestController
public class SelectionSortController {

    @GetMapping("/selectionsort")
    public SelectionSort selection_sort(@RequestParam(value="depth", defaultValue = "-1")int depth) {
        String direction = "normal";
        return new SelectionSort(direction, depth);
    }

    @GetMapping("/selectionsortreverse")
    public SelectionSort selection_sort_rev(@RequestParam(value="depth", defaultValue = "-1")int depth) {
        String direction = "reverse";
        return new SelectionSort(direction, depth);
    }
}