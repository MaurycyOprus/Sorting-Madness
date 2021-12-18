package pl.put.poznan.transformer.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.put.poznan.transformer.logic.BubbleSort;

@RestController
public class BubbleSortController {

    @GetMapping("/bubblesort")
    public BubbleSort bubble_sort(@RequestParam(value="depth", defaultValue = "-1")int depth) {
        String direction = "normal";
        return new BubbleSort(direction, depth);
    }
    @GetMapping("/bubblesortreverse")
    public BubbleSort bubble_sort_rev(@RequestParam(value="depth", defaultValue = "-1")int depth) {
        String direction = "reverse";
        return new BubbleSort(direction, depth);
    }
}