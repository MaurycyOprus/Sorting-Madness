package pl.put.poznan.transformer.rest;


import org.springframework.web.bind.annotation.*;
import pl.put.poznan.transformer.logic.BubbleSort;
import pl.put.poznan.transformer.logic.InsertionSort;
import pl.put.poznan.transformer.logic.QuickSort;
import pl.put.poznan.transformer.logic.SelectionSort;
import pl.put.poznan.transformer.logic.DataToSort;
import pl.put.poznan.transformer.logic.ErrorMessage;

import java.util.Arrays;


@RestController
public class SortController
{

    private static long[] arr_begin = {4, 3, 8, 1, 9, 5, 8, 2, 3, 0};
    private long[] copy = Arrays.copyOf(arr_begin, arr_begin.length);

    @GetMapping("/sort")
    public Object sort(@RequestParam(value="depth", defaultValue = "-1")int depth, @RequestParam(value="name", defaultValue = "insertion") String name)
    {
        String direction = "normal";
        if(arr_begin.length == 0)
        {
            return new ErrorMessage("List is empty");
        }
        else {
            if (name.equals("insertion"))
            {
                return new InsertionSort(Arrays.copyOf(arr_begin, arr_begin.length), copy, direction, depth);
            }
            else if(name.equals("bubble")){
                return new BubbleSort(Arrays.copyOf(arr_begin, arr_begin.length), copy, direction, depth);
            }
            else if(name.equals("selection")){
                return new SelectionSort(Arrays.copyOf(arr_begin, arr_begin.length), copy, direction, depth);
            }
            else{
                return new QuickSort(Arrays.copyOf(arr_begin, arr_begin.length), copy, direction, depth);
            }
        }
    }

    @GetMapping("/sortreverse")
    public Object bubble_sort_rev(@RequestParam(value="depth", defaultValue = "-1")int depth, @RequestParam(value="name", defaultValue = "insertion") String name) {
        String direction = "reverse";
        if(arr_begin.length == 0){
            return new ErrorMessage("List is empty");
        }
        else {
            if (name.equals("insertion"))
            {
                return new InsertionSort(Arrays.copyOf(arr_begin, arr_begin.length), copy, direction, depth);
            }
            else if(name.equals("bubble")){
                return new BubbleSort(Arrays.copyOf(arr_begin, arr_begin.length), copy, direction, depth);
            }
            else if(name.equals("selection")){
                return new SelectionSort(Arrays.copyOf(arr_begin, arr_begin.length), copy, direction, depth);
            }
            else{
                return new QuickSort(Arrays.copyOf(arr_begin, arr_begin.length), copy, direction, depth);
            }
        }
    }

    @PostMapping("/adddata")
    void addData(@RequestBody DataToSort newDataToSort){

        arr_begin = newDataToSort.getArr();
        copy = Arrays.copyOf(arr_begin, arr_begin.length);
    }
}
