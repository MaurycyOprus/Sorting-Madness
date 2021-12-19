package main;

import pl.put.poznan.transformer.app.ReadingArrayFromJSON;

public class Main {

    public static void main(String[] args){
        ReadingArrayFromJSON json = new ReadingArrayFromJSON();
        for(int i = 0; i<json.getArray().length; i++){
            System.out.println(json.getArray()[i]);
        }
    }
}