package pl.put.poznan.transformer.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.put.poznan.transformer.logic.InsertionSort;

@RestController
public class InsertionSortController {

    @GetMapping("/insertionsort")
    public InsertionSort insertion_sort(@RequestParam(value="depth", defaultValue = "-1")int depth) {
        String direction = "normal";
        return new InsertionSort(direction, depth);
    }

    @GetMapping("/insertionsortreverse")
    public InsertionSort insertion_sort_rev(@RequestParam(value="depth", defaultValue = "-1")int depth) {
        String direction = "reverse";
        return new InsertionSort(direction, depth);
    }
}