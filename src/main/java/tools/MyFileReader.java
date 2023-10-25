package tools;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MyFileReader {

    public ArrayList<Integer> readFile(String filePath) {
        ClassLoader classLoader = MyFileReader.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(filePath);
        ArrayList<Integer> values = new ArrayList<>();

        if(inputStream != null) {
            try(BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
                String line;

                while ((line = reader.readLine()) != null) {
                    if(line.isEmpty()) {
                        values.add(null);
                    }
                    else {
                        values.add(Integer.parseInt(line));
                    }
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        else {
            System.err.println("File not found");
        }
        return values;
    }
}
