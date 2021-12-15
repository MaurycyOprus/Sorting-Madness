package main;

import java.io.IOException;
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONArray;

import java.io.FileReader;
import java.io.FileNotFoundException;
import org.json.simple.parser.ParseException;

public class ReadJSON {

    public static void readFile(String file) {
        JSONParser jsonParser = new JSONParser();
        try (FileReader reader = new FileReader(file))
        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);

            JSONArray IntList = (JSONArray) obj;
            System.out.println(IntList);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}

