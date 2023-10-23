package tools;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MyFileReader {

    public void readFile(String filePath) {
        ClassLoader classLoader = MyFileReader.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(filePath);

        if(inputStream != null) {
            try(BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
                String line;

                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        else {
            System.err.println("File not found");
        }
    }
}
