import java.io.File;
import java.io.InputStream;

import tools.MyFileReader;

public class CalorieCounter {

    //private MyFileReader reader = new MyFileReader();
    private static final String INPUT = "input/calories.txt";
    public static void main(String[] args) {

       MyFileReader reader = new MyFileReader();
       reader.readFile(INPUT);

    }


}
