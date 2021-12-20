package pl.put.poznan.transformer.app;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class ReadingArrayFromJSON {
    private long[] array;

    public ReadingArrayFromJSON() {
        //Creating a JSONParser object
        JSONParser jsonParser = new JSONParser();
        try {
            //Getting a path to a JSON file
            String filePath = new File("").getAbsolutePath();
            filePath = filePath.concat("\\src\\main\\resources\\json\\list.json");
            //Parsing the contents of the JSON file
            JSONObject jsonObject = (JSONObject) jsonParser.parse(new FileReader(filePath));
            //Retrieving the array
            JSONArray jsonArray = (JSONArray) jsonObject.get("input");
            this.array = new long[jsonArray.size()];
            //Iterating the contents of the array
            Iterator iterator = jsonArray.iterator();
            int i = 0;
            while(iterator.hasNext()) {
                long number = (Long)iterator.next();
                this.array[i] = number;
                i++;
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

    }


    public long[] getArray() {
        return array;
    }
}
